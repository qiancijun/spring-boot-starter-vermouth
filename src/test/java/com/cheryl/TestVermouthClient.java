package com.cheryl;

import com.cheryl.vermouth.VermouthGrpcClient;
import org.junit.Test;

/**
 * @author Cheryl 769303522@qq.com
 */

public class TestVermouthClient {
    @Test
    public void testVermouthClient() {
        VermouthGrpcClient client = new VermouthGrpcClient();
        client.connect("localhost:9229");
        try {
            client.registeToVermouth(9090, "/java", "round-robin", "127.0.0.1:8888");
            client.cancel();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

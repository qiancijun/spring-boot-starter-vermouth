package com.cheryl.vermouth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

/**
 * @author Cheryl 769303522@qq.com
 */

public class VermouthCancelTask implements CommandLineRunner {
    @Autowired
    private VermouthGrpcClient client;
    @Override
    public void run(String... args) throws Exception {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> client.cancel()));
    }
}

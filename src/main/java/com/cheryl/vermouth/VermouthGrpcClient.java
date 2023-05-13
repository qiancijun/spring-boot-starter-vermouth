package com.cheryl.vermouth;

import com.cheryl.pb.VermouthGrpcGrpc;
import com.cheryl.pb.VermouthRpcService;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Cheryl 769303522@qq.com
 */

public class VermouthGrpcClient extends VermouthGrpcGrpc.VermouthGrpcImplBase {
    private ManagedChannel channel;
    private VermouthGrpcGrpc.VermouthGrpcBlockingStub stub;
    private long port;
    private String prefix;
    private String localAddr;

    public VermouthGrpcClient() {
    }

    public void connect(String vermouthAddr) {
        this.channel = ManagedChannelBuilder.forTarget(vermouthAddr).usePlaintext().build();
        this.stub = VermouthGrpcGrpc.newBlockingStub(this.channel);
    }

    public void registeToVermouth(long port, String prefix, String balanceMode, String localAddr) {
        prefix = "/" + prefix;
        VermouthRpcService.RegisterToProxyReq registerToProxyReq = VermouthRpcService.RegisterToProxyReq
                .newBuilder()
                .setPort(port)
                .setPrefix(prefix)
                .setBalanceMode(balanceMode)
                .setLocalAddr(localAddr)
                .build();
        VermouthRpcService.Res res = this.stub.registerToProxy(registerToProxyReq);
        if (!res.getMessage().equals("success")) {
            System.out.println("failed");
        }
        this.port = port;
        this.prefix = prefix;
        this.localAddr = localAddr;
    }

    public void cancel() {
        VermouthRpcService.CancalReq cancalReq = VermouthRpcService.CancalReq.newBuilder()
                .setPort(this.port)
                .setPrefix(this.prefix)
                .setLocalAddr(this.localAddr)
                .build();
        VermouthRpcService.Res res = this.stub.cancel(cancalReq);
        if (!res.getMessage().equals("success")) {
            System.out.println("failed");
        }
    }
}

package com.cheryl.config;

import com.cheryl.vermouth.VermouthGrpcClient;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author Cheryl 769303522@qq.com
 */

@Configuration
public class VermouthConfiguration implements ApplicationContextAware {
    @Value("${server.port}")
    private int serverPort;
    @Resource
    private VermouthProperties properties;

    private ApplicationContext context;


    @PostConstruct
    public void connectToVermouth() {
        VermouthGrpcClient client = this.context.getBean(VermouthGrpcClient.class);
        client.connect(properties.getConnectString());
        String lAddr = properties.getLocalAddress() + ":" + serverPort;
        client.registeToVermouth(properties.getPort(), properties.getPrefix(), "round-robin", lAddr);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}

package com.example.demozjrocketmq;

import org.apache.rocketmq.common.UtilAll;
import org.apache.rocketmq.remoting.common.RemotingUtil;

public class TestMain {
    public static void main(String[] args) {
       System.out.println( RemotingUtil.getLocalAddress());
        System.out.println(UtilAll.timeMillisToHumanString());
    }
}

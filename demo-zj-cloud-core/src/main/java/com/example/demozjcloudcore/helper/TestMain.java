package com.example.demozjcloudcore.helper;

public class TestMain {
    public static void main(String[] args) {
        System.out.println(ZJDateUtil.parseDate(ZJDateUtil.formatDate(ZJDateUtil.now(),ZJDateUtil.FORMAT_TYPE_1),ZJDateUtil.FORMAT_TYPE_2));


    }
}
package com.example.demozjcloudcore.helper;

import java.io.File;

public class TestMain {
    public static void main(String[] args) {
        File f = new File("d:/");
        for (File file : f.listFiles()) {
            System.out.println(file.getName());
        }

    }
}
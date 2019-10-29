package com.example.demojavasdk.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CSVDemo {
    public static void main(String[] args) throws IOException {
//        long start = Clock.systemDefaultZone().millis();
//        Path csvPath = Paths.get("E:\\下载\\100000 Sales Records.csv");
//        List<List<String>> master = Files.lines(csvPath)
//                .skip(1).parallel()
//                .map(line -> Arrays.asList(line.split(",")))
//                .collect(Collectors.toList());
//        long pad = Clock.systemDefaultZone().millis() - start;
//        System.out.println("time used:" + pad + "==and the file size is :" + master.size());
        Duration l = Duration.between(LocalDateTime.now(), LocalDateTime.now().plusDays(-1));
        System.out.println(Month.from(LocalDateTime.now().plusMonths(-1L)).getValue());
    }
}

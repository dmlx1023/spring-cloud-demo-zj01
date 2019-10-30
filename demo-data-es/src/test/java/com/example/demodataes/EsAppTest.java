package com.example.demodataes;

import com.alibaba.fastjson.JSON;
import com.example.demodataes.config.EsConfiguration;
import com.example.demodataes.dto.Tests;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {EsConfiguration.class}) // 指定启动类
public class EsAppTest {

    @Autowired
    private RestHighLevelClient client;

    public static String INDEX_TEST = null;
    public static String TYPE_TEST = null;
    public static Tests tests = null;
    public static List<Tests> testsList = null;

    @BeforeClass
    public static void before() {
        INDEX_TEST = "index_test"; // 索引名称
        TYPE_TEST = "type_test"; // 索引类型
        testsList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            tests = new Tests();
            tests.setId(Long.valueOf(i));
            tests.setName("this is the test " + i);
            testsList.add(tests);
        }
    }

    @Test
    public void testIndex() throws IOException {
        CreateIndexRequest request = new CreateIndexRequest("indexuser");
        CreateIndexResponse createIndexResponse = client.indices().create(request,RequestOptions.DEFAULT);
        System.out.println("createIndex: " + JSON.toJSONString(createIndexResponse));


    }
    @Test
    public void delIndex() throws IOException {
        // 1、创建请求参数
        DeleteIndexRequest request = new DeleteIndexRequest("test");
        // 2. 执行删除操作
        AcknowledgedResponse deleteIndexResponse = client.indices().delete(request, RequestOptions.DEFAULT);
        // 3、处理响应
        boolean acknowledged = deleteIndexResponse.isAcknowledged();
        System.out.println("acknowledged = " + acknowledged);
        //4.关闭RestHighLevelClient
        client.close();

    }

}
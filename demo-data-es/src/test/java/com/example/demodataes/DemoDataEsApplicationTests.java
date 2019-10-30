package com.example.demodataes;

import com.alibaba.fastjson.JSON;
import com.example.demodataes.dto.News;
import org.apache.http.HttpHost;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.*;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoDataEsApplicationTests {
    RestHighLevelClient client;
    private String index;

    private String type;

    @Before
    public void before() {
        client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("localhost", 9200, "http")));
        index = "demo";
        type = "demo";
    }

    @Test
    public void contextLoads() throws IOException {

        CreateIndexRequest request = new CreateIndexRequest("index-user");
        CreateIndexResponse createIndexResponse = client.indices().create(request, RequestOptions.DEFAULT);
        System.out.println("createIndex: " + JSON.toJSONString(createIndexResponse));
    }

    @Test
    public void batchAddTest() {
        BulkRequest bulkRequest = new BulkRequest();
        List<IndexRequest> requests = generateRequests();
        for (IndexRequest indexRequest : requests) {
            bulkRequest.add(indexRequest);
        }
        try {
            client.bulk(bulkRequest, RequestOptions.DEFAULT);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public List<IndexRequest> generateRequests() {
        List<IndexRequest> requests = new ArrayList<>();
        requests.add(generateNewsRequest("中印边防军于拉达克举行会晤 强调维护边境和平", "军事", "2018-01-27T08:34:00Z"));
        requests.add(generateNewsRequest("费德勒收郑泫退赛礼 进决赛战西里奇", "体育", "2018-01-26T14:34:00Z"));
        requests.add(generateNewsRequest("欧文否认拿动手术威胁骑士 兴奋全明星联手詹皇", "体育", "2018-01-26T08:34:00Z"));
        requests.add(generateNewsRequest("皇马官方通告拉莫斯伊斯科伤情 将缺阵西甲关键战", "体育", "2018-01-26T20:34:00Z"));
        return requests;
    }

    public IndexRequest generateNewsRequest(String title, String tag, String publishTime) {
        IndexRequest indexRequest = new IndexRequest(index, type);
        News news = new News();
        news.setTitle(title);
        news.setTag(tag);
        news.setPublishTime(publishTime);
        String source = JSON.toJSONString(news);
        indexRequest.source(source, XContentType.JSON);
        return indexRequest;
    }


    @Test
    public void queryTest(){
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
        sourceBuilder.from(0);
        sourceBuilder.size(10);
        sourceBuilder.fetchSource(new String[]{"title"}, new String[]{});
        MatchQueryBuilder matchQueryBuilder = QueryBuilders.matchQuery("title", "费德勒");
        TermQueryBuilder termQueryBuilder = QueryBuilders.termQuery("tag", "体育");
        RangeQueryBuilder rangeQueryBuilder = QueryBuilders.rangeQuery("publishTime");
        rangeQueryBuilder.gte("2018-01-26T08:00:00Z");
        rangeQueryBuilder.lte("2018-01-26T20:00:00Z");
        BoolQueryBuilder boolBuilder = QueryBuilders.boolQuery();
        boolBuilder.must(matchQueryBuilder);
//        boolBuilder.must(termQueryBuilder);
//        boolBuilder.must(rangeQueryBuilder);
        sourceBuilder.query(boolBuilder);
        SearchRequest searchRequest = new SearchRequest(index);
        searchRequest.types(type);
        searchRequest.source(sourceBuilder);
        try {
            SearchResponse response = client.search(searchRequest,RequestOptions.DEFAULT);
            System.out.println(response);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

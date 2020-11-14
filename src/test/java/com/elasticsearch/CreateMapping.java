package com.elasticsearch;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CreateMapping {
    @Test
    //创建映射
    public void test1() throws Exception{
        /// 创建Client连接对象
        //Settings settings = Settings.builder().put("cluster.name", "my‐elasticsearch").build();
        //TransportClient client = new PreBuiltTransportClient(settings)        .addTransportAddress(newInetSocketTransportAddress(InetAddress.getByName("192.168.179.128"),9300));
        // 添加映射
        /**
         * 格式：
         * "mappings" : {
         "article" : {
         "dynamic" : "false",
         "properties" : {
         "id" : { "type" : "string" },
         "content" : { "type" : "string" },
         "author" : { "type" : "string" }
         }
         }
         }*/
        /*XContentBuilder builder = XContentFactory.jsonBuilder()
                .startObject()
                .startObject("article")
                .startObject("properties")
                .startObject("id")
                .field("type", "integer"
                        .field("store", "yes")
                        .endObject()
                        .startObject("title")
                        .field("type", "string")
                        .field("store", "yes")
                        .field("analyzer", "ik_smart")
                        .endObject()
                        .startObject("content")
                        .field("type", "string")
                        .field("store", "yes")
                        .field("analyzer", "ik_smart")
                        .endObject()
                        .endObject()
                        .endObject()
                        .endObject();
        // 创建映射
        PutMappingRequestmapping = Requests.putMappingRequest("blog2")
                .type("article").source(builder);
        client.admin().indices().putMapping(mapping).get();
        //释放资源
        client.close();
*/

    }
}

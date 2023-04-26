//package com.digitalinovation.experts.config;
//
//import java.net.InetAddress;
//import java.net.UnknownHostException;
//
//import org.elasticsearch.client.Client;
//import org.elasticsearch.client.transport.TransportClient;
//import org.elasticsearch.common.settings.Settings;
//import org.elasticsearch.common.transport.TransportAddress;
//import org.elasticsearch.transport.client.PreBuiltTransportClient;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
//
//
//
//@Configuration
//public class ElasticsConfig {
//	  @Value("${elasticsearch.host:localhost}")
//	    private String host;
//
//	    @Value("${elasticsearch.port:9300}")
//	    private int port;
//
//	    @Bean
//	    public ElasticsearchTemplate elasticsearchTemplate() throws UnknownHostException {
//	        Settings settings = Settings.builder()
//	                .put("cluster.name", "my-cluster")
//	                .build();
//	        Client client = new PreBuiltTransportClient(settings)
//	                .addTransportAddress(new TransportAddress(InetAddress.getByName(host), port));
//	        return new ElasticsearchTemplate(client);
//	    }
//	
//}

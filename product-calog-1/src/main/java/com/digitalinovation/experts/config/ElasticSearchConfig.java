package com.digitalinovation.experts.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.digitalinovation.experts.repository")
public class ElasticSearchConfig extends AbstractElasticsearchConfiguration {

}

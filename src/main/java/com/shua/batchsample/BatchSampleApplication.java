package com.shua.batchsample;

import org.springframework.batch.core.configuration.annotation.DefaultBatchConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class BatchSampleApplication extends DefaultBatchConfigurer {

    @Override
    public void setDataSource(DataSource dataSource) {
        // 여기를 비워놓는다
    }

    public static void main(String[] args) {
        SpringApplication.run(BatchSampleApplication.class, args);
    }
}

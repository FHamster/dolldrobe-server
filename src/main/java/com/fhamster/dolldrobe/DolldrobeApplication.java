package com.fhamster.dolldrobe;

//import com.github.pagehelper.PageHelper;
import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.activation.DataSource;
import java.util.Properties;

@SpringBootApplication
@MapperScan("com/fhamster/dolldrobe/dao")
public class DolldrobeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DolldrobeApplication.class, args);
	}


}

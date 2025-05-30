package cn.dk.chord;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@MapperScan("cn.dk.chord.mapper")
@SpringBootApplication
public class ChordApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChordApplication.class, args);
		log.info("hello world");
	}

}

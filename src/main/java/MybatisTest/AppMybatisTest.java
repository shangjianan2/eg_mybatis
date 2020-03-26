package MybatisTest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("MybatisTest.dao")
public class AppMybatisTest {
    public static void main(String[] args) {
        SpringApplication.run(AppMybatisTest.class, args);
    }
}

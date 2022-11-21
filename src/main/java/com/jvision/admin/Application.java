package com.jvision.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //스프링 부트 자동 설정(내장 톰캣), Bean 읽기와 생성 자동 설정 --< 항상 프로젝트 최상단 위치
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class); //톰캣 메모리 로드 --> 서버 실행
    }
}

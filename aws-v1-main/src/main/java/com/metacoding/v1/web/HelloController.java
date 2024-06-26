package com.metacoding.v1.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HelloController {


    @GetMapping("/aws/v1")
    public String hello(@RequestParam(defaultValue = "1") Integer number){
		String str = "<h1>number 값이 "+number+"로 요청했습니다.</h1>";
        if(number == 1){ // info 로그
            log.info("/aws/v1 이 호출되었어요. info 로그 #####################################");
        }else if(number == -1){ // error 로그
            log.error("/aws/v1 이 호출되었어요. error 로그 #####################################");
        }else if(number == 0){ // warn 로그
            log.warn("/aws/v1 이 호출되었어요. warn 로그 #####################################");
			str = "<h2 style='color:blue'> ubuntu server 설치중... </h2>";
        }
		
        //return "<h2>aws v1</h2>";
		return str;
    }
}

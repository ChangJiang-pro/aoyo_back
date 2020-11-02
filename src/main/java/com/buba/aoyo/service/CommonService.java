package com.buba.aoyo.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 公共业务层
 */
@Service
@EnableAsync
public class CommonService {

    @Autowired
    private ObjectMapper objectMapper;

    /**
     * 将信息响应回去
     * @param response
     * @param message
     */
    public void print(HttpServletResponse response, Object message){
        try {
            response.setStatus(HttpStatus.OK.value());
            response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
            response.setHeader("Cache-Control", "no-cache, must-revalidate");
            PrintWriter writer = response.getWriter();
            writer.write(objectMapper.writeValueAsString(message));
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




   /* @Async
    public void saveLog(Log log){

        try {

            logMapper.insLogInfo(log);
        }catch (Exception e){

            e.printStackTrace();
        }

    }*/

}

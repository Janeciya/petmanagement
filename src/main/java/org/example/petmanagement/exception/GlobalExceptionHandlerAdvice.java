package org.example.petmanagement.exception;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.petmanagement.dto.ResponseMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice   //全域錯誤攔截器 統一處理回應
public class GlobalExceptionHandlerAdvice {

    //建立 logger
    Logger log = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler({Exception.class})  //針對某個錯誤做處理 此處為所有
    public ResponseMessage exceptionHandler(Exception ex, HttpServletRequest request, HttpServletResponse response){ //Exception 處裡錯誤的參數

        //記錄錯誤log
        log.error("統一錯誤", ex);
        return new ResponseMessage(500, "error", null);
    }
}

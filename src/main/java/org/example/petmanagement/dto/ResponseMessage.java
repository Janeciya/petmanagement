package org.example.petmanagement.dto;

import org.springframework.http.HttpStatus;

public class ResponseMessage<T> {
    private int code;
    private String message;
    private T data;     //回傳資料

    //建構子: 建立物件時 欄位初始化
    public ResponseMessage(int code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    //controller請求成功 統一response
    public static <T> ResponseMessage<T> success(T data){
        //回傳
        return new ResponseMessage(HttpStatus.OK.value(), "success", data);
    }//return 只能回傳一個值/物件 建立物件包含code message data

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

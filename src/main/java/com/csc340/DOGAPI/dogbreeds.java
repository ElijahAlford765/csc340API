package com.csc340.DOGAPI;

import java.util.List;
import java.util.Map;

public class dogbreeds {
    public Map<String, List<String>> message;
    public String status;


    public Map<String, List<String>> getMessage(){
        return message;
    }
    public void setMessage(Map<String, List<String>> message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

package com.snhu.sslserver;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class SslServerController {

    private static final String data = "Hello World Check Sum!";

    @GetMapping("/checkSum")
    public String getCheckSum() {
        return data;
    }
}

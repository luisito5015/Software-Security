package com.snhu.sslserver;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class SslserverController {

    private static final String data = "Hello Luis Cotto Check Sum!";

    @GetMapping("/checkSum")
    public String getCheckSum() {
        return data;
    }
}
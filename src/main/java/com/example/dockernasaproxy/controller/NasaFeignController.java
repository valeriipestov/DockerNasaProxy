package com.example.dockernasaproxy.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "${nasa.feign.name}", url = "${nasa.feign.url}")
public interface NasaFeignController {

    @GetMapping("/mars/pictures/largest")
    byte[] getLargestPic(@RequestParam Integer sol, @RequestParam(required = false) String camera);

}

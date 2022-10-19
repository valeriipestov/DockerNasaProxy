package com.example.dockernasaproxy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dockernasaproxy.service.PictureService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class NasaController {

    private final PictureService pictureService;

    @GetMapping(value = "/mars/pictures/largest", produces = "image/jpeg")
    public byte[] getLargestPicture(@RequestParam Integer sol, @RequestParam(required = false) String camera) {
        return pictureService.getLargestPicture(sol, camera);
    }
}

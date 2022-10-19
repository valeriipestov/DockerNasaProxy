package com.example.dockernasaproxy.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.dockernasaproxy.controller.NasaFeignController;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PictureService {

    private final NasaFeignController nasaFeignController;

    @Cacheable(value = "largest")
    public byte[] getLargestPicture(Integer sol, String camera) {
        return nasaFeignController.getLargestPic(sol, camera);
    }
}

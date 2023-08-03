package com.aditya.booking.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ImageHttpController {

    @GetMapping("/getImage/{cineName}")
    public ResponseEntity<byte[]> getImage(@PathVariable String cineName) {
        var image = new ClassPathResource("/static/assets/images/"+cineName);
        System.out.println("hello get image");
        byte[] bytes;
        try {
            bytes = StreamUtils.copyToByteArray(image.getInputStream());
        } catch (IOException e) {
            // Handle the exception appropriately
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(bytes);
    }
}

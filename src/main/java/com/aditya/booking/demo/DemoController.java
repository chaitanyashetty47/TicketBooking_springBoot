package com.aditya.booking.demo;

import org.apache.coyote.Response;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;

@RestController
@RequestMapping("/api/v1/demo-controller")
public class DemoController {

    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello from secured endpoint");
    }

    @GetMapping("/getImage/{imageName}")
    public ResponseEntity<byte[]>getImage(@PathVariable String imageName) throws IOException {
        Resource resource = (Resource) new ClassPathResource("static/assets/images/" + imageName);
        System.out.println("Inside end point");
        if (resource.exists()) {
            byte[] imageBytes = Files.readAllBytes(resource.getFile().toPath());

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.IMAGE_JPEG); // Adjust the content type if your image is in a different format
            System.out.println("File exists");
            return new ResponseEntity<>(imageBytes, headers, HttpStatus.OK);
        }
        else {
            System.out.println("File doesnt exists");
            return ResponseEntity.notFound().build();
        }
    }
}

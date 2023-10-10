package com.example.javamailsender.controller;

import com.example.javamailsender.model.MailDto;
import com.example.javamailsender.service.MailService;
import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequiredArgsConstructor
@RequestMapping("/api")
public class EmailController {

    private final MailService mailService;

    @PostMapping("/saveData")
    public void postData(@RequestBody MailDto mailDTO) throws MessagingException {
            mailService.saveData(mailDTO);
    }

    @GetMapping("/getAllData")
    public ResponseEntity<?> getAllData(){
       return ResponseEntity.ok(mailService.getAllData());
    }
}

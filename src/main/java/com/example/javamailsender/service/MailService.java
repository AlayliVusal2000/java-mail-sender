package com.example.javamailsender.service;

import com.example.javamailsender.dao.entity.MailEntity;
import com.example.javamailsender.dao.repo.MailRepository;
import com.example.javamailsender.model.dto.MailDto;
import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class MailService {

    private final MailRepository yourRepository;

    private final ModelMapper modelMapper;

    private final EmailService emailService;

    public void saveData(MailDto mailDto) throws MessagingException {
        MailEntity mailEntity = modelMapper.map(mailDto, MailEntity.class);
        emailService.sendMail(mailEntity.getRecipient(),
                mailEntity.getBody(),
                mailEntity.getSubject());
        mailEntity.setSentTime(LocalDateTime.now());
        log.info("Message sent successfully");
        yourRepository.save(mailEntity);
    }

    public List<MailDto> getAllData() {
        List<MailEntity> yourEntityList = yourRepository.findAll();
        return yourEntityList.stream().map(yourEntity -> modelMapper.map(yourEntity, MailDto.class)).toList();
    }

}
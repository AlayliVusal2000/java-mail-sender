package com.example.javamailsender.dao.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "mail")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String recipient;
    String subject;
    String body;
    LocalDateTime sentTime;
}

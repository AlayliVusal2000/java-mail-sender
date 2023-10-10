package com.example.javamailsender.model;//package com.example.javamailsender.model;
//
//import lombok.*;
//import lombok.experimental.FieldDefaults;
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@FieldDefaults(level = AccessLevel.PRIVATE)
//public class MailDTO {
//    String recipient;
//    String subject;
//    String body;
//}

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class MailDto {

    String recipient;
    String subject;
    String body;


}

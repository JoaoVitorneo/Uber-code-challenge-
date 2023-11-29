package com.dev.emailservice.core;

public interface EmailSenderUserCase {
    void SendEmail(String to, String subject, String body);
    
}

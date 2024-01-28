package com.example.test_project.service;



import com.example.test_project.domain.MailType;
import com.example.test_project.domain.user.User;

import java.util.Properties;

public interface MailService {

    void sendEmail(User user, MailType type, Properties params);

}

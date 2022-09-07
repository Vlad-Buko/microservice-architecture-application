package com.example.motoautoplanner.service;

import com.example.motoautoplanner.model.ConsumerLog;
import com.example.motoautoplanner.model.User;
import com.example.motoautoplanner.repository.IUserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by Vladislav Domaniewski
 */

@Service
@Slf4j
public class Producer {

    private static final String TOPIC = "users";
    protected final IUserRepository repo;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public Producer(IUserRepository repo) {
        this.repo = repo;
    }

    public void sendMessage(User user) {
        if (user.getName() == null || user.getDescription().isEmpty()) log.info("#### Empty name/description message");
        log.info("#### Producing message [user={}]", user);
        kafkaTemplate.send(TOPIC, "Writing in log -> " + user);
    }
}

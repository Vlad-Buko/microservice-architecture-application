package com.example.motoautoplanner.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

/**
 * Created by Vladislav Domaniewski
 */

@Data
@RequiredArgsConstructor
public class ConsumerLog {

    @JsonProperty("id")
    @JsonIgnoreProperties(ignoreUnknown = true)
    private final int id;

    @JsonProperty("message")
    @JsonIgnoreProperties(ignoreUnknown = true)
    private final String msg;

    @JsonProperty("topic")
    @JsonIgnoreProperties(ignoreUnknown = true)
    private final String topic;

    @JsonProperty("logDate")
    @JsonIgnoreProperties(ignoreUnknown = true)
    private final LocalDate logDate;

    @Override
    public String toString() {
        return "Was added log [id=" + id + ", topic=" + topic + "log=" + msg + ", date=" +  logDate.toString() + "]";
    }
}

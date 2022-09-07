package com.example.motoautoplanner.repository;

import lombok.extern.slf4j.Slf4j;
import org.h2.message.DbException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Vladislav Domaniewski
 */

@Repository
@Slf4j
public class ConsumerLogRepository implements IConsumerLogRepository {

    private static final String SQL_SELECT_LIST = "SELECT id, message, date_time, topic FROM log";
    private static final String SQL_INSERT = "INSERT INTO log (message, date_time, topic) VALUES (?, ?, ?)";

    protected final static ConsumerMapper CONSUMER_LOG_MAPPER = new ConsumerMapper();

    protected final JdbcTemplate template;

    public ConsumerLogRepository(@Qualifier("demo") JdbcTemplate template) {
        this.template = template;
    }

    /**
     * Возвращает записи элемента из таблицы логов подписчика
     */
    @Override
    public List<ConsumerLog> getLogsList() throws DbException {
        return template.query(SQL_SELECT_LIST, CONSUMER_LOG_MAPPER);
    }

    /**
     * Заполняет записи элементами из приходящего топика логов
     */
    @Override
    public void insert(ConsumerLog entity) throws DbException {
        var result = template.update(SQL_INSERT, entity.getMsg(), entity.getLogDate(), entity.getTopic());
        if (result != 1) log.trace("ConsumerLogRepository.insert() with {} rows inserted", entity);
        log.trace("insert({}) result={}", entity, result);
    }
}

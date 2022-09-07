package com.example.motoautoplanner.repository;

/**
 * Created by Vladislav Domaniewski
 */

public interface IConsumerLogRepository {

    /**
     * Возвращает список записей
     *
     * @return список всех записей
     * @throws DbException в случае ошибки БД
     */
    List<ConsumerLog> getLogsList();

    /**
     * Вставка новой записи
     *
     * @param entity новая запись
     * @throws DbException в случае ошибки БД
     */
    void insert(ConsumerLog entity);
}

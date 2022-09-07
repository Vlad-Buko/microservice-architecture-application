package com.example.motoautoplanner.repository;

import com.example.motoautoplanner.exceptions.DbException;
import com.example.motoautoplanner.model.User;

import java.util.List;

public interface IUserRepository {

    /**
     * Возвращает список записей по id
     *
     * @return запрашиваемая запись
     * @throws DbException в случае ошибки БД
     */
    User getById(int id);

    /**
     * Возвращает список записей
     *
     * @return список всех записей
     * @throws DbException в случае ошибки БД
     */
    List<User> getUserList();

    /**
     * Вставка новой записи
     *
     * @param entity новая запись
     * @throws DbException в случае ошибки БД
     */
    void insert(User entity);

    /**
     * Удаление записи
     *
     * @param entity удаляемая запись
     * @throws DbException в случае ошибки БД
     */
    void delete(User entity);
}

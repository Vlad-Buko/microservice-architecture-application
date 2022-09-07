package com.example.motoautoplanner.service;

import com.example.motoautoplanner.exceptions.NotFoundException;

import java.util.List;

/**
 * Created by Vladislav Domaniewski
 */

public class BaseService {

    /**
     * Обёртка результата
     *
     * @param result результат
     * @return результат
     * @throws NotFoundException если результат null
     */
    public <T> T wrapResult(T result) {
        if(result == null)
            throw new NotFoundException();
        return result;
    }

    /**
     * Обёртка результата
     *
     * @param result результат
     * @return результат
     * @throws NotFoundException если результат null или пустой
     */
    public <T> List<T> wrapResults(List<T> result) {
        if(result == null || result.size() == 0)
            throw new NotFoundException();
        return result;
    }

}

package com.part06.day43.code.two;

/**
 * @author aserendipper
 * @date 2023/7/31
 * @desc
 */
public interface SharedObjectStorage {

    IdGenerator load(Class<IdGenerator> idGeneratorClass);

    void save(IdGenerator idGenerator, Class<IdGenerator> idGeneratorClass);
}

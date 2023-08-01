package com.part06.day43.code.two;

/**
 * @author aserendipper
 * @date 2023/7/31
 * @desc
 */
public class FileSharedObjectStorage implements SharedObjectStorage {

    @Override
    public IdGenerator load(Class<IdGenerator> idGeneratorClass) {
        return null;
    }

    @Override
    public void save(IdGenerator idGenerator, Class<IdGenerator> idGeneratorClass) {
        
    }
}

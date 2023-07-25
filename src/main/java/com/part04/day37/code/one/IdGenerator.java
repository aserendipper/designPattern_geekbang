package com.part04.day37.code.one;

/**
 * @author aserendipper
 * @date 2023/7/24
 * @desc
 */
public interface IdGenerator {
    String generate() throws IdGenerationFailureException;
}

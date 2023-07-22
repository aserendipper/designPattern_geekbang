package com.part04.day33.code.three;

/**
 * @author aserendipper
 * @date 2023/7/22
 * @desc 不想重写方法，因此用abstract修饰
 */
public abstract class CourseServiceImpl implements CourseService {
    /**
     * 重构前的代码
      */
    public void test(long userId, long courseId) {
        boolean isVip = false;
        if (isVip) {
            buyCourseforVip(1, 1);
        } else {
            buyCourse(1, 1);
        }
    }

    /**
     * 重构后的代码
     */
    public void test1(long userId, long courseId) {
        boolean isVip = false;
        buyCourse(1, 1, isVip);
    }
}

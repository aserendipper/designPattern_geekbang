package com.part04.day33.code.three;

/**
 * @author aserendipper
 * @date 2023/7/22
 * @desc
 */
public interface CourseService {
    // 重构前的代码
    
    public void buyCourse(long userId, long courseId, boolean isVip);
    
    // 重构后的代码
    
    public void buyCourse(long userId, long courseId);
    public void buyCourseforVip(long userId, long courseId);
}

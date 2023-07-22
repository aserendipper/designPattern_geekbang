package com.part04.day33.code.two;

/**
 * @author aserendipper
 * @date 2023/7/22
 * @desc
 */
public interface BlogService {
    // 重构前的代码
    
    public void postBlog(String title, String summary, String keywords, String content, String category, long authorId);
    
    // 重构后的代码
    
    public void postBlog(Blog blog);
}

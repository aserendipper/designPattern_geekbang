package com.part02.day09.code.two;

import com.part02.day09.code.one.Image;

/**
 * @author aserendipper
 * @date 2023/6/21
 * @desc
 */
public class ImageProcessingJob {
    private static final String BUCKET_NAME = "ai_images_bucket";
    //...省略其他无关代码...
    
    
    public void process() {
        //处理图片，并封装为Image对象
        Image image = new Image();
        AliyunImageStore imageStore = new AliyunImageStore();
        imageStore.upload(image, BUCKET_NAME);
    }
}

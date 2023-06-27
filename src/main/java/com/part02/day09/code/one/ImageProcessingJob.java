package com.part02.day09.code.one;

/**
 * @author aserendipper
 * @date 2023/6/21
 * @desc
 */
public class ImageProcessingJob {
    private static final String BUCKET_NAME = "ai_images_bucket";

    public void process() {
        //处理图片，并封装为Image对象
        Image image = new Image();
        AliyunImageStore store = new AliyunImageStore();
        store.createBucketIfNotExisting(BUCKET_NAME);
        String accessToken = store.generateAccessToken();
        store.uploadToAliyun(image, BUCKET_NAME, accessToken);
    }
}

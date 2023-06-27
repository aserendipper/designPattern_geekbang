package com.part02.day09.code.two;

import com.part02.day09.code.one.Image;

/**
 * @author aserendipper
 * @date 2023/6/21
 * @desc
 */
public class PrivateImageStore implements ImageStore {

    @Override
    public String upload(Image image, String bucketName) {
        createBucketIfNotExisting(bucketName);
        //...上传图片到私有云...
        //...返回图片的url...
        return null;
    }

    @Override
    public Image download(String url) {
        //从私有云下载图片...
        return null;
    }
    
    private void createBucketIfNotExisting(String bucketName) {
        //创建bucket...
        //失败会抛出异常..
    }
}

package com.part02.day09.code.two;

import com.part02.day09.code.one.Image;

/**
 * @author aserendipper
 * @date 2023/6/21
 * @desc
 */
public interface ImageStore {
    String upload(Image image, String bucketName);
    Image download(String url);
}

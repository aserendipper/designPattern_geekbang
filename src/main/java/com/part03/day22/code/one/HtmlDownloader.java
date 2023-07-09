package com.part03.day22.code.one;

/**
 * @author aserendipper
 * @date 2023/7/8
 * @desc
 */
public class HtmlDownloader {
    private NetworkTransporter transporter;

    public Html downloadHtml(String url) {
        byte[] rawHtml = transporter.send(new HtmlRequest());
        return new Html(rawHtml);
    }
}

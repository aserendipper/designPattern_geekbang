package com.part03.day22.code.two;


import com.part03.day22.code.one.Html;
import com.part03.day22.code.one.HtmlRequest;

/**
 * @author aserendipper
 * @date 2023/7/8
 * @desc
 */
public class HtmlDownloader {
    private NetworkTransporter transporter;

    public Html downloadHtml(String url) {
        HtmlRequest htmlRequest = new HtmlRequest(url);
        byte[] rawHtml = transporter.send(htmlRequest.getAddress(), htmlRequest.getContent().getBytes());
        return new Html(rawHtml);
    }
}

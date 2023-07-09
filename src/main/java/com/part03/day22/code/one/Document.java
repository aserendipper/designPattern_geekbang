package com.part03.day22.code.one;

/**
 * @author aserendipper
 * @date 2023/7/8
 * @desc
 */
public class Document {
    private Html html;
    private String url;

    public Document(Html html, String url) {
        this.url = url;
        HtmlDownloader downloader = new HtmlDownloader();
        this.html = downloader.downloadHtml(url);
    }
}

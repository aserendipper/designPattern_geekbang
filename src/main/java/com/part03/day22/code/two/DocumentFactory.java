package com.part03.day22.code.two;

import com.part03.day22.code.one.Html;

/**
 * @author aserendipper
 * @date 2023/7/8
 * @desc
 */
public class DocumentFactory {
    private HtmlDownloader downloader;
    
    public DocumentFactory(HtmlDownloader downloader) {
        this.downloader = downloader;
    }
    
    public Document createDocument(String url) {
        Html html = downloader.downloadHtml(url);
        return new Document(html, url);
    }
    
}

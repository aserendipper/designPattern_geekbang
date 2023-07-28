package com.part05.day39.code.one;

import com.part03.day26.code.one.RequestStat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author aserendipper
 * @date 2023/7/26
 * @desc
 */
public class EmailViewer implements StatViewer {
    private EmailSender emailSender;
    private List<String> toAddresses = new ArrayList<>();
    
    public EmailViewer() {
        this.emailSender = new EmailSender();
    }
    
    public EmailViewer(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public EmailViewer(List<String> toAddresses) {
        this.toAddresses = toAddresses;
        emailSender = new EmailSender();
    }

    public void addToAddress(String address) {
        toAddresses.add(address);
    } 
    
    @Override
    public void output(Map<String, RequestStat> requestStatMap, long startTimeInMillis, long endTimeInMillis) {
        // format the requestStat to HTML style.
        // send it to email toAddresses.
    }
}

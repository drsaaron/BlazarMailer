/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blazartech.products.mail;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * a simple representation of a message to be mailed.
 * 
 * @author scott
 */
public class MailMessage implements Serializable {
    
    private final Collection<String> recipients = new ArrayList<>();

    /**
     * Get the value of recipients
     *
     * @return the value of recipients
     */
    public Collection<String> getRecipients() {
        return recipients;
    }
    
    public void addRecipient(String recipient) {
        recipients.add(recipient);
    }

    private String text;

    /**
     * Get the value of text
     *
     * @return the value of text
     */
    public String getText() {
        return text;
    }

    /**
     * Set the value of text
     *
     * @param text new value of text
     */
    public void setText(String text) {
        this.text = text;
    }

    private final Collection<String> copyRecipients = new ArrayList<>();

    /**
     * Get the value of copyRecipients
     *
     * @return the value of copyRecipients
     */
    public Collection<String> getCopyRecipients() {
        return copyRecipients;
    }
    
    public void addCopyRecipient(String cc) {
        copyRecipients.add(cc);
    }

    private String subject;

    /**
     * Get the value of subject
     *
     * @return the value of subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Set the value of subject
     *
     * @param subject new value of subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

}

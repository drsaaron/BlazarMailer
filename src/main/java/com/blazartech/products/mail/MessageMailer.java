/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blazartech.products.mail;

import javax.mail.MessagingException;

/**
 *
 * @author scott
 */
public interface MessageMailer {
    
    public void sendMessage(MailMessage message) throws MessagingException;
}

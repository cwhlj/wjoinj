package com.wjoinj.email.service;

import javax.mail.MessagingException;

/**
 * @Author chengwei
 * @Description:
 * @Date 2020/11/22 5:31 下午
 */
public interface EmailService {
    /**
     * 无附件 简单文本内容发送
     *
     * @param email   接收方email
     * @param subject 邮件内容主题
     * @param text    邮件内容
     */
    void sendSimpleMail(String email, String subject, String text);

    /**
     * 发送带附件的邮件
     *
     * @param email       接受人
     * @param subject  主题
     * @param text     发送内容
     * @param filePath 附件路径
     * @throws MessagingException           异常
     */
    void sendAttachmentMail(String email, String subject, String text, String filePath) throws MessagingException;

    /**
     * 发送html内容的 邮件
     *
     * @param email    接收方email
     * @param subject  主题
     * @param filePath 附件路径
     * @throws MessagingException 异常
     */
    void sendAttachmentPictureMail(String email, String subject, String filePath) throws MessagingException;
}

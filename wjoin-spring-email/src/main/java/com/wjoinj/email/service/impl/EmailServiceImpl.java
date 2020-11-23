package com.wjoinj.email.service.impl;

import com.wjoinj.email.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @Author chengwei
 * @Description:
 * @Date 2020/11/22 5:31 下午
 */
@Slf4j
@Service
public class EmailServiceImpl implements EmailService {
    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String from;

    /**
     * 无附件 简单文本内容发送
     *
     * @param email   接收方email
     * @param subject 邮件内容主题
     * @param text    邮件内容
     */
    @Override
    public void sendSimpleMail(String email, String subject, String text) {
        //创建邮件内容
        SimpleMailMessage message = new SimpleMailMessage();
        //这里指的是发送者的账号
        message.setFrom(from);
        message.setTo(email);
        message.setSubject(subject);
        message.setText(text);
        //发送邮件
        mailSender.send(message);
        log.info("发送给{}邮件,发送成功,邮件内容:{}", email, text);
    }

    /**
     * 发送带附件的邮件
     *
     * @param email    接受人
     * @param subject  主题
     * @param text     发送内容
     * @param filePath 附件路径
     * @throws MessagingException 异常
     */
    @Override
    public void sendAttachmentMail(String email, String subject, String text, String filePath) throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        // 设置utf-8或GBK编码，否则邮件会有乱码
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
        messageHelper.setFrom(from);
        messageHelper.setTo(email);
        messageHelper.setSubject(subject);
        messageHelper.setText(text, true);
        FileSystemResource file = new FileSystemResource(new File(filePath));
        String fileName = filePath.substring(filePath.lastIndexOf(File.separator) + 1);
        messageHelper.addAttachment(fileName, file);
        mailSender.send(mimeMessage);
        log.info("发送给{}邮件,发送成功,邮件内容:{}", email, text);
    }

    /**
     * 发送html内容的 邮件
     *
     * @param email    接收方email
     * @param subject  主题
     * @param filePath 附件路径
     * @throws MessagingException 异常
     */
    @Override
    public void sendAttachmentPictureMail(String email, String subject, String filePath) throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom(from);
        helper.setTo(email);
        helper.setSubject(subject);
        // 注意<img/>标签，src='cid:jpg'，'cid'是contentId的缩写，'jpg'是一个标记
        helper.setText("<html><body><img src=\"cid:jpg\"></body></html>", true);
        // 加载文件资源，作为附件
        FileSystemResource file = new FileSystemResource(new File(filePath));
        // 调用MimeMessageHelper的addInline方法替代成文件('jpg[标记]', file[文件])
        helper.addInline("jpg", file);
        // 发送邮件
        mailSender.send(mimeMessage);
    }
}

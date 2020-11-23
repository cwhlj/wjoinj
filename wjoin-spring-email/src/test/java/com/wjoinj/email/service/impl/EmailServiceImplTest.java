package com.wjoinj.email.service.impl;

import com.wjoinj.email.service.EmailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;

/**
 * @Author chengwei
 * @Description:
 * @Date 2020/11/22 5:43 下午
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class EmailServiceImplTest {
    @Autowired
    private EmailService emailService;


    @Test
    public void simpleMailSend() {
        emailService.sendSimpleMail("1193981244@qq.com", "模板邮件", "什么时候回家");
    }

    @Test
    public void sendAttachmentMail() throws MessagingException {
        emailService.sendAttachmentMail("1014488286@qq.com", "模板邮件带附件", "什么时候回家","/Users/chengwei/Documents/专业/程伟-Java工程师-18268258367.pdf");
    }

    @Test
    public void sendAttachmentPictureMail() throws MessagingException {
        emailService.sendAttachmentPictureMail("1014488286@qq.com", "模板邮件带图片", "/Users/chengwei/Documents/专业/WX20200414-115111@2x.png");
    }
}
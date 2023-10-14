package com.webapp.techmate;

import com.webapp.techmate.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class Mailsender {
    @Autowired
    private JavaMailSender javaMailSender;
    public void sendSimpleEmail(Contact contact) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("chandrajagdish812@gmail.com");
        message.setTo(contact.getEmail());
        message.setText("Dear "+contact.getFullname()+",\n\n"+
                "I hope this message finds you well. We want to express our sincere gratitude for connecting with Techmates. Your decision to engage with us is greatly appreciated, and we are excited about the potential collaboration ahead.\n\n"+
                "At Techmates, our core focus is on crafting exceptional software, applications, and websites that empower businesses and individuals to thrive in the digital age. We understand the critical role that technology plays in today's world, and we are committed to delivering innovative and customized solutions that meet your unique needs."+
                "Your decision to connect with us demonstrates your commitment to harnessing the power of technology for your projects and goals. We take this commitment seriously and are dedicated to providing you with top-notch services that drive success."+
                "We believe that effective communication is the key to a successful partnership. Please feel free to reach out at any time to discuss your specific requirements, ideas, or questions. Our team of experts is here to listen, advise, and support you every step of the way.\n\n"+
                "Once again, thank you for choosing Techmates as your technology partner. We look forward to the opportunity to collaborate with you and contribute to your success.\n"+
                "Warm regards,\n"+"\n\n"+
                "Jagdish Chandra\n"+
                "Freelancer\n"+
                "TechMate:https://techmate-by-jagdish.netlify.app/ \n"+
                "Phone: 7021442264\n"+
                "Instagram: https://google.com \n"+
                "Email: chandrajagdish812@gmail.com\n");
        message.setSubject("This mail is from Techmate.");
        javaMailSender.send(message);
        System.out.println("Mail Send...");
    }

    public void newUserContact(Contact contact){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("chandrajagdish812@gmail.com");
        message.setText(
                "Name: \s\s"+contact.getFullname()+"\n"+
                "Phone: \s"+contact.getPhone()+"\n"+
                "Email: \s"+contact.getEmail()+"\n"+
                "Messege: "+contact.getMessege()
        );
        message.setSubject("New User connected  with us");
        javaMailSender.send(message);
        System.out.println("Mail Send...");
    }

}

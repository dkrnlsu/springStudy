package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: ojh
 * Date: 13. 5. 2
 * Time: 오후 5:30
 * To change this template use File | Settings | File Templates.
 */
public class SpringXmlMain {
    public static void main(String[] args) {
        ApplicationContext factory = new GenericXmlApplicationContext("spring/applicationContext.xml");
        Client client1 = (Client)factory.getBean("client");
        Client client2 = (Client)factory.getBean("client");

        client1.biz("spring hahahah");
    }
}

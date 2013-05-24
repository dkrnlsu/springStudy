package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * User: ojh
 * Date: 13. 5. 20
 * Time: 오후 5:18
 * To change this template use File | Settings | File Templates.
 */
public class SpringAnnotationMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        Client client = (Client) context.getBean("client");
        client.biz("hi~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

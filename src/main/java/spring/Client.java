package spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created with IntelliJ IDEA.
 * User: ojh
 * Date: 13. 4. 22
 * Time: 오후 6:36
 * To change this template use File | Settings | File Templates.
 */

@Component
public class Client implements BeanNameAware, InitializingBean, ApplicationContextAware {
    @Autowired @Qualifier(value="logTimeProxy")
    private Log log;
    private ApplicationContext applicationContext;
    public Client() {
        System.out.println("생성자 log = " + log);
    }

    public void setLog(Log log) {
        System.out.println("=============setlog : " + log);
        this.log = log;
    }

    public void biz(String data) {
        log.write(data);
    }

    @PostConstruct  //init, afterpropertiesset과 동
    public void init() {
        System.out.println("init - log = " + log);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName - my bean name = " + name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet - log = " + log);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}

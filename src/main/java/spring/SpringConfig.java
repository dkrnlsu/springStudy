package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * User: ojh
 * Date: 13. 5. 20
 * Time: 오후 5:20
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class SpringConfig {
    @Autowired Log log;

    @Bean
    public Log log() {
        return new DefaultLog();
    }

    @Bean
    public Client client() {
        Client client = new Client();
        //client.setLog(log());
        client.setLog(logTimeProxy(log));

        return client;
    }

    @Bean
    public Log logTimeProxy(Log log) {
        LogTimeProxy logTimeProxy = new LogTimeProxy();
        logTimeProxy.setTargetLog(log);
        return logTimeProxy;
    }
}

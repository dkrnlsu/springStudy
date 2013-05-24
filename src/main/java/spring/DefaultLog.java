package spring;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: ojh
 * Date: 13. 4. 22
 * Time: 오후 6:39
 * To change this template use File | Settings | File Templates.
 */
@Component
public class DefaultLog implements Log {
    @Override
    public void write(String data) {
        System.out.println("data : " + data);
    }
}

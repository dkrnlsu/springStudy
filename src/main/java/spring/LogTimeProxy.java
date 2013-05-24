package spring;

import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

/**
 * User: ojh
 * Date: 13. 5. 20
 * Time: 오후 6:04
 * To change this template use File | Settings | File Templates.
 */
//@Component
public class LogTimeProxy implements Log {

    Log targetLog;

    public void setTargetLog(Log log) {
        this.targetLog = log;
    }

    @Override
    public void write(String data) {
        StopWatch watch = new StopWatch();
        watch.start();
        targetLog.write(data);
        watch.stop();
        System.out.println(watch.prettyPrint());
    }
}

package spring;

/**
 * Created with IntelliJ IDEA.
 * User: ojh
 * Date: 13. 4. 22
 * Time: 오후 6:36
 * To change this template use File | Settings | File Templates.
 */
public class Client {
    private Log log;

    public void setLog(Log log) {
        this.log = log;
    }

    public void biz(String data) {
        log.write(data);
    }
}
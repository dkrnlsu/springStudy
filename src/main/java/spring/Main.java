package spring;

/**
 * Created with IntelliJ IDEA.
 * User: ojh
 * Date: 13. 4. 22
 * Time: 오후 6:29
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        Log defaultLog = new DefaultLog();
        Log prettyLog = new PrettyLog();

        client.setLog(defaultLog);
        client.biz("Print DefaultLog");

        client.setLog(prettyLog);
        client.biz("Print PrettyLog");
    }
}

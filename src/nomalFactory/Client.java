package nomalFactory;

import util.XMLUtil;

/**
 * Created by fengyuwusong on 2017/11/6 10:37.
 */
public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className=XMLUtil.getName("/nomalFactory.xml");
        Class c=Class.forName(className);
        LoggerFactory factory= (LoggerFactory) c.newInstance();
        Logger logger=factory.createLogger();
        logger.writeLog();
    }
}

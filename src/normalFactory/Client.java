package normalFactory;

import util.PropertiesUtil;

/**
 * Created by fengyuwusong on 2017/11/6 10:37.
 */
public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className= PropertiesUtil.getString("/normalFactory.properties","className");
        Class c=Class.forName(className);
        LoggerFactory factory= (LoggerFactory) c.newInstance();
        Logger logger=factory.createLogger();
        logger.writeLog();
    }
}

package facade;

import util.PropertiesUtil;

/**
 * Created by fengyuwusong on 2017/11/7 16:52.
 */
public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c=Class.forName(PropertiesUtil.getString("/facade.properties","className"));
        AbstractClassFacade facade= (AbstractClassFacade) c.newInstance();
        //上课
        facade.start();
        //下课
        facade.end();
    }
}

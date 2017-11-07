package facade;

import util.XMLUtil;

/**
 * Created by fengyuwusong on 2017/11/7 16:52.
 */
public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c=Class.forName(XMLUtil.getName("/facade.xml"));
        AbstractClassFacade facade= (AbstractClassFacade) c.newInstance();
        //上课
        facade.start();
        //下课
        facade.end();
    }
}

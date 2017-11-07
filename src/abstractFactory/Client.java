package abstractFactory;

import util.XMLUtil;

/**
 * Created by fengyuwusong on 2017/10/31 16:52.
 */
public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        PlayMethodFactory factory;
        String className=XMLUtil.getName("/abstractFactory.xml");
        Class c=Class.forName(className);
        factory= (PlayMethodFactory)c.newInstance() ;
        factory.createHard();
        factory.createSimple();
    }
}

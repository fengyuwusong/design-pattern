package adapter;

import util.XMLUtil;

/**
 * Created by fengyuwusong on 2017/11/7 16:14.
 */
public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //对象适配器
        Class c = Class.forName(XMLUtil.getName("/objectAdapter.xml"));
        ZipCodeObjectAdapter adapter = (ZipCodeObjectAdapter) c.newInstance();
        System.out.println(adapter.findZipCode("12345"));
        System.out.println(adapter.zipCode(new int[]{1, 2, 3, 4, 5, 6}));

        //类适配器
        Class cc = Class.forName(XMLUtil.getName("/classAdapter.xml"));
        ZipCodeClassAdapter aa = (ZipCodeClassAdapter) cc.newInstance();
        System.out.println(aa.findZipCode("12345"));
        System.out.println(aa.zipCode(new int[]{1, 2, 3, 4, 5, 6}));

    }

}

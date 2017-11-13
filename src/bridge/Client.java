package bridge;

import util.PropertiesUtil;

/**
 * Created by fengyuwusong on 2017/11/8 11:10.
 */
public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Image image;
        ImageImp imageImp;
        Class cImageType= Class.forName(PropertiesUtil.getString("/bridge.properties","imageType"));
        Class cSystemClass=Class.forName(PropertiesUtil.getString("/bridge.properties","systemType"));

        image= (Image) cImageType.newInstance();
        imageImp= (ImageImp) cSystemClass.newInstance();
        image.setImageImp(imageImp);
        image.parseFile("png图片");
    }
}

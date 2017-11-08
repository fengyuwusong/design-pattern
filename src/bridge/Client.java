package bridge;

/**
 * Created by fengyuwusong on 2017/11/8 11:10.
 */
public class Client {
    public static void main(String[] args) {

        //todo 改用yml配置文件实现
        Image image;
        ImageImp imageImp;
        image=new PNGImage();
        imageImp=new LinuxImp();
        image.setImageImp(imageImp);
        image.parseFile("png图片");
    }
}

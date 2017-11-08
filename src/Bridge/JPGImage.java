package Bridge;

/**
 * JPG格式图像：扩充抽象类
 * Created by fengyuwusong on 2017/11/8 11:04.
 */
public class JPGImage extends Image {
    @Override
    public void parseFile(String fileName) {
        //模拟解析JPG文件并获得一个像素矩阵对象m
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + ",格式JPG");
    }
}

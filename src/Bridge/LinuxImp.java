package Bridge;

/**
 * Created by fengyuwusong on 2017/11/8 11:01.
 */
public class LinuxImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        //调用linux系统的绘制桉树绘制像素矩阵
        System.out.println("在linux操作系统中显示图像:");
    }
}

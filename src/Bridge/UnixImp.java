package Bridge;

/**
 * Created by fengyuwusong on 2017/11/8 11:03.
 */
public class UnixImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        //调用unix系统的绘制函数绘制像素矩阵
        System.out.println("在unix操作系统中显示图像:");
    }
}

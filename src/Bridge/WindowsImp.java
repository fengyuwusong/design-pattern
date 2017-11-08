package bridge;

/**
 * Created by fengyuwusong on 2017/11/8 11:00.
 */
public class WindowsImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        //调用windows系统的绘制函数绘制像素矩阵
        System.out.println("在windows操作系统中显示图像:");
    }
}

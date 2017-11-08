package Bridge;

/**
 * 抽象图像类：抽象类
 * Created by fengyuwusong on 2017/11/8 10:06.
 */
abstract class Image {
    protected ImageImp imp;
    public void setImageImp(ImageImp imp){
        this.imp=imp;
    }
    public abstract void parseFile(String fileName);
}

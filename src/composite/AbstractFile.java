package composite;

/**
 * 抽象文件类：抽象构件 透明模式
 * 如果使用安全模式则将接口方法add、 remove、 getChild不通用方法移除
 * Created by fengyuwusong on 2017/11/8 11:30.
 */
public abstract class AbstractFile {
    public abstract void add(AbstractFile file);
    public abstract void remove(AbstractFile file);
    public abstract AbstractFile getChild(int i);
    public abstract void killVirus();
}

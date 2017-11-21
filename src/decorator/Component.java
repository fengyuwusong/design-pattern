package decorator;

/**
 * 抽象构件类
 * Created by fengyuwusong on 2017/11/21 15:59.
 */
public abstract class Component {
    //确定主食种类
    public abstract void display();
    //确定价格
    public abstract int money();
}

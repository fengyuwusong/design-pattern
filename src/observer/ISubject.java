package observer;

/**
 * Created by fengyuwusong on 2017/12/5 16:07.
 */
public interface ISubject {
    //添加观察者
    public void registerObserver(IBoy o);
    //移除观察者
    public void removeObserver(IBoy o);
    //主题状态改变时调用方法
    public void notifyObservers();
}

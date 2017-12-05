package observer;

import java.util.ArrayList;

/**
 * Created by fengyuwusong on 2017/12/5 16:11.
 */
public class Girl implements ISubject {
//    记录观察者
    private ArrayList<IBoy> boys;
    private String status;

    public Girl(){
        boys=new ArrayList<>();
    }
    @Override
    public void registerObserver(IBoy o) {
        boys.add(o);
    }

    @Override
    public void removeObserver(IBoy o) {
        boys.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(IBoy boy:boys){
            boy.update(status);
        }
    }

//    当状态变化是调用该方法
    private void measurementsChanged(){
        System.out.println("我更新了最新状态哦-状态:"+status);
        notifyObservers();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        measurementsChanged();
    }


}

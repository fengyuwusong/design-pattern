package observer;

/**
 * Created by fengyuwusong on 2017/12/5 16:17.
 */
public class Boy implements IBoy {

    private String girlStatus;
    private ISubject girl;

    public Boy(ISubject girl) {
        this.girl = girl;
        girl.registerObserver(this);
    }

    @Override
    public void update(String status) {
//        接收最新状态
        this.girlStatus = status;
        System.out.println("男孩：我接受到了最新状态:" + girlStatus);
    }
}

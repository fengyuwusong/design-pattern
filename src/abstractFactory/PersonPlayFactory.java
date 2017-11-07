package abstractFactory;

/**
 * Created by fengyuwusong on 2017/10/31 16:47.
 */
public class PersonPlayFactory implements PlayMethodFactory {
    private PlayMethod playMethod=new PersonPlay();
    @Override
    public void createSimple() {
        playMethod.playMethod();
        Level simple=new SimpleLevel();
        simple.level();
    }

    @Override
    public void createHard() {
        playMethod.playMethod();
        Level hard=new HardLevel();
        hard.level();
    }
}

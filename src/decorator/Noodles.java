package decorator;

/**
 * Created by fengyuwusong on 2017/11/21 16:03.
 */
public class Noodles extends Component{
    @Override
    public void display() {
        System.out.println("素面");
    }

    @Override
    public int money() {
        return 10;
    }
}

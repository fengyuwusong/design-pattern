package decorator;

/**
 * Created by fengyuwusong on 2017/11/21 16:05.
 */
public class FriedRiceNoodles extends Component {
    @Override
    public void display() {
        System.out.println("素粉");
    }

    @Override
    public int money() {
        return 9;
    }
}

package decorator;

/**
 * Created by fengyuwusong on 2017/11/21 16:08.
 */
public class Egg extends ComponentDecorator {
    public Egg(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("+蛋");
    }

    @Override
    public int money() {
        return super.money()+2;
    }
}

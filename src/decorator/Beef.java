package decorator;

/**
 * Created by fengyuwusong on 2017/11/21 16:08.
 */
public class Beef extends ComponentDecorator {
    public Beef(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("+牛肉");
    }

    @Override
    public int money() {
        return super.money()+5;
    }
}

package decorator;

/**
 * Created by fengyuwusong on 2017/11/21 16:08.
 */
public class Pork extends ComponentDecorator {
    public Pork(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("+猪肉");
    }

    @Override
    public int money() {
        return super.money()+3;
    }
}

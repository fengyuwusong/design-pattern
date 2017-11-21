package decorator;

/**
 * 构建装饰类：抽象装饰类
 * Created by fengyuwusong on 2017/11/21 16:06.
 */
public class ComponentDecorator extends Component {
    //维持对抽象构件的引用
    private Component component;

    //注入抽象构件类型的对象
    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }

    @Override
    public int money() {
       return component.money();
    }
}

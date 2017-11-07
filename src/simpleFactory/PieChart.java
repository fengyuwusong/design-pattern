package simpleFactory;

/**
 * 饼状图类：具体产品类
 * Created by fengyuwusong on 2017/11/6 8:53.
 */
public class PieChart implements Chart {
    public PieChart(){
        System.out.println("创建饼状图~");
    }
    @Override
    public void display() {
        System.out.println("显示饼状图！");
    }
}

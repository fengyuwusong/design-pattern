package simpleFactory;

/**
 * Created by fengyuwusong on 2017/11/6 8:52.
 */
public class HistogramChart implements Chart {

    public HistogramChart() {
        System.out.println("创建柱状图!");
    }

    @Override
    public void display() {
        System.out.println("显示柱状图！");
    }
}

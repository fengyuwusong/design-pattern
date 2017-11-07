package simpleFactory;

/**
 * 图表工厂类：工厂类
 * Created by fengyuwusong on 2017/11/6 8:50.
 */
public class ChartFactory {
    //静态工厂方法
    public static Chart getChart(String type){
        Chart chart=null;
        if(type.equalsIgnoreCase("histogram")){
            chart=new HistogramChart();
            System.out.println("初始化设置柱状图！");
        }else if(type.equalsIgnoreCase("pie")){
            chart=new PieChart();
            System.out.println("初始化设置饼状图！");
        }
        return chart;
    }
}

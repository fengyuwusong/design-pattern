package simpleFactory;

import util.PropertiesUtil;

/**
 * Created by fengyuwusong on 2017/11/6 9:00.
 */
public class Client {
    public static void main(String[] args) {
        Chart chart;
        chart = ChartFactory.getChart(PropertiesUtil.getString("/simpleFactory.properties", "className"));
        chart.display();

    }
}

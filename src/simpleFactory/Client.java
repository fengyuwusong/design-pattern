package simpleFactory;

import util.XMLUtil;

/**
 * Created by fengyuwusong on 2017/11/6 9:00.
 */
public class Client {
    public static void main(String[] args) {
        Chart chart;
        chart=ChartFactory.getChart(XMLUtil.getName("/simpleFactory.xml"));
        chart.display();

    }
}

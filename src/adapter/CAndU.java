package adapter;

import java.util.Arrays;

/**
 * Created by fengyuwusong on 2017/11/7 16:25.
 */
public class CAndU {
    public String zipCode(int[] code) {
        return "中国查询邮编方法：邮编" + Arrays.toString(code);
    }
    public String findZipCode(String s) {
        return "美国查询邮编方法：邮编" + s;
    }
}

package adapter;

/**
 * 邮编接口
 * Created by fengyuwusong on 2017/11/7 16:05.
 */
public interface ZipCode {

    //美国查询邮编
    public String findZipCode(String zip);

    //中国查询邮编
    public String zipCode(int[] code);
}

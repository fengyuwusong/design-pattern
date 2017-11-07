package adapter;

/**
 * Created by fengyuwusong on 2017/11/7 16:12.
 */
public class ZipCodeObjectAdapter implements ZipCode {
    private C c=new C();
    private U u=new U();

    @Override
    public String findZipCode(String zip) {
        return u.findZipCode(zip);
    }

    @Override
    public String zipCode(int[] code) {
        return c.zipCode(code);
    }
}

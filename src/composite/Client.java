package composite;

/**
 * Created by fengyuwusong on 2017/11/14 16:21.
 */
public class Client {
    public static void main(String[] args) {
        AbstractEducationOrganization headquarters, bj_jw_office, hnSchool, bj_xz_office, hn_jw_office, csTeachPoint, xtTeachPoint, hn_xz_office, cs_jw_office, cs_xz_office, xt_jw_office, xt_xz_office;
        headquarters=new School("北京总部");
        bj_jw_office=new Office("北京教务办公室");
        bj_xz_office=new Office("北京行政办公室");
        hnSchool=new School("湖南分校");
        headquarters.include(bj_jw_office);
        headquarters.include(bj_xz_office);
        headquarters.include(hnSchool);
        hn_jw_office=new Office("湖南教务办公室");
        hn_xz_office=new Office("湖南行政办公室");
        csTeachPoint=new TeachPoint("长沙教学点");
        xtTeachPoint=new TeachPoint("湘潭教学点");
        hnSchool.include(hn_jw_office);
        hnSchool.include(hn_xz_office);
        hnSchool.include(csTeachPoint);
        hnSchool.include(xtTeachPoint);
        cs_jw_office=new Office("长沙教务办公室");
        cs_xz_office=new Office("长沙行政办公室");
        csTeachPoint.include(cs_jw_office);
        csTeachPoint.include(cs_xz_office);
        xt_jw_office=new Office("湘潭教务办公室");
        xt_xz_office=new Office("湘潭行政办公室");
        xtTeachPoint.include(xt_jw_office);
        xtTeachPoint.include(xt_xz_office);

//        传达信息
        headquarters.message();
        System.out.println("--------------");
        xtTeachPoint.message();
        System.out.println("--------------");
        hnSchool.message();

    }
}

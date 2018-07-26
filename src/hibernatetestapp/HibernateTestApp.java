/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatetestapp;

import java.math.BigInteger;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author bayasys
 */
public class HibernateTestApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session s = sf.openSession();
            Object object[] = null;
//            boolean errFlg = false;
//            String barcodes = "53321,30538,82554";
//            String errMsg = "There is already a SaleOrder with the following barcodes : \n";
//            Query statusIdsQry = s.createSQLQuery("select string_agg(cast(dtl.id as text), ', ')  from bayacontrolcodetabledata dtl join bayacontrolcodetables hdr on hdr.id = dtl.parenttabledataid where  hdr.tablecode = 'SALE_ORDER_STATUS' AND dtl.code  = 'PENDING' OR dtl.code  = 'CONFRMD'");
//            String statusIds = statusIdsQry.list().get(0).toString();
//            Query qry = s.createSQLQuery("select count(*),dtl.barcodeid,dtl.barcodeno from saleorderdtl dtl\n"
//                    + "join saleorderhdr hdr on hdr.id = dtl.parenttabledataid \n"
//                    + "where hdr.recordstatus = 'A'\n"
//                    + "AND dtl.statucbccid in (" + statusIds + ")\n"
//                    + "AND dtl.barcodeid in(" + barcodes + ") group by dtl.barcodeid,dtl.barcodeno");
//            List<Object[]> objAry = qry.list();
//            for (int i = 0; i < objAry.size(); i++) {
//                object = objAry.get(i);
//                if (((BigInteger) object[0]).intValue() > 1) {
//                    errFlg = true;
//                    errMsg += object[2] + "\n";
//                    System.out.println(object[0] + " " + object[1] + " " + object[2]);
//                }
//            }
//            if (errFlg) {
//                throw new Exception("errMsg : " + errMsg);
//            }

            String res = "";
            SQLQuery qry = s.createSQLQuery("select b.id from bayacontrolcodetables a join\n"
                    + "bayacontrolcodetabledata b on a.id = b.parenttabledataid\n"
                    + "where  a.tablecode  = 'ITEM_IDENTFICATN_PARAMS' AND \n"
                    + "b.code = 'HSN_CODE'");
            List l = qry.list();
            if (l.isEmpty()) {
                throw new Exception("HSN_CODE bccid not found");
            } else {
                System.out.println(l.get(0));
            }

            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

}

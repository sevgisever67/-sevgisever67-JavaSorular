package Maps;

import java.util.HashMap;
import java.util.Map;

public class RequestBody {
    public static void main(String[] args) {
        /*
        Aşğıdaki body2yi map olarakoluşturun
        "firstname" : "ahmet"
        "lastname" : "bulut"
        "totalprice": 500
        "depositpaid": false;
        "bookingdate" : {
                     "checkin" : "2021-06-01"
                     "checkout" :"2021-06-10"
         "additionalneeds" : "wi-fi" }

         */

        Map<String,Object> regBody=new HashMap<>();
        regBody.put("firstname","ahmet");
        regBody.put("lastname","bulut");
        regBody.put("totalprice",500);
        regBody.put("depositpaid",false);

        Map<String,String>bookindate=new HashMap<>();
        bookindate.put("checkin","2021-06-01");
        bookindate.put("checkout","2021-06-10");

        regBody.put("bookingdate",bookindate);
        regBody.put("additionalneeds","wi-fi");

        System.out.println(regBody);
        /*
        {firstname=ahmet,
        additionalneeds=wi-fi,
        totalprice=500,
        depositpaid=false,
        bookingdate={checkin=2021-06-01,
                     checkout=2021-06-10},
        lastname=bulut}
         */

        System.out.println(regBody.get("lastname"));//bulut
        System.out.println(regBody.get("totalprice"));//500
        System.out.println(((Map) regBody.get("bookingdate")).get("checkout"));
        System.out.println(((Map)regBody.get("bookingdate")).get("checkin"));

        //ismi selçuk yap
        regBody.put("firstname", "zeliha");
        System.out.println(regBody.get("firstname"));








    }
}

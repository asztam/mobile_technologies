import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJSONExample {

    public static void main(String[] args) {

        JSONObject company1 = new JSONObject();
        company1.put("industryBranch", "IT, EE");
        company1.put("package", "Diamond");
        company1.put("strategicPartner", "Y");
        company1.put("sector", "A");
        company1.put("placeNo", "22");

        JSONObject company1Address = new JSONObject();
        company1Address.put("streetAddress", "ul. Pilsudskiego");
        company1Address.put("city", "Lodz");
        company1Address.put("state", "Lodzkie");
        company1Address.put("postalCode", "12345");
        company1.put("address", company1Address);

        JSONArray company1Numbers = new JSONArray();

        JSONObject company1Numbers1 = new JSONObject();
        company1Numbers1.put("owner", "General");
        company1Numbers1.put("position", "Gfdseneral");
        company1Numbers1.put("number", "212 555 234");
        company1Numbers1.put("notatka", "aafdsGeneral");
        company1Numbers.add(0, company1Numbers1);

        JSONObject company1Numbers2 = new JSONObject();
        company1Numbers2.put("owner", "Janusz");
        company1Numbers2.put("position", "HR");
        company1Numbers2.put("number", "646 555 567");
        company1Numbers2.put("notatka", "aafdsGeneral");
        company1Numbers.add(1, company1Numbers2);

        JSONObject company1Numbers3 = new JSONObject();
        company1Numbers3.put("owner", "Joanna");
        company1Numbers3.put("position", "PR");
        company1Numbers3.put("number", "646 232 567");
        company1Numbers3.put("notatka", "aafdsGeneral");
        company1Numbers.add(2, company1Numbers3);

        company1.put("phoneNumbers", company1Numbers);

        JSONObject compObj = new JSONObject();
        compObj.put("ZFa", company1);
        System.out.println("/");


        JSONArray empList = new JSONArray();
        empList.add(compObj);
//        empList.add(empObj2);

        try(FileWriter file = new FileWriter("jsonCompany.json")){
            file.write(empList.toJSONString());
            file.flush();
        }
        catch(IOException e) {e.printStackTrace();}
    }

}
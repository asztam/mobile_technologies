package pl.sztamborski;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class writeJSON {

    public static void writeJson() {
        List<JSONObject> objectJson = new ArrayList<>();
//        Set<JSONObject> employeesJson = new HashSet<>();

        JSONArray empList = new JSONArray();
        List<JSONObject> employeesJson = new ArrayList<>();
        System.out.println("JSON File generating with the data records printed below: ");
        for (int i = 0; i < Employee.employeesList().size() ; i++){
            System.out.println("\nRecord No.: " + i);
            Employee.employeesList().get(i).displayEmployeeInformation();
            employeesJson.add(new JSONObject());
            employeesJson.get(i).put("firstname", Employee.employeesList().get(i).getFirstname());
            employeesJson.get(i).put("lastname", Employee.employeesList().get(i).getLastname());
            employeesJson.get(i).put("website", Employee.employeesList().get(i).getWebsite());
            objectJson.add(new JSONObject());
            objectJson.get(i).put("employee", employeesJson.get(i));
            empList.add(objectJson.get(i));
        }
        try(FileWriter file = new FileWriter("myJsonWritten.json")){
            file.write(empList.toJSONString());
            file.flush();
        }
        catch(IOException e) {e.printStackTrace();}
    }
}








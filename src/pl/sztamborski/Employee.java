package pl.sztamborski;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String firstname;
    private String lastname;
    private String website;
    private static List<Employee> employees = new ArrayList<>();

    public Employee(String firstname, String lastname, String website) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.website = website;
    }

    public static void addEmployees(){

        employees.add(new Employee("Mike", "Tyler", "www.aaa.com"));
        employees.add(new Employee("Gike", "Myler", "www.bbb.com"));
        employees.add(new Employee("Bike", "Gyler", "www.ccc.com"));
        employees.add(new Employee("Nike", "Fyler", "www.ddd.com"));
        employees.add(new Employee("Like", "Pyler", "www.eee.com"));
        employees.add(new Employee("Stike", "Ryler", "www.fff.com"));
    }

    public static List<Employee> employeesList(){
        return employees;
    }

    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public String getWebsite(){
        return website;
    }


    public void displayEmployeeInformation() {
        System.out.println("Imię: " + firstname);
        System.out.println("Nazwisko: " + lastname);
        System.out.println("Strona: " + website);
    }
}

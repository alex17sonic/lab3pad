package model;

import java.util.ArrayList;


public class EmployeeList {
    private ArrayList<Employee> list;

    public EmployeeList(){
        list = new ArrayList<Employee>();
    }

    public void add(Employee e){
        list.add(e);
    }
}

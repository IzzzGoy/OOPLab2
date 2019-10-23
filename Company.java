package oop.lab;

import java.util.ArrayList;

public class Company {

    private String companyName;
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public Company(final String companyName) {
        this.companyName = companyName;
    }

    public void kickWorkerFromCompany(Employee employee) {
        if(employees.contains(employee)) {
            employees.remove(employee);
        }
    }

    public void AcceptWorker(final Employee employee) {
        if (employees.contains(employee)) {
            return;
        }
        employees.add(employee);
    }

    public boolean ContainsEmployee(final Employee employee) {
        if (employees.contains(employee)) {
            return true;
        }
        else {
            return false;
        }
    }

    public Employee getEmployee(final String name){
        for (Employee employee: employees) {
            if(employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public int getCompanySize() {
        return employees.size();
    }

    @Override
    public String toString() {
        String result = "Company: " + companyName + "\n";
        for (int i = 0; i < employees.size(); i++) {
            result += employees.get(i) + "\n";
        }
        return result;
    }
}

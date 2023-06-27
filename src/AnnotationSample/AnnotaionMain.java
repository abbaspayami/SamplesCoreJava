package AnnotationSample;

import java.util.ArrayList;
import java.util.List;

public class AnnotaionMain {
    public static void main(String[] args) {
        EmployeeValidator validator = new EmployeeValidatorImpl();

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Abbas","Payami",37));
        employees.add(new Employee("Riaz","Farhanian",40));
        employees.add(new Employee("Reza",null,25));

        employees.forEach(employee -> System.out.println(validator.validateEmployee(employee)));

    }
}

package AnnotationSample;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class EmployeeValidatorImpl implements EmployeeValidator {
    List<Method> methodList;

    @Override
    public boolean validateEmployee(Employee employee) {
        Class<? extends Employee> employeeClass = employee.getClass();

        if (methodList == null) {
            methodList = new ArrayList<>();
            for (Method method : employeeClass.getDeclaredMethods()) {
                if (method.isAnnotationPresent(Mandatory.class)) {
                        methodList.add(method);
                }
            }
        }


        return methodList.stream().allMatch(method -> {
            try {
                return method.invoke(employee)!=null;
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        });
    }
}

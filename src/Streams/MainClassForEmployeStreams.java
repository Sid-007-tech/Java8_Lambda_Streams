package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class MainClassForEmployeStreams {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
        empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
        empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));

        empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
        empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
        empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
        empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
        empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));


//         List<String> list = empList.stream()
//                .map(employee -> employee.getName())
//                .collect(Collectors.toList());
//        System.out.println("just name "+list);

        //Group the Employees by age.

                Map<Integer, List<Employee>> empByAge = empList.stream().collect(Collectors.
                groupingBy(Employee::getAge));
        System.out.println("Employees grouped by age :: \n" + empByAge);

        //3. Find the count of male and female employees present in the organization.
        Map<String, Long> noOfMaleAndFemaleEmployees =
         empList.stream()
                        .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println("Count of male and female employees present in the " +
                "organization:: \n" + noOfMaleAndFemaleEmployees);


        //Print the names of all departments in the organization.

                System.out.println("Names of all departments in the organization ");
        empList.stream().map(Employee::getDeptName).distinct().
                forEach(System.out::println);

        //5. Print employee details whose age is greater than 28
        System.out.println("List of employees with age> 28 ");
        List<Integer> list=
        empList.stream()
                .map(Employee::getAge)
                .filter(a-> a>= 28)
                .collect(Collectors.toList());
        System.out.println(list);
        System.out.println("Second way");
        System.out.println("Employee details whose age is greater than 28");
        empList.stream().filter(e -> e.getAge() > 28).collect(Collectors.toList()).
                forEach(System.out::println);

        //6. Find maximum age of employee.
/*         List<Employee> maxAge = empList.stream()
                .sorted((o1, o2) -> o1.getAge() - o2.getAge())
                .collect(Collectors.toList());
        System.out.println("max age of an employee"+maxAge);*/

        System.out.println("max age of an employee : ");
        OptionalInt maxAge = empList.stream()
                .mapToInt(Employee::getAge)
                .max();
        System.out.println(maxAge.getAsInt());

        //7. Print Average age of Male and Female Employees.

        System.out.println("Average age of Male and Female Employees:: ");

        Map<String, Double> avgAge = empList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getGender, Collectors.averagingInt(Employee::getAge)
                ));
        System.out.println(avgAge);

        //8. Print the number of employees in each department.
        System.out.println("8. Print the number of employees in each department.");

         Map<String, Long> empDept = empList.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDeptName, Collectors.counting())
                );
        System.out.println(empDept);


        //9. Find oldest employee.
        System.out.println("9. Find oldest employee.");
         Optional<Employee> oldestEmp = empList.stream()
                .max(Comparator.comparingInt(Employee::getAge));
         Employee oldestEmployee=oldestEmp.get();
        System.out.println(oldestEmployee);

        //10. Find youngest female employee.
        System.out.println("10. Find youngest female employee.");
         Optional<Employee> youngestFemale = empList.stream().filter(employee -> employee.getGender().equals("F"))
                .min(Comparator.comparingInt(Employee::getAge));
        youngestFemale.ifPresent(System.out::println);


        //11. Find employees whose age is greater than 30 and less than 30.

        System.out.println("Employees whose age is greater than 30 and less than 30");
        Map<Boolean, List<Employee>> partitionEmployeesByAge =
                empList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 30));

        Set<Map.Entry<Boolean, List<Employee>>> empSet = partitionEmployeesByAge.entrySet();

        for (Map.Entry<Boolean, List<Employee>> entry : empSet) {
            if (Boolean.TRUE.equals(entry.getKey())) {
                System.out.println("Employees greater than 30 years ::" + entry.getValue());
            } else {
                System.out.println("Employees less than 30 years ::" + entry.getValue());
            }
        }

        //12. Find the department name which has the highest number of employees.
        System.out.println("12. Find the department name which has the highest number of employees.");

         Map<String, Long> empDeptName = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));
         Optional<Map.Entry<String, Long>> maxValue = empDeptName.entrySet().stream().max(Map.Entry.comparingByValue());
        maxValue.ifPresent(stringLongEntry -> System.out.println("Department with the highest number of employees: " + stringLongEntry.getKey() + " (Number of employees: " + stringLongEntry.getValue() + ")"));
        // System.out.println(maxValue.get());

    }
}

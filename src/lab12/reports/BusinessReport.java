package lab12.reports;

import java.text.CollationElementIterator;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import lab12.entities.*;

public class BusinessReport {

    public static Map<Disability, List<Employee>> getEmployeesOnSameDisability(Business business) {
        // Get employees and map them on the type of disability they possess
        Map<Disability, List<Employee>> map = new HashMap<>();
        for (Disability disability : Disability.values()) {
            List<Employee> employees = business.getEmployees().stream().filter(employee -> employee.getDisability().equals(disability)).collect(Collectors.toList());
            map.put(disability, employees);
        }
        return map;
    }

    public static long getNumberOfDifferentProjectsWorkedByCurrentFemaleEmployees(Business business) {
        // Get employees, filter by gender, get their projects without duplicates, count
        List<Employee> employees = business.getEmployees().stream().filter(employee -> employee.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());
        Set<Project> projects = new HashSet<>();
        for(Employee employee : employees) {
            projects.addAll(employee.getProjects());
        }
        return projects.size();
    }

    public static Map<Religion, Map<Gender, List<Employee>>> getEmployeesOnSameReligionAndGender(Business business) {
        // Map the employees by religion (Map<Religion, List<Employee>>) then map each of the lists by city (Map<String, List<Employee>>)
        // Hint: use Collectors.groupingBy(Function, Collector)
        Map<Gender, List<Employee>> map = business.getEmployees().stream().collect(Collectors.groupingBy(Employee::getGender));
        Map<Religion, Map<Gender, List<Employee>>> finalMap = new HashMap<>();
        for (Religion religion : Religion.values()) {
            Map<Gender, List<Employee>> partialMap = new HashMap<>(map);
            for (Gender gender : Gender.values()) {
                partialMap.put(gender, partialMap.get(gender).stream().filter(employee -> employee.getReligion().equals(religion)).collect(Collectors.toList()));
            }
            finalMap.put(religion, partialMap);
        }
        return finalMap;
    }
}

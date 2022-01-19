package lab12.reports;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import lab12.entities.*;

public class BankReport {
    // Customer = Employee of the Business
    // Business = a client of the Bank
    // Customers of the Bank = all the Employees that work for the Businesses that are clients of the Bank

    public static int getNumberOfCustomers(Bank bank) {
        // All the customers that have accounts at the bank
        List<Employee> employees = bank.getClients().stream().flatMap(business -> business.getEmployees().stream()).collect(Collectors.toList());
        return (int) employees.stream().filter(employee -> employee.getAccounts().size() > 0).count();
    }

    public static int getNumberOfAccounts(Bank bank) {
        // Accounts of all the customers of the bank
        List<Account> accounts = bank.getClients().stream().flatMap(business -> business.getEmployees().stream()).flatMap(employee -> employee.getAccounts().stream()).collect(Collectors.toList());
        return accounts.size();
    }

    public static SortedSet<Employee> getCustomersSorted(Bank bank) {
        // Display the set of customers in alphabetical order
        SortedSet<Employee> employees = bank.getClients().stream().flatMap(business -> business.getEmployees().stream()).collect(Collectors.toCollection(TreeSet::new));
        return employees;
    }

    public static double getTotalSumInAccounts(Bank bank) {
        // Sum of all customers' accounts balances
        List<Account> accounts = bank.getClients().stream().flatMap(business -> business.getEmployees().stream()).flatMap(employee -> employee.getAccounts().stream()).collect(Collectors.toList());
        return accounts.stream().mapToDouble(Account::getBalance).sum();
    }

    public static SortedSet<Account> getAccountsSortedBySum(Bank bank) {
        // The set of all accounts, ordered by current account balance
        SortedSet<Account> accounts = bank.getClients().stream().flatMap(business -> business.getEmployees().stream()).flatMap(employee -> employee.getAccounts().stream()).collect(Collectors.toCollection(TreeSet::new));
        return accounts;
    }

    public static Map<Employee, Collection<Account>> getCustomerAccounts(Bank bank) {
        // Return a map of all the customers with their respective accounts
        Map<Employee, Collection<Account>> map = new HashMap<>();
        for (Employee employee : bank.getClients().stream().flatMap(business -> business.getEmployees().stream()).collect(Collectors.toList())) {
            map.put(employee, employee.getAccounts());
        }
        return map;
    }

    public static Map<String, List<Employee>> getCustomersByCity(Bank bank) {
        // Map all the customers to their respective cities

        return null;
    }
}

package hashTable;

import java.util.HashMap;
import java.util.List;

/**
 * Created by cuixiaodao on 11/07/2017
 * for leetCode problem:
 * https://leetcode.com/problems/employee-importance/description/
 */
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};

public class EmployeeImportance {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer, Employee> empMap = new HashMap<>(employees.size() / 2 * 3);
        for (Employee emp : employees)
            empMap.put(emp.id, emp);

        return getImportance(empMap, id);
    }

    private int getImportance(HashMap<Integer, Employee> empMap, int id) {
        Employee cur = empMap.get(id);
        int importance = cur.importance;

        for (int subId : cur.subordinates)
            importance += getImportance(empMap, subId);

        return importance;
    }
}
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _690_Employee_Importance {
    // Definition for Employee.
    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    };

    private Map<Integer, Employee> myMap = new HashMap<>();
    private Set<Integer> daDuyet = new HashSet<>();
    int totalImportance = 0;

    private void DFS(List<Employee> allEmployee, int id)
    {
        // 1. Dieu Kien dung
        Employee curEmployee = null;
        // for (Employee e : allEmployee) {
        //     if(e.id == id){
        //         curEmployee = e;
        //         break;
        //     }
        // }

        curEmployee = myMap.get(id);

        if(curEmployee == null)
            return;

        // 2. Kiem tra id da duoc duyet chua
        if(daDuyet.contains(id) == true) return;

        // 3. Xu Ly : Tang totalImportance + id.importance
        totalImportance += curEmployee.importance;
        
        // 4. Danh dau da duyet
        daDuyet.add(id);

        // 5. Duyet den tat ca cac node con | nhan vien cap duoi cua curEmployee
        for (Integer capDuoiId : curEmployee.subordinates) {
            DFS(allEmployee, capDuoiId);
        }
    }

    public int getImportance(List<Employee> allEmployee, int id) 
    {
        for (Employee employee : allEmployee) {
            myMap.put(employee.id, employee);
        }

        DFS(allEmployee, id);
        return totalImportance;
    }

    public static void main(String[] args) {

    }
    
}

package Pertemuan6;

import java.util.ArrayList;
import java.util.List;

class Department {
    private String name;

    Department(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class University {
    private List<Department> departments = new ArrayList<>();

    void addDepartment(Department department) {
        departments.add(department);
    }

    void displayDepartments() {
        for (Department d : departments) {
            System.out.println("Department: " + d.getName());
        }
    }
}

public class Departemen {
    public static void main(String[] args) {
        University uni = new University();
        Department cs = new Department("Computer Science");
        Department ee = new Department("Electrical Engineering");

        uni.addDepartment(cs);
        uni.addDepartment(ee);
        uni.displayDepartments();
    }
}


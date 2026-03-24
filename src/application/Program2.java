package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program2 {

    static void main(String []args) {

        Scanner scanner = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.CreateDepartmentDao();

        IO.println("=== Test 1: department insert ===");
        Department newDepartment = new Department(null, "Games");
        departmentDao.insert(newDepartment);
        IO.println("New Id = " + newDepartment.getId());

        IO.println("=== Test 2: department findById ===");
        Department department = departmentDao.findById(5);
        IO.println(department);

        IO.println("\n=== Test 3: department findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list) {
            IO.println(obj);
        }

        IO.println("\n=== Test 4: department update ===");
        department = departmentDao.findById(6);
        department.setName("Medical");
        departmentDao.update(department);

        IO.println("\n=== Test 5: department delete ===");
        IO.print("Enter id for delete test: ");
        int id = scanner.nextInt();
        departmentDao.deleteById(id);

        scanner.close();
    }
}

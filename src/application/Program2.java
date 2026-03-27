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

        System.out.println("=== Test 1: department insert ===");
        Department newDepartment = new Department(null, "Games");
        departmentDao.insert(newDepartment);
        System.out.println("New Id = " + newDepartment.getId());

        System.out.println("=== Test 2: department findById ===");
        Department department = departmentDao.findById(5);
        System.out.println(department);

        System.out.println("\n=== Test 3: department findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== Test 4: department update ===");
        department = departmentDao.findById(6);
        department.setName("Medical");
        departmentDao.update(department);

        System.out.println("\n=== Test 5: department delete ===");
        System.out.print("Enter id for delete test: ");
        int id = scanner.nextInt();
        departmentDao.deleteById(id);

        scanner.close();
    }
}

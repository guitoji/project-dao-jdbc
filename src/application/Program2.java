package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class Program2 {

    static void main(String []args) {

        DepartmentDao departmentDao = DaoFactory.CreateDepartmentDao();

//        IO.println("=== Test 1: department insert ===");
//        Department newDepartment = new Department(null, "Games");
//        departmentDao.insert(newDepartment);
//        IO.println("New Id = " + newDepartment.getId());

        IO.println("=== Test 2: department findById ===");
        Department department = departmentDao.findById(5);
        IO.println(department);

        IO.println("\n=== Test 3: department findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list) {
            IO.println(obj);
        }
    }
}

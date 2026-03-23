package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

    static void main(String []args) {

        DepartmentDao departmentDao = DaoFactory.CreateDepartmentDao();

        IO.println("=== Test 1: deparment insert ===");
        Department newDepartment = new Department(null, "Games");
        departmentDao.insert(newDepartment);
        IO.println("New Id = " + newDepartment.getId());
    }
}

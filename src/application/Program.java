package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {

    static void main(String []args) {

        SellerDao sellerDao = DaoFactory.CreateSellerDao();

        IO.println("=== Test 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        IO.println(seller);

        IO.println("\n=== Test 1: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            IO.println(obj);
        }
    }
}

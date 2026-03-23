package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {

    static void main() {

        Scanner scanner = new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.CreateSellerDao();

        IO.println("=== Test 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        IO.println(seller);

        IO.println("\n=== Test 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            IO.println(obj);
        }

        IO.println("\n=== Test 3: seller findAll ===");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            IO.println(obj);
        }

//        IO.println("\n=== Test 4: seller insert ===");
//        Seller newSeller = new Seller(
//                null,
//                "John",
//                "john@gmail.com",
//                new Date(),
//                4000.00, department);
//        sellerDao.insert(newSeller);
//        IO.println("Inserted! New id = " + newSeller.getId());

        IO.println("\n=== Test 5: seller update ===");
        seller = sellerDao.findById(6);
        seller.setName("Jordan");
        seller.setEmail("jordan@gmail.com");
        sellerDao.update(seller);

        IO.println("\n=== Test 6: seller delete ===");
        IO.print("Enter id for delete test: ");
        int id = scanner.nextInt();
        sellerDao.deleteById(id);

        scanner.close();

    }
}

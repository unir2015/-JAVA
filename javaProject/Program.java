package javaProject;

import java.util.ArrayList;
import java.util.List;

/**
 * Notbook
 */
public class Program {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(2, 500, "<Windows 10 Home>", "<Серибристый>", 25000, "Lenovo");
 
        Laptop laptop2 = new Laptop(0);
       
        Laptop laptop3 = new Laptop(16, 1024, "<Windows 11 Professional>", "<Черный>", 101000, "Asus");

        Laptop laptop4 = new Laptop(32, 2048, "<Windows 11 Home>", "<Черно-серый>", 150000, "HP");
        
        Laptop laptop5 = new Laptop(8, 500, "<APPLE>", "<Серибристый>", 56000, "APPLE");




        List<Laptop> product = new ArrayList<>();

        product.add(laptop2);
        product.add(laptop1);
        product.add(laptop3);
        product.add(laptop4);
        product.add(laptop5);




        // Поисковой автомат


        SearchLaptop searchLaptop = new SearchLaptop(product);

        Laptop memoryRes  = searchLaptop.getSearchLaptop(32); 
        

        if(memoryRes != null ){
            System.out.println("Вы купили: ");
            System.out.println(memoryRes.displayInfo());
        }
        else{
            System.out.println( "Нету нотбука по указанным кретериям!");
        }

    
    }
}
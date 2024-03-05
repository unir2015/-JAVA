package javaProject;

import java.util.List;


public class SearchLaptop {
    
    private List<Laptop> laptops;
    public SearchLaptop(List<Laptop> laptop){
        this.laptops = laptop;
    }

    public Laptop getSearchLaptop(double memorys){
        for(Laptop memory: laptops){
            if(memory instanceof Laptop){
               
                Laptop laptop = (Laptop)memory;
                if(laptop.getMemory() == memorys){
                    return laptop;
                    
                }
            }
            
            
        }
        return null;
        


    }
}

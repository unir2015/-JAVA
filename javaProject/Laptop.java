package javaProject;

/**
 * LaptopDatabase
 */
public class Laptop {

    double memory;
    Object hardDrive;
    String system;
    String color;
    Object price;
    String brand;
   


  
    private void processMemory(double memory){
        
            this.memory = memory;
        }
    
    private void processHardDrive(double hardDrive){
        if(hardDrive < 200 && hardDrive > 3000.00 || hardDrive == 0){
            this.hardDrive = "<No Info>";
        }
        else{
            this.hardDrive = hardDrive;
        }
    }
    private void processSystem(String System){
 
            this.system = System;
        
    }
    private void processColor(String color){
        if (color == null || color.length() < 3){
            this.color = "<No Info>";
        }
        else {
            this.color = color;
        }
    }
    private void processPrice(double price){
        if (price < 10000 || price == 0){
            this.price = "<No Info>";
        }
        else {
            this.price = price;
        }
    }
    private void processBrand(String brand){
        if (brand == null || brand.length() < 3){
            this.system = "<No Info>";
        }
        else {
            this.brand = brand;
        }
    }






    public void setMenory(double memory){
        processMemory(memory);
    }
    public void setHardDrive(double hardDrive){
        processHardDrive(hardDrive); 
    }
    public void setSystem(String system){
        processSystem(system);
    }
    public void setColor(String color){
        processColor(color);
    }
    public void setPrice(double price){
        processPrice(price);
    }
    public void setBrand(String brand){
        processBrand(brand);
    }


    public double getMemory(){
        return memory;
    }
    public Object getHardDrive(){
        return hardDrive;
    }
    public Object getSystem(){
        return system;
    }
    public Object getColor(){
        return color;
    }
    public Object getPrice(){
        return price;
    }
    public Object getBrand(){
        return brand;
    }







    public Laptop(double memory, double hardDrive, String system, String color, double price, String brand){
        processMemory(memory);
        processHardDrive(hardDrive);
        processSystem(system);
        processColor(color);
        processPrice(price);
        processBrand(brand);
    }
    public Laptop(double memory, double hardDrive, String system, String color, double price){
        this(memory, hardDrive, system, color, price, "<No Info>");
    }
    public Laptop(double memory, double hardDrive, String system, String color){
        this(memory, hardDrive, system, color, 0, "<No Info>");
    }
    public Laptop(double memory, double hardDrive, String system){
        this(memory, hardDrive, system, "<No Info>", 0, "<No Info>");
    }
    public Laptop(double memory, double hardDrive){
        this(memory, hardDrive, "<No Info>", "<No Info>", 0, "<No Info>");
    }
    public Laptop(double memory){
        this(memory, 0, "<No Info>", "<No Info>", 0, "<No Info>");
    }
    public Laptop(){

    }


    
    
    



    

   
    public String displayInfo(){
        return String.format("Озу: %s\n Жесткий диск: %s\n Операционная система: %s\n Цвет: %s\n Цена: %s\n Бренд: %s\n", memory, hardDrive, system, color, price, brand);
    }
    
}
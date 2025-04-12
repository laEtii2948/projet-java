package model;

// La classe board est la classe qui représente la planche de surf. 
public class Board implements Surfitem {
    private String id; 
    private String name; 
    private double price; 
    private String size; 
    private String material; 
    private String brand;
     

    // Constructeur
    public Board(String id, String name, double price, String size, String material, String brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.size = size;
        this.material = material;
        this.brand = brand;
    }
   

    // Implémenter les méthodes de l'interface surfitem
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getBrand() {
        return brand;
    } 

    @Override
    public String getDescription(){
        return "Board | ID :" + id 
        + "| Name : " + name 
        + "| Price : " + price
        + "| Size : " + size
        + "| Material : " + material
        + "| Brand : " + brand;
    }

    // Les méthodes spécifiques à la classe board
    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    public String getId() {
        return id;
    }

  

    
}

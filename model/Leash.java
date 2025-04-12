package model;

// La classe Leash est une classe représentant lacorde qui relie la cheville et la planche de surf. 
public class Leash implements Surfitem {
    private String id; 
    private String name; 
    private double price; 
    private int length; 
    private String color; 
    private boolean swivel;
    private String brand; 

    // Constructeur 
    public Leash(String id, String name, double price, int length, String color, boolean swivel, String brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.length = length;
        this.color = color;
        this.swivel = swivel;
        this.brand = brand;
    }
  
    // Implémenter l'interface surfitem
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
        return "Leash | ID :" + id
        + " | Name :  " + name 
        + " | Price : " + price
        + " | Length : " + length
        + " | Color : " + color 
        + " | Swivel : " + swivel 
        + " | Brand : " + brand; 
    }
    

    // Les méthodes spécifiques à la classe Leash
    public int getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public boolean isSwivel() {
        return swivel;
    }

    public String getId() {
        return id;
    }

    
}

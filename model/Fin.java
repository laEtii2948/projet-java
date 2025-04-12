package model;

//La classe fin est la classe qui représente les dérives, il s'agit d''un ou plusieurs ailerons fixés sous la planche de surf.
// Cet élément est essentielpour la stabilité de la planche. 
public class Fin implements Surfitem {
    private String id; 
    private String name; 
    private double price; 
    private String material; 
    private String fixationType;
    private int numberOfFin;
    private String brand;
    

    // Constructeur 
    public Fin(String id, String name, double price, String material, String fixationType, int numberOfFin,
            String brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.material = material;
        this.fixationType = fixationType;
        this.numberOfFin = numberOfFin;
        this.brand = brand;
    }
  
    // Implémenter l'interface suritem
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
        return "Fin | ID : " + id
        + " | Name : " + name
        + " | Price : " + price 
        + " | Material : " + material
        + " | Type of fixation : " + fixationType
        + " | Number of fin : " + numberOfFin
        + " | Brand : " + brand; 

    }


    // Les méthodes spécifiques de la classe fin

    public String getMaterial() {
        return material;
    }

    public String getFixationType() {
        return fixationType;
    }

    public int getNumberOfFin() {
        return numberOfFin;
    }

    public String getId() {
        return id;
    }

    
}

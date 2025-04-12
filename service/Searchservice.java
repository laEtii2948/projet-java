package service;

import java.util.ArrayList;
import java.util.List;

import model.Surfitem;

// Ce fichier a pour but de concevoir un système de filtre des articles proposés dans le catalogue en fonction d'un prix maximum fixé. 
// Pour ne pas altérer la liste ListCatalog,  et éviter de filtrer dans cette liste, le parti pris est de créer une nouvelle liste. 
// pour ça on crééera une méthode qui prendra en paramètre la liste filtrée et le prix max à ne pas dépasser. 
public class Searchservice {

    // La méthode qui va permettre d'avoir la liste du catalogue filtrée en fonction du prix. 
    public List<Surfitem> FilterByPrice (List<Surfitem>FilteredItems, double MaxPrice) {
        // On commence par créer une nouvelle liste qui contiendra les éléments du catalogue ayant un prix max inférieur à 50€
        List<Surfitem> FilteredList = new ArrayList<>(); 

        for (Surfitem catalogItem : FilteredItems) {
            // On parcours tout le catalogue et on vérifie à chaue fois si l'item du catalogue (donc catalogitem) est inférieur ou égal au prix max autorisé pour filtrer
            if (catalogItem.getPrice() <= MaxPrice) {
                FilteredList.add(catalogItem); 
            }
        }

        // Ensuite on retourne la liste filtrée que l'on va pouvoir afficher dans DisplayCatalog.java
        return FilteredList; 
        
    }
    
}

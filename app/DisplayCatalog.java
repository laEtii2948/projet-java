package app;

import java.util.ArrayList;
import java.util.List;

import model.Board;
import model.Fin;
import model.Leash;
import model.Surfitem;
import service.Searchservice;

// Ce qui va devenir le programme principal. En l'état, il va nous servir à afficher : 
// La liste complète du catalogue (sans filtre)
// La liste filtrée des produit à moins de 50€ du catalogue 


public class DisplayCatalog {

    public static void main(String[] args) {
        //Création d'une liste surfitem qui contiendra enfaite tous les éléments du catalogue à savoir les board, les fin et les Leash
        List<Surfitem> ListCatalog = new ArrayList<>();

        // Une fois que la liste est créée, on créée les objets board pour commencer en appelant le constructeur
        Board board001 = new Board("board001", "WaveRider", 450.0, "6.5", "Foam", "QuickSilver");
        Board board002 = new Board("board002", "OceanExplorer", 620.0, "7.8", "Epoxy", "Billabong");
        Board board003 = new Board("board003", "StormChaser", 499.99, "6.0", "Carbon", "Pyzel");
        Board board004 = new Board("board004", "BeginnerBoard", 299.99, "7.5", "Foam", "SofTech"); 

        // Intégration des objets board dans la liste d'item. 
        ListCatalog.add(board001); 
        ListCatalog.add(board002);
        ListCatalog.add(board003); 
        ListCatalog.add(board004); 

        //Création des objets fin en appelant le constructeur
        Fin fin001 = new Fin("fin001", "SpeedFin", 55.0, "Fiberglass", "Clip", 3, "FCS"); 
        Fin fin002 = new Fin("fin002", "PowerSet", 75.0, "Carbon", "Clip", 3, "Futures");
        Fin fin003 = new Fin("fin003", "ClassiTwin", 40.0, "Plastic", "Screw", 2, "QuickSilver");
        Fin fin004 = new Fin("fin004", "ThrusterSet", 60.0, "Fiberglass", "Screw", 3, "Billabong"); 

        // Intégration des objets fin dans la liste d'item
        ListCatalog.add(fin001); 
        ListCatalog.add(fin002);
        ListCatalog.add(fin003); 
        ListCatalog.add(fin004); 

        //Création des objets Leash en appelant le constructeur 
        Leash leash001 = new Leash("leash001", "ClassicLeash", 29.99, 6, "Black", true, "Dakine");
        Leash leash002 = new Leash("leash002", "ProWave", 39.99, 7, "Blue", true, "Creatures");
        Leash leash003 = new Leash("leash003", "MiniLeash", 24.50, 5, "Pink", false, "FCS");
        Leash leash004 = new Leash("leash004", "HeavyDuty", 44.99, 8, "Green", true, "Futures");

        //Intégration des objets leash dans la liste d'item
        ListCatalog.add(leash001); 
        ListCatalog.add(leash002);
        ListCatalog.add(leash003); 
        ListCatalog.add(leash004); 

        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("                        Bienvenue dans votre boutique de Surf                                                    ");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                                                                 ");
        System.out.println("---------------------------------------Catalogue-----------------------------------------------------------------");

        // On parcourt toute la liste pour afficher tout le contenu du catalogue avec l'aide de l'une des méthode getDescription de l'interface suritem
        for(Surfitem surfitem : ListCatalog){
            System.out.println(surfitem.getDescription());
        }


        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("                       Liste des articles de moins de 50€                                                        ");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");

        // Creation de l'objet SearchService
        Searchservice searchservice = new Searchservice(); 

        // Une nouvelle liste auquel on affecte la méthode FilteredByPrice en lui passant la liste complète du catalogue et le montant du prix max en paramètres
        List<Surfitem> FilteredItems = searchservice.FilterByPrice(ListCatalog, 50.0);

        for (Surfitem itemtofilter : FilteredItems) {
            System.out.println("Name : " + itemtofilter.getName() + " | Price : " + itemtofilter.getPrice() + "€");
        }













        





    }
    

}
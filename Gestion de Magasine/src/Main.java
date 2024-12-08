

public class Main {
    public static void main(String[] args) {
        // Création des magasins
        Magasin carrefour = new Magasin(1, "Carrefour", "Centre-Ville");
        Magasin monoprix = new Magasin(2, "Monoprix", "Menzah 6");

        // Création des employés pour Carrefour
        Employe caissier1 = new Caissier(101, "Ali", "Tunis", 180, 1);
        Employe vendeur1 = new Vendeur(103, "Mouna", "Tunis", 160, 20);
        Employe responsable1 = new Responsable(104, "Fatma", "Tunis", 170, 300);

        carrefour.ajouterEmploye(caissier1);
        carrefour.ajouterEmploye(vendeur1);
        carrefour.ajouterEmploye(responsable1);

        // Création des employés pour Monoprix
        Employe caissier2 = new Caissier(105, "Sami", "Manouba", 190, 2);
        Employe vendeur2 = new Vendeur(106, "Sara", "Nabeul", 170, 25);
        Employe responsable2 = new Responsable(108, "Karim", "Ben Arous", 180, 400);

        monoprix.ajouterEmploye(caissier2);
        monoprix.ajouterEmploye(vendeur2);
        monoprix.ajouterEmploye(responsable2);

        // Ajout des produits
        carrefour.ajouterProduit(new Produit(1, "Lait", 1.2f));
        carrefour.ajouterProduit(new Produit(2, "Pain", 0.5f));
        monoprix.ajouterProduit(new Produit(3, "Fromage", 3.5f));
        monoprix.ajouterProduit(new Produit(4, "Jus", 2.5f));

        // Affichage des détails des magasins
        System.out.println(carrefour);
        System.out.println(monoprix);

        // Calcul et affichage des salaires
        System.out.println("Salaire de Ali : " + caissier1.calculerSalaire());
        System.out.println("Salaire de Fatma : " + responsable1.calculerSalaire());
        System.out.println("Salaire de Sara : " + vendeur2.calculerSalaire());
    }
}

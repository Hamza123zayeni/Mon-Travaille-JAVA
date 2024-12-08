public class Main {
    public static void main(String[] args) {
        // Création des magasins
        Magasin magasin1 = new Magasin(1, "Carrefour", "Centre-Ville");
        Magasin magasin2 = new Magasin(2, "Monoprix", "Menzah 6");

        // Création des employés pour le magasin 1
        Caissier caissier1 = new Caissier(1, "Ahmed", "Tunis", 190, 101);
        Vendeur vendeur1 = new Vendeur(2, "Sami", "Tunis", 160, 0.1);
        Responsable responsable1 = new Responsable(3, "Sophie", "Tunis", 170, 100);

        // Création des employés pour le magasin 2
        Caissier caissier2 = new Caissier(4, "Sami", "Tunis", 185, 102);
        Vendeur vendeur2 = new Vendeur(5, "Hassan", "Tunis", 150, 0.15);
        Vendeur vendeur3 = new Vendeur(6, "Ali", "Tunis", 160, 0.12);
        Vendeur vendeur4 = new Vendeur(7, "Rami", "Tunis", 155, 0.2);
        Responsable responsable2 = new Responsable(8, "Leila", "Tunis", 165, 150);

        // Ajout des employés aux magasins
        magasin1.ajouterEmploye(caissier1);
        magasin1.ajouterEmploye(vendeur1);
        magasin1.ajouterEmploye(responsable1);

        magasin2.ajouterEmploye(caissier2);
        magasin2.ajouterEmploye(vendeur2);
        magasin2.ajouterEmploye(vendeur3);
        magasin2.ajouterEmploye(vendeur4);
        magasin2.ajouterEmploye(responsable2);

        // Ajout des produits
        magasin1.ajouterProduit(new Produit(1, "Pain", 1.5));
        magasin1.ajouterProduit(new Produit(2, "Lait", 2.0));

        magasin2.ajouterProduit(new Produit(3, "Café", 5.0));
        magasin2.ajouterProduit(new Produit(4, "Sucre", 3.0));

        // Affichage des détails des magasins
        magasin1.afficherDetails();
        magasin2.afficherDetails();
    }
}

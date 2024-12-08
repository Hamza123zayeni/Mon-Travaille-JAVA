public class Main {
    public static void main(String[] args) {
        // Création de deux produits
        Produit produit1 = new Produit(1, "chockola", 100.0);
        Produit produit2 = new Produit(1, "chockola", 100.0);
        Produit produit3 = new Produit(2, "Frese", 200.0);

        // Comparaison avec la méthode d'instance
        System.out.println("Produit1 est identique à Produit2 : " + produit1.comparer(produit2)); // true
        System.out.println("Produit1 est identique à Produit3 : " + produit1.comparer(produit3)); // false

        // Comparaison avec la méthode statique
        System.out.println("Produit2 est identique à Produit3 : " + Produit.comparer(produit2, produit3)); // false
    }
}

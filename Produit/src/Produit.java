public class Produit {
    private int id;
    private String libelle;
    private double prix;

    // Constructeur
    public Produit(int id, String libelle, double prix) {
        this.id = id;
        this.libelle = libelle;
        this.prix = prix;
    }

    // Getter pour id
    public int getId() {
        return id;
    }

    // Getter pour libelle
    public String getLibelle() {
        return libelle;
    }

    // Getter pour prix
    public double getPrix() {
        return prix;
    }

    // Méthode comparer avec un produit passé en paramètre
    public boolean comparer(Produit autreProduit) {
        return this.id == autreProduit.id &&
                this.libelle.equals(autreProduit.libelle) &&
                this.prix == autreProduit.prix;
    }

    // Méthode statique comparer avec deux produits passés en paramètre
    public static boolean comparer(Produit produit1, Produit produit2) {
        return produit1.id == produit2.id &&
                produit1.libelle.equals(produit2.libelle) &&
                produit1.prix == produit2.prix;
    }
}


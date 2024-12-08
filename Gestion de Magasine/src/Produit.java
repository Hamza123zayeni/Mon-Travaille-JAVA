

public class Produit {
    private int identifiant;
    private String libelle;
    private float prix;

    public Produit(int identifiant, String libelle, float prix) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.prix = prix;
    }

    public boolean comparer(Produit p) {
        return this.identifiant == p.identifiant &&
                this.libelle.equalsIgnoreCase(p.libelle) &&
                this.prix == p.prix;
    }

    public static boolean comparer(Produit p1, Produit p2) {
        return p1.identifiant == p2.identifiant &&
                p1.libelle.equalsIgnoreCase(p2.libelle) &&
                p1.prix == p2.prix;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "identifiant=" + identifiant +
                ", libelle='" + libelle + '\'' +
                ", prix=" + prix +
                '}';
    }
}








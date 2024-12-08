public class Main {
    public static void main(String[] args) {
        Magasin magasin = new Magasin(2, 2);

        ArticlesElectromenagers frigo = new ArticlesElectromenagers(500, 700, "Frigo", "ElectroWorld");
        ArticlesPrimeurs pomme = new ArticlesPrimeurs(1, 2, "Pomme", "PrimeurLocal");

        magasin.ajouterElectromenager(frigo, 0);
        magasin.ajouterPrimeur(pomme, 0);

        frigo.remplirStock(10);
        pomme.remplirStock(100);

        magasin.afficherEtatMagasin();
    }
}
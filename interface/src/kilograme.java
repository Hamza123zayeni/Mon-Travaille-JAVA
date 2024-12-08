// Interface pour les produits vendus au kilogramme
interface VendableParKilogramme {
    double vendre(double quantite, double prixVente);
}

// Interface pour les produits vendus par pièce
interface VendableParPiece {
    double vendre(int quantite, double prixVente);
}

// Interface pour les articles soldés
interface Soldable {
    void terminerSolde(double pourcentage);
    void lancerSolde(double pourcentage);
}

// Classe Article (superclasse abstraite)
abstract class Article {
    protected double prixAchat;
    protected double prixVente;
    protected String nom;
    protected String fournisseur;

    public Article(double prixAchat, double prixVente, String nom, String fournisseur) {
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.nom = nom;
        this.fournisseur = fournisseur;
    }

    public double calculerRendement() {
        return (prixVente - prixAchat) / prixAchat;
    }

    public void afficherCaracteristiques() {
        System.out.println("Nom: " + nom);
        System.out.println("Fournisseur: " + fournisseur);
        System.out.println("Prix d'achat: " + prixAchat);
        System.out.println("Prix de vente: " + prixVente);
        System.out.println("Rendement: " + calculerRendement());
    }
}

// Classe ArticlesElectromenagers (hérite de Article)
class ArticlesElectromenagers extends Article implements Soldable {
    private int stock;

    public ArticlesElectromenagers(double prixAchat, double prixVente, String nom, String fournisseur) {
        super(prixAchat, prixVente, nom, fournisseur);
        this.stock = 0;
    }

    public void remplirStock(int quantite) {
        stock += quantite;
    }

    @Override
    public void lancerSolde(double pourcentage) {
        prixVente -= prixVente * (pourcentage / 100);
    }

    @Override
    public void terminerSolde(double pourcentage) {
        prixVente += prixVente * (pourcentage / 100);
    }

    public void afficherStock() {
        System.out.println("Stock: " + stock);
    }
}

// Classe ArticlesPrimeurs (hérite de Article)
class ArticlesPrimeurs extends Article implements VendableParKilogramme {
    private double stock;

    public ArticlesPrimeurs(double prixAchat, double prixVente, String nom, String fournisseur) {
        super(prixAchat, prixVente, nom, fournisseur);
        this.stock = 0;
    }

    public void remplirStock(double quantite) {
        stock += quantite;
    }

    @Override
    public double vendre(double quantite, double prixVente) {
        if (quantite <= stock) {
            stock -= quantite;
            return quantite * prixVente;
        } else {
            System.out.println("Stock insuffisant !");
            return 0;
        }
    }

    public void afficherStock() {
        System.out.println("Stock: " + stock + " kg");
    }
}

// Classe Magasin
class Magasin {
    private double depenses;
    private double revenus;
    private ArticlesElectromenagers[] electromenagers;
    private ArticlesPrimeurs[] primeurs;

    public Magasin(int tailleElectro, int taillePrimeurs) {
        this.electromenagers = new ArticlesElectromenagers[tailleElectro];
        this.primeurs = new ArticlesPrimeurs[taillePrimeurs];
    }

    public void ajouterElectromenager(ArticlesElectromenagers article, int index) {
        electromenagers[index] = article;
    }

    public void ajouterPrimeur(ArticlesPrimeurs article, int index) {
        primeurs[index] = article;
    }

    public void afficherEtatMagasin() {
        System.out.println("Dépenses: " + depenses);
        System.out.println("Revenus: " + revenus);
        System.out.println("Articles électroménagers:");
        for (ArticlesElectromenagers article : electromenagers) {
            if (article != null) {
                article.afficherCaracteristiques();
                article.afficherStock();
            }
        }
        System.out.println("Articles primeurs:");
        for (ArticlesPrimeurs article : primeurs) {
            if (article != null) {
                article.afficherCaracteristiques();
                article.afficherStock();
            }
        }
    }

    public void calculerRendementTotal() {
        double rendement = (revenus - depenses) / depenses;
        System.out.println("Rendement total: " + rendement);
    }
}




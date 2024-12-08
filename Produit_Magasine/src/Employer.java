public abstract class Employer {
    protected int id;
    protected String nom;
    protected String adresse;
    protected int nbrHeuresParMois;

    public Employer(int id, String nom, String adresse, int nbrHeuresParMois) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbrHeuresParMois = nbrHeuresParMois;
    }

    public abstract double calculerSalaire();

    @Override
    public String toString() {
        return "ID: " + id + ", Nom: " + nom + ", Adresse: " + adresse + ", Heures/Mois: " + nbrHeuresParMois;
    }
}
 class Caissier extends Employer {
    private int numeroDeCaisse;

    public Caissier(int id, String nom, String adresse, int nbrHeuresParMois, int numeroDeCaisse) {
        super(id, nom, adresse, nbrHeuresParMois);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public double calculerSalaire() {
        double salaireBase = nbrHeuresParMois * 5;
        if (nbrHeuresParMois > 180) {
            salaireBase += (nbrHeuresParMois - 180) * 5 * 0.15;
        }
        return salaireBase;
    }

    @Override
    public String toString() {
        return super.toString() + ", Numéro de Caisse: " + numeroDeCaisse;
    }
}
class Responsable extends Employer {
    private double prime;

    public Responsable(int id, String nom, String adresse, int nbrHeuresParMois, double prime) {
        super(id, nom, adresse, nbrHeuresParMois);
        this.prime = prime;
    }

    @Override
    public double calculerSalaire() {
        double salaireBase = nbrHeuresParMois * 10;
        if (nbrHeuresParMois > 160) {
            salaireBase += (nbrHeuresParMois - 160) * 10 * 0.20;
        }
        return salaireBase + prime;
    }

    @Override
    public String toString() {
        return super.toString() + ", Prime: " + prime;
    }
}
 class Vendeur extends Employer {
    private double tauxDeVente;

    public Vendeur(int id, String nom, String adresse, int nbrHeuresParMois, double tauxDeVente) {
        super(id, nom, adresse, nbrHeuresParMois);
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public double calculerSalaire() {
        return 450 * tauxDeVente;
    }

    @Override
    public String toString() {
        return super.toString() + ", Taux de Vente: " + tauxDeVente;
    }
}
class Produit {
    public int id;
    public String nom;
    public double prix;

    public Produit(int id, String nom, double prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit ID: " + id + ", Nom: " + nom + ", Prix: " + prix + " DT";
    }
}


 class Magasin {
    public int id;
    public String nom;
    public String adresse;
    public Employer[] employes = new Employer[20];
    public Produit[] produits = new Produit[20];
    public int nbEmployes = 0; // Pour suivre le nombre d'employés ajoutés
    public int nbProduits = 0; // Pour suivre le nombre de produits ajoutés
    public Magasin(int id, String nom, String adresse) {
            this.id = id;
            this.nom = nom;
            this.adresse = adresse;
    }

    public void ajouterEmploye(Employer employe) {
            if (nbEmployes < 20) {
                employes[nbEmployes] = employe; // Ajouter l'employé au tableau
                nbEmployes++; // Incrémenter le nombre d'employés
            } else {
                System.out.println("Le magasin a atteint la limite d'employés.");
            }
        }

        public void ajouterProduit(Produit produit) {
            if (nbProduits < 20) {
                produits[nbProduits] = produit; // Ajouter le produit au tableau
                nbProduits++; // Incrémenter le nombre de produits
            } else {
                System.out.println("Le magasin a atteint la limite de produits.");
            }
        }

        public void afficherDetails() {
            System.out.println("Magasin ID: " + id + ", Nom: " + nom + ", Adresse: " + adresse);
            System.out.println("Capacité maximale d'employés: 20");

            System.out.println("Produits: ");
            for (int i = 0; i < nbProduits; i++) {
                System.out.println(produits[i]);
            }

            System.out.println("Employés: ");
            for (int i = 0; i < nbEmployes; i++) {
                System.out.println(employes[i]);
                System.out.println("Salaire: " + employes[i].calculerSalaire() + " DT");
            }
        }
    }









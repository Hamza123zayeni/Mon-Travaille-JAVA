public abstract class Employe {
    protected int id;
    protected String nom;
    protected String adresse;
    protected int nbrHeures;

    public Employe(int id, String nom, String adresse, int nbrHeures) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbrHeures = nbrHeures;
    }
    public abstract double calculerSalaire();

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", nbrHeures=" + nbrHeures +
                '}';
    }
}
public class Caissier extends Employe {
    private int numeroDeCaisse;

    public Caissier(int id, String nom, String adresse, int nbrHeures, int numeroDeCaisse) {
        super(id, nom, adresse, nbrHeures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public double calculerSalaire() {
        double salaire = nbrHeures * 5;
        if (nbrHeures > 180) {
            salaire += (nbrHeures - 180) * 5 * 0.15;
        }
        return salaire;
    }

    @Override
    public String toString() {
        return super.toString() + ", Caissier{" + "numeroDeCaisse=" + numeroDeCaisse + '}';
    }
}

public class Caissier extends Employe {
    private int numeroDeCaisse;

    public Caissier(int id, String nom, String adresse, int nbrHeures, int numeroDeCaisse) {
        super(id, nom, adresse, nbrHeures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public double calculerSalaire() {
        double salaire = nbrHeures * 5;
        if (nbrHeures > 180) {
            salaire += (nbrHeures - 180) * 5 * 0.15;
        }
        return salaire;
    }

    @Override
    public String toString() {
        return super.toString() + ", Caissier{" + "numeroDeCaisse=" + numeroDeCaisse + '}';
    }
}
public class Vendeur extends Employe {
    private double tauxDeVente;

    public Vendeur(int id, String nom, String adresse, int nbrHeures, double tauxDeVente) {
        super(id, nom, adresse, nbrHeures);
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public double calculerSalaire() {
        return 450 * (tauxDeVente / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", Vendeur{" + "tauxDeVente=" + tauxDeVente + '}';
    }
}

public class Responsable extends Employe {
    private double prime;

    public Responsable(int id, String nom, String adresse, int nbrHeures, double prime) {
        super(id, nom, adresse, nbrHeures);
        this.prime = prime;
    }

    @Override
    public double calculerSalaire() {
        double salaire = nbrHeures * 10 + prime;
        if (nbrHeures > 160) {
            salaire += (nbrHeures - 160) * 10 * 0.2;
        }
        return salaire;
    }

    @Override
    public String toString() {
        return super.toString() + ", Responsable{" + "prime=" + prime + '}';
    }
}
public class Magasin {
    private int identifiant;
    private String nom;
    private String adresse;
    private List<Produit> produits;
    private List<Employe> employes;

    public Magasin(int identifiant, String nom, String adresse) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.produits = new ArrayList<>();
        this.employes = new ArrayList<>();
    }

    public void ajouterProduit(Produit p) {
        for (Produit prod : produits) {
            if (prod.comparer(p)) {
                System.out.println("Produit déjà existant !");
                return;
            }
        }
        produits.add(p);
    }

    public void ajouterEmploye(Employe e) {
        if (employes.size() < 20) {
            employes.add(e);
        } else {
            System.out.println("Limite d'employés atteinte !");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Magasin{" +
                "identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", produits=\n");
        for (Produit p : produits) {
            sb.append(p.toString()).append("\n");
        }
        sb.append("employes=\n");
        for (Employe e : employes) {
            sb.append(e.toString()).append("\n");
        }
        return sb.toString();
    }
}

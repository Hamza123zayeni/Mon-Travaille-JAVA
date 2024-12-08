abstract class Ustensile {
    private int anneeFab;
    public Ustensile(int anneeFab) {
        this.anneeFab = anneeFab;
    }

    public int getAnneeFab() {
        return anneeFab;
    }

    public void setAnneeFab(int anneeFab) {
        this.anneeFab = anneeFab;
    }


    public abstract double calculeValeur();
}


abstract class Assiette extends Ustensile {

    public Assiette(int anneeFab) {
        super(anneeFab);
    }


    public abstract double calculerSurface();
}


class AssietteRonde extends Assiette {
    private double rayon;

    public AssietteRonde(int anneeFab, double rayon) {
        super(anneeFab);
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }


    public double calculeValeur() {

        int age = 2024 - getAnneeFab();
        if (age < 50) {
            return 0;
        }
        return age - 50;
    }


    public double calculerSurface() {
        return Math.PI * rayon * rayon;
    }
}


class AssietteCarree extends Assiette {
    private double cote;

    public AssietteCarree(int anneeFab, double cote) {
        super(anneeFab);
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }


    public double calculeValeur() {

        int age = 2024 - getAnneeFab();
        if (age < 50) {
            return 0;
        }
        return 5 * (age - 50);
    }


    public double calculerSurface() {
        return cote * cote;
    }
}


abstract class Cuillere extends Ustensile {
    private double longueur;

    public Cuillere(int anneeFab, double longueur) {
        super(anneeFab);
        this.longueur = longueur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }


    public double calculeValeur() {

        int age = 2024 - getAnneeFab();
        if (age < 50) {
            return 0;
        }
        return age - 50;
    }
}
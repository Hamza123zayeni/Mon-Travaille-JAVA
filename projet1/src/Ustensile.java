public abstract class Ustensile {
    private int annfab;

    public Ustensile(int annfab) {
        this.annfab = annfab;
    }

    public int getAnnfab() {
        return annfab;
    }

    public void setAnnfab(int annfab) {
        this.annfab = annfab;
    }

    public abstract double calculeValeur();
}

abstract class Assiette extends Ustensile {
    public Assiette(int annfab) {
        super(annfab);
    }
}

class AssietteRonde extends Assiette {
    private double rayon;

    public AssietteRonde(int annfab, double rayon) {
        super(annfab);
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }


    public double calculeValeur() {
        return 2024 - getAnnfab() - 50;
    }

    public double calculesurface() {
        return 3.14*getRayon()*getRayon() ;
    }
}

class AssietteCaree extends Assiette {
    private double cote;

    public AssietteCaree(int annfab, double cote) {
        super(annfab);
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    @Override
    public double calculeValeur() {
        return (2024 - getAnnfab()) *5;
    }

    public double calculesurface() {
        return getCote()*getCote() ;
    }
}

abstract class Cuillere extends Ustensile {
    private double longueur;

    public Cuillere(int annfab, double longueur) {
        super(annfab);
        this.longueur = longueur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }
}



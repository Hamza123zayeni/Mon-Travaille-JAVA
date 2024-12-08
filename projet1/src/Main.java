import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // 6) Create 5 objects of the hierarchy and store them in an array
        Ustensile[] us = new Ustensile[5];
        us[0] = new AssietteRonde(2000, 5); // Year: 2000, Radius: 5
        us[1] = new AssietteCaree(2010, 4); // Year: 2010, Side: 4
        us[2] = new AssietteRonde(1995, 3); // Year: 1995, Radius: 3
        us[3] = new CuillereSoup(2018, 12); // Year: 2018, Length: 12
        us[4] = new CuillereDessert(2015, 10); // Year: 2015, Length: 10

        // 7) Count and display the number of Cuillere objects
        afficherCuilleres(us);

        // 8) Calculate and display the total surface area of all Assiettes
        afficherSurfaceAssiettes(us);

        // 9) Calculate and display the total value of all Ustensiles
        afficherValeurTotale(us);
    }

    // 7) Method to count and display the number of Cuillere objects
    public static void afficherCuilleres(Ustensile[] us) {
        int count = 0;
        for (int i=0;i<us.length;i++) {
            if (us[i] instanceof Cuillere) {
                count++;
            }
        }
        System.out.println("Il y a " + count + " cuillères.");
    }

    // 8) Method to calculate and display the total surface area of Assiettes
    public static void afficherSurfaceAssiettes(Ustensile[] us) {
        double totalSurface = 0;
        for (int i=0;i<us.length;i++) {
            if (us[i]instanceof AssietteRonde) {
                AssietteRonde ronde = (AssietteRonde) us[i];
                totalSurface += Math.PI * ronde.getRayon() * ronde.getRayon(); // Area of a circle
            } else if (us[i] instanceof AssietteCaree) {
                AssietteCaree caree = (AssietteCaree) us[i];
                totalSurface += caree.getCote() * caree.getCote(); // Area of a square
            }
        }
        System.out.println("Surface totale des assiettes : " + totalSurface);
    }

    // 9) Method to calculate and display the total value of all Ustensiles
    public static void afficherValeurTotale(Ustensile[] us) {
        double totalValue = 0;
        for (int i=0;i<us.length;i++) {
            totalValue += us[i].calculeValeur();
        }
        System.out.println("Valeur totale de la collection : " + totalValue);
    }
}

// Adding concrete classes for Cuillere
class CuillereSoup extends Cuillere {
    public CuillereSoup(int annfab, double longueur) {
        super(annfab, longueur);
    }


    public double calculeValeur() {
        return getLongueur() * 0.5; // Example calculation for value
    }
}

class CuillereDessert extends Cuillere {
    public CuillereDessert(int annfab, double longueur) {
        super(annfab, longueur);
    }


    public double calculeValeur() {
        return getLongueur() * 0.3; // Example calculation for value
    }
}

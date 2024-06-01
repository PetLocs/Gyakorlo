package main;

public class Gyakorlo {

    static final int N = 5;
    static int[] sorozat = new int[N]; //{-2, 4, 7, 10, 0};
    static int min = -2;
    static int max = 10;
    static String kimenet = "";
    
    public static void main(String[] args) {
        feladatok();
    }

    private static void feladatok() {
        feltoltes();
        progtetelek();
        kiirKonzolra();
    }    

    private static void progtetelek() {
        osszegzes();
        megszamolas(4); //kisebb mint paraméter
        minKivalasztas();
        maxKivalasztas();
        kivalasztas();
        eldontesEgy();
        eldontesMind();
        linKereses();
    }

    private static int osszegzes(){
        int sum = 0;
        for (int elem : sorozat) {
            sum += elem;
        }
        return sum;
    }
    
    private static int megszamolas(int feltetel) {
        int szamlalo = 0;
        for (int elem : sorozat) {
            if (elem < feltetel) {
                szamlalo++;
            }
        }
        return szamlalo;
    }

    private static int minKivalasztas() {
        int min = sorozat[0];
        for (int elem : sorozat) {
            if (elem < min) {
                min = elem;
            }
        }
        return min;
    }

    private static int maxKivalasztas() {
        int max = sorozat[0];
        for (int elem : sorozat) {
            if (elem > max) {
                max = elem;
            }
        }
        return max;
    }
    
    private static int kivalasztas() {
        return 0;
    }

    private static boolean eldontesEgy() {
        return false;
    }
    
    private static boolean eldontesMind() {
        return false;
    }
    
    private static int linKereses() {
        return 0;
    }
    
    private static void kiirKonzolra() {
        kimenet += "A tömb elemei:\n";
        for (int elem : sorozat) {
            kimenet += elem + " ";
        }
        System.out.println(kimenet);
    }

    private static void feltoltes() {
        for (int elem : sorozat) {
            elem = (int)((Math.random() * (max - min)) + min);
        }
    }
    
}

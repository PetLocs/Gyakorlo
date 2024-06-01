package main;

public class Gyakorlo {

    static final int N = 5;
    static int[] sorozat = new int[N];
    static int min = -2;
    static int max = 10;
    
    public static void main(String[] args) {
        feladatok();
    }

    private static void feladatok() {
        feltoltes();
        progtetelek();
        kiirKonzolra("");
    }    

    private static void progtetelek() {
        osszegzes();
        megszamolas();
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
    
    private static int megszamolas() {
        return 0;
    }

    private static int minKivalasztas() {
        return 0;
    }

    private static int maxKivalasztas() {
        return 0;
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
    
    private static void kiirKonzolra(String kimenet) {
        System.out.println(kimenet);
    }

    private static void feltoltes() {
        for (int elem : sorozat) {
            elem = (int)(Math.random() * (max - min) + min);
        }
    }
    
}

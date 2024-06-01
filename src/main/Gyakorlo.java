package main;

public class Gyakorlo {

    static final int N = 5;
    static int[] sorozat = new int[N]; //{-2, 4, 7, 10, 0};
    static int min = -2;
    static int max = 10;
    static String kimenet = "";
    static int feltetel_01 = 4;
    static int feltetel_02 = 2;
    static int feltetel_03 = 3;
    static int feltetel_04 = 7;
    
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
        int szamlalo = 0;
        for (int elem : sorozat) {
            if (elem < feltetel_01) {
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
        int index = 0;
        while (sorozat[index] != sorozat[feltetel_02]) {
            index++;
        }
        return sorozat[feltetel_02];
    }

    private static boolean eldontesEgy() {
        int index = 0;
        while (index < N && sorozat[index] >= feltetel_03) {
            index++;
        }
        return index < N;
    }
    
    private static boolean eldontesMind() {
        int index = 0;
        while (index < N && sorozat[index] >10) {
            index++;
        }
        return index >= N;
    }
    
    private static int linKereses() {
        int index = 0;
        while (index < N && sorozat[index] <= feltetel_04) {
            index++;
        }
        if (index < N) {
            return index + 1;
        }else{
            return -1;            
        }
    }
    
    private static void kiirKonzolra() {
        kimenet += "A tömb elemei: \n[ ";
        for (int elem : sorozat) {
            kimenet += elem + " ";
        }
        /* összegzés */
        kimenet += "]\nÖsszege: " + osszegzes() + "\n";
        /* megszámolás */
        kimenet += "kisebb, mint " + feltetel_01 + ": " + megszamolas() + " db\n";
        /* min */
        kimenet += "Minimuma: " + minKivalasztas() + "\n";
        /* max */
        kimenet += "Maximuma: " + maxKivalasztas() + "\n";
        /* kiváálasztás */
        kimenet += (feltetel_02 + 1) + ". elem: " + kivalasztas() + "\n";
        /* eldöntésEgy */
        kimenet += "Van-e olyan szám, ami kisebb, mint " + feltetel_03 + "? ";
        kimenet += eldontesEgy() ? "Van.\n" : "Nincs.\n";
        /* eldöntésMind */
        kimenet += "Van-e olyan szám, ami nagyobb, mint " + feltetel_03 + "? ";
        kimenet += eldontesEgy() ? "Van.\n" : "Nincs.\n";
        /* linKeresés */
        kimenet += "Első szám, ami nagyobb, mint " + feltetel_04 + "? ";
        kimenet += linKereses() == -1 ? "Nincs iyen elem!\n" : linKereses() + ". helyen\n";      
        System.out.println(kimenet);
    }

    private static void feltoltes() {
        for (int i = 0; i < N; i++) {
            sorozat[i] = (int)((Math.random() * (max - min)) + min);
        }
    }
    
}

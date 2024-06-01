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
        megszamolas(feltetel_01); //kisebb mint paraméter
        minKivalasztas();
        maxKivalasztas();
        kivalasztas(feltetel_02); //paraméter indexű elem
        eldontesEgy(feltetel_03);
        eldontesMind();
        linKereses(feltetel_04); //első paraméternél nagyobb elem
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
    
    private static int kivalasztas(int feltetel) {
        int index = 0;
        while (sorozat[index] != sorozat[feltetel]) {
            index++;
        }
        return sorozat[feltetel];
    }

    private static boolean eldontesEgy(int feltetel) {
        int index = 0;
        while (index < N && sorozat[index] >= feltetel) {
            index++;
        }
        if (index < N ){
            return true;
        }else{
            return false;            
        }
    }
    
    private static boolean eldontesMind() {
        
        return false;
    }
    
    private static int linKereses(int feltetel) {
        int index = 0;
        while (sorozat[index] <= feltetel) {
            index++;
            if (index < N) {
            }else{
                return -1;
            }
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
        kimenet += "kisebb, mint " + feltetel_01 + ": " + megszamolas(feltetel_01) + " db\n";
        /* min */
        kimenet += "Minimuma: " + minKivalasztas() + "\n";
        /* max */
        kimenet += "Maximuma: " + maxKivalasztas() + "\n";
        /* kiváálasztás */
        kimenet += (feltetel_02 + 1) + ". elem: " + kivalasztas(feltetel_02) + "\n";
        /* eldöntésEgy */
        kimenet += "Van-e olyan szám, ami kisebb, mint " + feltetel_03 + "? ";
        kimenet += eldontesEgy(feltetel_03) ? "Van.\n" : "Nincs.\n";
        /* eldöntésMind */
        /* linKeresés */
        kimenet += "Első szám, ami nagyobb, mint " + feltetel_04 + "? ";
        kimenet += linKereses(feltetel_04) == -1 ? "Nincs iyen elem!\n" : linKereses(feltetel_04) + ". helyen\n";      
        System.out.println(kimenet);
    }

    private static void feltoltes() {
        for (int i = 0; i < N; i++) {
            sorozat[i] = (int)((Math.random() * (max - min)) + min);
        }
    }
    
}

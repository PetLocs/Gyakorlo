package main;

public class Gyakorlo {

    static final int N = 5;
    static int[] sorozat = new int[N]; //{-2, 4, 7, 10, 0};
    static int min = -2;
    static int max = 10;
    static String kimenet = "";
    static int feltetel1 = 4;
    static int feltetel2 = 2;
    static int feltetel3 = 0;
    
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
        megszamolas(feltetel1); //kisebb mint paraméter
        minKivalasztas();
        maxKivalasztas();
        kivalasztas(feltetel2); //paraméter indexű elem
        eldontesEgy();
        eldontesMind();
        linKereses(feltetel2);
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

    private static boolean eldontesEgy() {
        return false;
    }
    
    private static boolean eldontesMind() {
        return false;
    }
    
    private static int linKereses(int feltetel) {
        int index = 0;
        while (sorozat[index] != feltetel) {
            if (index < N -1) {
                index++;
            }else{
                break;
            }
        }
        if (index < N - 1) {
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
        kimenet += "]\nÖsszege: " + osszegzes() + "\n";
        kimenet += "kisebb, mint " + feltetel1 + ": " + megszamolas(feltetel1) + " db\n";
        kimenet += "Minimuma: " + minKivalasztas() + "\n";
        kimenet += "Maximuma: " + maxKivalasztas() + "\n";
        kimenet += (feltetel2 + 1) + ". elem: " + kivalasztas(feltetel2) + "\n";
        kimenet += feltetel3 + " hol szerepel először? ";
        if (linKereses(feltetel3) == -1) {
            kimenet += "Nincs iyen elem!\n" ;
        }else{
            kimenet += linKereses(feltetel3) + ". helyen\n";            
        }
        System.out.println(kimenet);
    }

    private static void feltoltes() {
        for (int i = 0; i < sorozat.length; i++) {
            sorozat[i] = (int)((Math.random() * (max - min)) + min);
        }
    }
    
}

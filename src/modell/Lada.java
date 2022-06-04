package modell;

public class Lada {
    private static final char URES_LADA = 'O';
    private static final char KINCSES_LADA = 'X';
    private static char[] ladak;
    
    public Lada() {
       feltoltes();
    }
    
    public Lada(char[] ladak) {
        this.ladak = ladak;
    }
    
    public static void feltoltes() {
        ladak = new char[3];
        for(int i = 0; i < ladak.length; i++) ladak[i] = URES_LADA;
        ladak[ladak.length - 1] = KINCSES_LADA;
    }
    
    public static char getURES_LADA() {
        return URES_LADA;
    }

    public static char getKINCSES_LADA() {
        return KINCSES_LADA;
    }

    public static char[] getLadak() {
        return ladak;
    }
}

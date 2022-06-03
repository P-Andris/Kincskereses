package modell;

public class Lada {
    private static final char URES_LADA = 'O';
    private static final char KINCSES_LADA = 'X';
    private static char[] ladak;
    
    public Lada() {
    
    }
    
    public Lada(char[] ladak) {
        this.ladak = ladak;
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

    /* public static void setLadak(char[] ladak) {
        for(int i = 0; i < 3; i++) ladak[i] = URES_LADA;
        ladak[2] = KINCSES_LADA;
    } */
}

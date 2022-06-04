package teszt;

import modell.Lada;

public class KincskeresesTeszt {
    private static Lada lada;
    private static char ures = Lada.getURES_LADA();
    private static char kincses = Lada.getKINCSES_LADA();
    
    public static void main(String[] args) {
        lada = new Lada(new char[] {kincses, ures, ures});
        
        tesztKincsesLada(0);
        // tesztKincsesLada(2);
        
        tesztUresLada(1);
        tesztUresLada(2);
        // tesztUresLada(0);
    }
    
    public static void tesztKincsesLada(int szam) {
        // System.out.println(lada.getLadak()[szam]);
        assert lada.getLadak()[szam] == kincses : "Tesztelés megbukott";
        System.out.println("tesztKincsesLada sikeres");
    }
    
    public static void tesztUresLada(int szam) {
        // System.out.println(lada.getLadak()[szam]);
        assert lada.getLadak()[szam] == ures : "Tesztelés megbukott";
        System.out.println("tesztUresLada sikeres");
    }
}

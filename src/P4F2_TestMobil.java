public class P4F2_TestMobil {
    public static void main(String[] args) {
        P4F1_Mobil avanza = new P4F1_Mobil("Innova", "BM3210");
        avanza.jmlRoda = 4;
        avanza.bahanBakar = "Solar";
        avanza.fullAC = true;
        System.out.println(avanza.getInfo());
    }
}

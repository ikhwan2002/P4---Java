
public class P4P_MethodF {
    public static void main(String[] args) {
        P4O1_Orang daru = new P4O1_Orang("Daru Nugroho",20);
        cetakP4O1_Orang(daru);
    }
    private static void cetakP4O1_Orang(P4O1_Orang orang){
        System.out.println("Nama = " + orang.nama);
        System.out.println("Umur = " + orang.umur + " tahun");
    }
}

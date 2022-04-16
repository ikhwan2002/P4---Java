public class P4O2_TestOrang {
    public static void main(String[] args) {
        P4O1_Orang badu = new P4O1_Orang();
        badu.nama = "Badu";
        badu.umur = 12;
        System.out.println("Nama : " + badu.nama);
        System.out.println("Umur : " + badu.umur + " tahun.");
        badu.tertawa();
        System.out.println();

        P4O1_Orang dodo = new P4O1_Orang("Dodo", 10);
        System.out.println("Nama : " + dodo.nama);
        System.out.println("Umur : " + dodo.umur + " tahun.");
        dodo.menangis();

        System.out.println();

        P4O1_Orang jono = new P4O1_Orang("Jono",12,168,76);
        System.out.println("Nama : " + jono.nama);
        System.out.println("Umur : " + jono.umur + " tahun.");
        System.out.println("Tinggi Badan : " + jono.tinggiBadan + " cm.");
        System.out.println("Berat Badan : " + jono.beratBadan + " kg.");
        jono.tertawa();
    }
}

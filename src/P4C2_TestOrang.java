public class P4C2_TestOrang {
    public static void main(String[] args) {
        P4C1_Orang dido = new P4C1_Orang();
        dido.nama = "Dido";
        dido.umur = 4;
        System.out.println("Nama : " + dido.nama);
        System.out.println("umur : " + dido.umur + " tahun.");
        dido.menangis();

        System.out.println();

        P4C1_Orang dodo = new P4C1_Orang("Dodo");
        System.out.println("Nama : " + dodo.nama);
        System.out.println("Umur : " + dodo.umur + " tahun.");
        dodo.tertawa();
    }
}

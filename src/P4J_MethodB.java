public class P4J_MethodB {
    private static int bilA, bilB;

    public static void main(String[] args) {
        bilA = 3;
        bilB = 5;
        int hasiltambah = tambah();
        System.out.println("Hasil Tambah = " + hasiltambah);
    }
    private static int tambah(){
        return (bilA + bilB);
    }
}

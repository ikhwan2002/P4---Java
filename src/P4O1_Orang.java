public class P4O1_Orang {

    String nama;
    int umur;
    String warnaRambut;
    String warnaKulit;
    int tinggiBadan;
    int beratBadan;

    public P4O1_Orang(){
    }

    public P4O1_Orang(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    public P4O1_Orang(String nama, int umur, int tinggiBadan, int beratBadan){
        this(nama,umur);
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
    }

    public void menangis(){
        System.out.println("hu.... Hu....");
    }

    public void tertawa(){
        System.out.println("Ha... Ha...");
    }
}

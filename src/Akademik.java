public class Akademik {
    int nim;
    String nama;
    String matkul;
    int sks;
    String dosen;
    int nidn;
    double nilaiakhir;
    int absen;
    int tugas;
    int uts;
    int uas;

    public Akademik(){}

    public Akademik(int nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }
    public Akademik(String matkul, int sks){
        this.matkul = matkul;
        this.sks = sks;
    }
    public Akademik(int nidn){
        this.nidn = nidn;
    }
    public Akademik(String dosen){
        this.dosen = dosen;
    }
    public void nilaiabsen(int absen){
        System.out.println("Nilai Absen : " +absen);
    }
    public void nilaitugas(int tugas){
        System.out.println("Nilai Tugas : " +tugas);
    }
    public void nilaiuts(int uts){
        System.out.println("Nilai UTS : " +uts);
    }
    public void nilaiuas(int uas){
        System.out.println("Nilai UAS : " +uas);
    }

    public void isiData(){
        System.out.println("Sistem Akademik");
        System.out.println("------------------");
    }
    public void isiData2(){
        System.out.println("--------------");
    }



}

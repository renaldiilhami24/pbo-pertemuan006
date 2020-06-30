public class mahasiswa extends Akademik{
    public mahasiswa(int nim, String nama){
        super(nim, nama);
    }
    @Override
    public void isiData(){
        System.out.println("NIM : " +nim);
        System.out.println("Nama : " +nama);
    }
}
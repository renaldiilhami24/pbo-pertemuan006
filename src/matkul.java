public class matkul extends Akademik{
    public matkul(String matkul, int sks){
        super(matkul, sks);
    }
    @Override
    public void isiData(){
        System.out.println("Mata Kuliah : " +matkul);
        System.out.println("SKS : " +sks);
    }
}
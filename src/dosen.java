public class dosen extends Akademik{
    public dosen(String dosen){
        super(dosen);
    }
    @Override
    public void isiData(){
        System.out.println("Dosen : " +dosen);
    }
     public dosen(int nidn){
        super(nidn);
     }
    @Override
    public void isiData2(){
        System.out.println("NIDN : " +nidn);
    }
}
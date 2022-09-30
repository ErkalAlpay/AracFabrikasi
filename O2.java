public class O2 extends Otomobil {
    
    
    private int O2Sayisi;


    public O2() {
        super(false, "Otomatik", true, "O2");
     
        
        
        System.out.println("O2' Model Otomobil Üretilmiştir");
        System.out.println("Üretim Tarihi = " + getUretimYili());
        
    }

    public int getO2Sayisi() {
        return O2Sayisi;
    }
    
}

public class O1 extends Otomobil {

    private int O1Sayisi = 0;

    

    public O1() {
        super(true, "Otomatik", false, "O1");

        O1Sayisi++;
        System.out.println("O1 Model Otomobil Üretilmiştir");
        System.out.println("Üretim Tarihi = " + getUretimYili());
        
        
        
    }

    public int getO1Sayisi() {
        return O1Sayisi;
    }

    
    
}

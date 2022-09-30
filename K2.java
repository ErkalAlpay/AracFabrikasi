public class K2 extends Kamyon {

    private int k2Sayisi;

    

    public K2() {
        super(false, 1200, true, "K2");
        
        System.out.println("K2' Model Kamyon Üretilmiştir");
        System.out.println("Üretim Tarihi = " + getUretimYili());
        
        k2Sayisi++;
    }


    public int getK2Sayisi() {
        return k2Sayisi;
    }

    
}

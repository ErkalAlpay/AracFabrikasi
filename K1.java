public class K1 extends Kamyon {

   private int k1Sayisi;

  

    public K1() {
        super(true, 1800, true, "K1");
        
        k1Sayisi++;
        System.out.println("K1' Model Kamyon Üretilmiştir");
        System.out.println("Üretim Tarihi = " + getUretimYili());
        
    }


    public int getK1Sayisi() {
        return k1Sayisi;
    }
    
}

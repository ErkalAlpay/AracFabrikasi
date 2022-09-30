public class M1 extends Minibus {

    private int m1Sayisi;
   
    public M1() {
        super(true, true, "M1");

        System.out.println("M1 Model Minibüs Üretilmiştir");
        System.out.println("Üretim Tarihi = " + getUretimYili());
       
        m1Sayisi++;
    }
    
    public int getM1Sayisi() {
        return m1Sayisi;
    }
}

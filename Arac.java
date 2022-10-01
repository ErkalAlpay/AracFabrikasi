import java.util.Date;

    abstract class Arac {

    private String aracModeli;
    private String uretimYili;
    private int hiz;
    private double yakitTuketimi;
    private int maxHiz;
    private double motorHacmi;
    private int toplamArac;
    private boolean aracCalisiyorMu;
    private Date uretimZamani = new Date();


        Arac(double yakitTuketimi, int maxHiz, double motorHacmi, String aracModeli) {
        this.uretimYili = uretimZamani.toString();
        this.hiz = 0;
        this.yakitTuketimi = yakitTuketimi;
        this.maxHiz = maxHiz;
        this.motorHacmi = motorHacmi;
        this.aracCalisiyorMu = false;
        this.aracModeli = aracModeli;
        toplamArac++;
        }





    

    public void araciCalistir(){
        this.aracCalisiyorMu = true;
        System.out.println("Araç Modeli = " + getAracModeli() +"\n"+ getUretimYili() + "\n" + "Araç çalıştı");
            
    }

    public boolean AracCalisiyorMu() {
        return aracCalisiyorMu;
    }
    

    public int getToplamArac() {
        return toplamArac;
    }

    
    public String getAracModeli() {
        return aracModeli;
    }
    public String getUretimYili() {
        return uretimYili;
    }

    public void setHiz(int hizGir) {
        if(hiz < 0){
        this.hiz = 0;}
        else if(hiz>=0 && hizGir <= maxHiz){
        this.hiz = hizGir;
        }
        
    }


    public int getHiz() {
        return hiz;
    }
    public double getYakitTuketimi() {
        return yakitTuketimi;
    }
    public int getMaxHiz() {
        return maxHiz;
    }
    public double getMotorHacmi() {
        return motorHacmi;
    }


    




}
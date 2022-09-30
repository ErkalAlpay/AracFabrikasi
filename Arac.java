import java.util.Date;

public abstract class Arac {

    private String aracTuru;
    private String uretimYili;
    private int hiz;
    private double yakitTuketimi;
    private int maxHiz;
    private double motorHacmi;
    private int toplamArac;
    private boolean aracCalisiyorMu;
    private Date uretimZamani = new Date();


    public Arac(double yakitTuketimi, int maxHiz, double motorHacmi, String aracTuru) {
        this.uretimYili = uretimZamani.toString();
        this.hiz = 0;
        this.yakitTuketimi = yakitTuketimi;
        this.maxHiz = maxHiz;
        this.motorHacmi = motorHacmi;
        this.aracTuru = aracTuru;
        this.aracCalisiyorMu = false;
        toplamArac++;
        }



   
    
    public void setAracCalisiyorMu(boolean aracCalisiyorMu) {
        this.aracCalisiyorMu = aracCalisiyorMu;
    }

    public boolean AracCalisiyorMu() {
        return aracCalisiyorMu;
    }
    

    public int getToplamArac() {
        return toplamArac;
    }

    
    public String getAracturu() {
        return aracTuru;
    }
    public String getUretimYili() {
        return uretimYili;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
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
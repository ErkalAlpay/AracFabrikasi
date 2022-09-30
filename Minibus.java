public abstract class Minibus extends Arac {


    private int minibusSayisi;
    private int koltukSayisi;
    private boolean klima;
    private boolean otomatikKapi;
    private String aracModeli;


    public Minibus(boolean klima, boolean otomatikKapi, String aracModeli) {
        super(12.4, 160, 2.5, "Minibüs");
        
        this.klima = klima;
        this.koltukSayisi = 20;
        this.otomatikKapi = otomatikKapi;
        minibusSayisi++;
    }

    public void ozellikleriYazdir(){
        System.out.println("Araç Modeli = "+ getAracModeli() + "\n" + "Araç Motoru = " + getMotorHacmi() + "\n" + "Klima = " + klimaVarmi() 
        + "\n" + "Otomatik kapılı mı = " + otomatikKapilimi() + "\n" + "\n"+ "Max Hız = " + getMaxHiz() );
    }

    
    public boolean araciCalistir(){
        setAracCalisiyorMu(true);
        System.out.println("Araç Modeli = " + getAracModeli() +"\n"+ getUretimYili() + "\n" + "Araç çalıştı");
        return AracCalisiyorMu();
        
    }


    public int gazaBas(){
        if(getHiz()<180 && AracCalisiyorMu()){
        setHiz(getHiz()+ 10);}
        
        return getHiz();
    }

    public int freneBas(){
        if(getHiz()>0){setHiz(getHiz()-10);
    }
        return getHiz();
    }

    public int getMinibusSayisi() {
        return minibusSayisi;
    }

    public int getKoltukSayisi() {
        return koltukSayisi;
    }

    public boolean klimaVarmi() {
        return klima;
    }

    public boolean otomatikKapilimi() {
        return otomatikKapi;
    }

    public String getAracModeli() {
        return aracModeli;
    }
    
}

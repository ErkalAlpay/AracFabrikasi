abstract class Minibus extends Arac {


    private int minibusSayisi;
    private int koltukSayisi;
    private boolean klima;
    private boolean otomatikKapi;
   


    Minibus(boolean klima, boolean otomatikKapi, String aracModeli) {
        super(12.4, 160, 2.5, aracModeli);
        
        this.klima = klima;
        this.koltukSayisi = 20;
        this.otomatikKapi = otomatikKapi;
        minibusSayisi++;
    }

    public void ozellikleriYazdir(){
        System.out.println("Araç Modeli = "+ getAracModeli() + "\n" + "Araç Motoru = " + getMotorHacmi() + "\n" + "Klima = " + klimaVarmi() 
        + "\n" + "Otomatik kapılı mı = " + otomatikKapilimi() + "\n" + "\n"+ "Max Hız = " + getMaxHiz() );
    }



    public void gazaBas(){
        if(getHiz()<160 && AracCalisiyorMu()){
        setHiz(getHiz()+ 10);}
        
        
    }

    public void freneBas(){
        if(getHiz()>0){setHiz(getHiz()-10);
    }
    
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

    
    
}

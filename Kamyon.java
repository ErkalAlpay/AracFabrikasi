    abstract class Kamyon extends Arac {

    private boolean damper;
    private int yukKapasitesi;
    private boolean klima;
    private int kamyonSayisi;
   

   
    public Kamyon(boolean damper, int yukKapasitesi, boolean klima, String aracModeli) {
        super(26.7, 120, 8, aracModeli);

        this.damper = damper;
        this.yukKapasitesi = yukKapasitesi;
        this.klima = klima;
        
        kamyonSayisi++;

    
    }
    public void ozellikleriYazdir(){
        System.out.println("Araç Modeli = "+ getAracModeli() + "\n" + "Araç Motoru = " + getMotorHacmi() + "\n" + "Klima = " + klimaVarmi() 
        + "\n" + "Damper var mı = " + damperVarmi() + "\n" + "\n"+ "Max Hız = " + getMaxHiz() );
    }

    
    


    public int gazaBas(){
        if(getHiz()<120 && AracCalisiyorMu()){
        setHiz(getHiz()+ 5);}
        
        return getHiz();
    }

    public int freneBas(){
        if(getHiz()>0){setHiz(getHiz()-5);
            
        }
        return getHiz();
    }

    public boolean damperVarmi() {
        return damper;
    }
    public int getYukKapasitesi() {
        return yukKapasitesi;
    }
    public boolean klimaVarmi() {
        return klima;
    }
    public int getKamyonSayisi() {
        return kamyonSayisi;
    }
}

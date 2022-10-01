    abstract class  Otomobil extends Arac {

    private boolean klima;
    private String vitesTuru;
    private boolean ustuAcik;
    private int toplamOtomobil;





        Otomobil(boolean klima, String vitesTuru, boolean ustuAcik, String aracModeli) {
        super(6.8, 180, 2.5, aracModeli);
        this.klima = klima;
        this.vitesTuru = vitesTuru;
        this.ustuAcik = ustuAcik;
        toplamOtomobil++;

        
    }
    public void ozellikleriYazdir(){
        System.out.println("Araç Modeli = "+ getAracModeli() + "\n" + "Araç Motoru = " + getMotorHacmi() + "\n" + "Klima = " + klimaVarmi() 
        + "\n" + "Üstü Açık mı = " + ustuAcikmi() + "\n" + "Vites Türü = " + getVitesTuru()+ "\n"+ "Max Hız = " + getMaxHiz() );
    }

    


    public int gazaBas(){
        if(getHiz()<180 && AracCalisiyorMu()){
        setHiz(getHiz()+ 20);}
        
        return getHiz();
    }

    public int freneBas(){
        if(getHiz()>0){setHiz(getHiz()-20);
            
        }
        return getHiz();
    }

    public int getToplamOtomobil() {
        return toplamOtomobil;
    }


  

    public boolean klimaVarmi() {
        return klima;
    }



    public String getVitesTuru() {
        return vitesTuru;
    }



    public boolean ustuAcikmi() {
        return ustuAcik;
    }



    
    
    
}

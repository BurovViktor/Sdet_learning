package vitek.constructor;

public class LoveJavaJavaLove {
    private String vitekLoveJava ;
    private String seregaLoveJava ;

    public LoveJavaJavaLove(String vitekLoveJava, String seregaLoveJava) {
        this.vitekLoveJava = vitekLoveJava;
        this.seregaLoveJava = seregaLoveJava;
    }

    public String getvitekLoveJava() {
        return vitekLoveJava;
    }

    public String getseregaLoveJava() {
        return seregaLoveJava;
    }

    public void setvitekLoveJava(String chmo,String lox){
        this.seregaLoveJava=chmo+lox;
    }

    public void setSeregaLoveJava(String chmo,String lox){
        this.vitekLoveJava=lox+chmo;
    }

    public static void main(String[] args) {
        LoveJavaJavaLove seregaFirst = new LoveJavaJavaLove("Love Java", "Java Love");
        LoveJavaJavaLove vitekFirst = new LoveJavaJavaLove(seregaFirst.getseregaLoveJava(),seregaFirst.getvitekLoveJava());
        System.out.println(vitekFirst.getvitekLoveJava()+" "+vitekFirst.getseregaLoveJava());

    }
}

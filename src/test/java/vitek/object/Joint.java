package vitek.object;

public class Joint {
    public int marijuana;
    public int tobacco;
    public int paper;
    public static int marijuanaSum=10;

    public Joint(){

    }
    public Joint(int marijuana,int tobacco,int paper){
        this.marijuana=marijuana;
        this.tobacco=tobacco;
        this.paper=paper;
    }
    public static void setFireTo(){
        System.out.println("Поджечь");
        marijuanaSum--;
    }

}

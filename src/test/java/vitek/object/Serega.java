package vitek.object;

public class Serega extends Joint{
    public String request="Будешь?";

    public Serega(){

    }
    public void smoke(){
        System.out.println("Курнем?");
    }
    public void grade(){
        System.out.println("Нормально курнули");
    }
    public void offer(){
        smoke();
        grade();
    }

    public static void main(String[]args){
        Serega serega=new Serega();
        for (int i = 0; i <10 ; i++) {
            serega.smoke();
            System.out.println("Забиваем шмаль остаток:"+Joint.marijuanaSum);
            Joint.setFireTo();
            serega.smoke();
        }
//        serega.smoke();
//        System.out.println("Забиваем шмаль остаток:"+Joint.marijuanaSum);
//        Joint.setFireTo();
//        serega.smoke();
    }
}

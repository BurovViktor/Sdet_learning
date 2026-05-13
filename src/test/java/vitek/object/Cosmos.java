package vitek.object;

public class Cosmos extends vitek.object.Serega {
    static int marijuanaSum= vitek.object.Joint.marijuanaSum;


    @Override
    public void smoke(){
        System.out.println("Курнем и в Космос");
    }
    public static void main(String[]args){
        Cosmos cosmos=new Cosmos();
        cosmos.smoke();
    }
}

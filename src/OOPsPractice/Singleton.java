package OOPsPractice;

public class Singleton {

    public static Singleton instance=null;

    private Singleton(){
        System.out.println("private instance constructor");
    };

    public static Singleton getInstance() {
       if (instance==null){
           instance=new Singleton();
       }
        return instance;
    }
}

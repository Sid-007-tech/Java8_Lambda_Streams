package OOPsPractice;

public class MainClassForSingleton {
    public static void main(String[] args) {
        Singleton s1= Singleton.getInstance();
        Singleton s2= Singleton.getInstance();
        Singleton s3= Singleton.getInstance();

        System.out.println("HashS1"+s1.hashCode());
        System.out.println("HashS2"+s3.hashCode());
        System.out.println("HashS3"+s3.hashCode());
    }
}

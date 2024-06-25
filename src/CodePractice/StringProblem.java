package CodePractice;

public class StringProblem {
    public static void main(String[] args) {
        String s1=new String("hello").intern();
        String s2=new String("hello").intern();
        String s3="Hi";
        String s4="Hi";

        Integer i= 2;
        int i2 =2;
        //String s3=s1.intern();//returns string from pool, now it will be same as s2
        System.out.println(s3.equals(s4));//false because reference variables are pointing to different instance
        //System.out.println(s2==s3);//true because reference variables are pointing to same instance
    }
}

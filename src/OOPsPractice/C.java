package OOPsPractice;

public class C implements A,B{

    @Override
    public void attack() {
        A.super.attack();
    }
}

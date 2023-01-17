package doms;
class animal
{
    int d=2;
    void print()
    {
        System.out.println("base");
    }
}
class dog extends animal{
    int d=3;
    void print()
    {
        System.out.println("child");
    }
}
public class test2 {
    public static void main(String ... a)
    {
        dog at=new dog();
        at.print();
        System.out.println(at.d);
    }
}

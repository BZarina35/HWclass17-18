package HWClass18;

public class HWConstructors {

    /*
    Write a java class that have 4 constructors with 4 different access levels of constructors(private,
    public,default,protected) and create 4 objects of this class: 1 - inside same class; 2 - from outside the class;
    3 - from different class inside different package  and observe result.

    Write program that have static constructor and observe result.
     */

    private int num1;
    public int num2;
    int num3;
    protected int num4;

    private HWConstructors() {
        System.out.println("Private constractor");
    }

    public HWConstructors(int num) {
        this.num1 = num;
        System.out.println("Public constructor");
    }

    HWConstructors(String str) {
        System.out.println("Default constructor");
    }

    protected HWConstructors(double d) {
        System.out.println("Protected constructor");
    }

    public static HWConstructors createInstance() {
        System.out.println("Static constructor");
        return new HWConstructors();
    }

    public static void main(String[] args) {
        HWConstructors obj1 = new HWConstructors();
        HWConstructors obj2 = new HWConstructors(25);
        HWConstructors obj3 = new HWConstructors("Zarina");
        HWConstructors obj4 = new HWConstructors(83.5);

        HWConstructors obj5 = HWConstructors.createInstance();
    }


}

package HWClass18;

public class HW17Students {

    /*
    Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each student's name.
     */

    private String name;
    private int math;
    private int history;
    private int gym;

    public HW17Students(String name, int grade1, int grade2, int grade3) {
        this.name = name;
        this.math = grade1;
        this.history = grade2;
        this.gym = grade3;
    }

    public double calculateAverageGrade() {
        return ((math + history + gym) / 3);
    }

    public static void main(String[] args) {
        HW17Students student1 = new HW17Students("Zarina", 95, 92, 87);
        HW17Students student2 = new HW17Students("Sarah", 97, 85, 79);
        HW17Students student3 = new HW17Students("Ana", 91, 87, 94);
        HW17Students student4 = new HW17Students("Gulmira", 93, 87, 78);
        HW17Students student5 = new HW17Students("Nigina", 76, 82, 79);

        System.out.println(student1.name + "'s average grade is " + student1.calculateAverageGrade());
        System.out.println(student2.name + "'s average grade is " + student2.calculateAverageGrade());
        System.out.println(student3.name + "'s average grade is " + student3.calculateAverageGrade());
        System.out.println(student4.name + "'s average grade is " + student4.calculateAverageGrade());
        System.out.println(student5.name + "'s average grade is " + student5.calculateAverageGrade());
    }


}

package HWClass18;

public class ChemistryTeacher extends Teacher {
    public ChemistryTeacher(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void teach() {
        System.out.println("I am a chemistry teacher and I am teaching chemistry.");
    }

    public void grade() {
        System.out.println("I am a chemistry teacher and I am grading chemistry assignments.");
    }
}







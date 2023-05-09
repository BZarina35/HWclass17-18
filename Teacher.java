package HWClass18;

public class Teacher {

    /*
    Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
     Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher . Test all 4 classes
     */
    private String name;
    private int age;
    private String gender;

    public Teacher(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {
        System.out.println("Hi, my name is Zarina");
    }

    public void teach() {
        System.out.println("I am a teacher and i am teaching.");
    }

    public void grade() {
        System.out.println("I am a teacher and I am grading assignments.");
    }

    public void attendMeeting() {
        System.out.println("I am attending a meeting.");
    }


}







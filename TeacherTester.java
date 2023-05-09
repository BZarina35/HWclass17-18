package HWClass18;

public class TeacherTester {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Zarina", 38, "Female");
        teacher.introduce();
        teacher.teach();
        teacher.grade();
        teacher.attendMeeting();


        MathTeacher mathTeacher = new MathTeacher("Sarah", 35, "Female");
        mathTeacher.introduce();
        mathTeacher.teach();
        mathTeacher.grade();
        mathTeacher.attendMeeting();

        ChemistryTeacher chemistryTeacher = new ChemistryTeacher("Gulmira", 28, "Female");
        chemistryTeacher.introduce();
        chemistryTeacher.teach();
        chemistryTeacher.grade();
        chemistryTeacher.attendMeeting();

        PianoTeacher pianoTeacher = new PianoTeacher("Nigina", 30, "Female");
        pianoTeacher.introduce();
        pianoTeacher.teach();
        pianoTeacher.grade();
        pianoTeacher.attendMeeting();

         }
}

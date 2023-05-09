package HWClass18;

public class MathTeacher extends Teacher {
        public MathTeacher(String name, int age, String gender) {
            super(name, age, gender);
        }

        public void teach() {
            System.out.println("I am a math teacher and I am teaching math.");
        }

        public void grade() {
            System.out.println("I am a math teacher and I am grading math assignments.");
        }
}

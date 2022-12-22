import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws MyException {
        //ArrayList<Student> students = new ArrayList<>();
        // students.add(new Student("Aiken", 17));
        //students.add(new Student("Medina", 16));
        //  students.add(new Student("Aidana", 15));

        Student student = new Student();
        student.setName("Aiken");
        student.setAge(17);
        if (student.getName() == null) {
            throw new NullPointerException();
        } else if (student.getAge() <= 0) {
            throw new MyException("Жашы тура эмес");
        } else {
            System.out.println(student);
        }
    }
}
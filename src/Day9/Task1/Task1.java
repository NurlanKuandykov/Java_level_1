package Day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Nurlan", "DTEAS");
        Teacher teacher = new Teacher("Svetlana", "Mathematics");
        System.out.println(student.getScienceGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();
    }
}

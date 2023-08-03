package Day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Nurlan Kuandykov");
        //student.setNameStudent("Nurlan Kuandykov");
        Teacher teacher = new Teacher("Galina Petrova", "Mathematics");
        //teacher.setNameTeacher("Galina Petrova");
        //teacher.setSubject("Mathematics");
        teacher.evaluate(student);
    }
}


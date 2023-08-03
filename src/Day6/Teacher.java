package Day6;

import java.util.Random;

public class Teacher {
    private String nameTeacher;
    private String subject;

    public Teacher(String nameTeacher, String subject) {
        this.nameTeacher = nameTeacher;
        this.subject = subject;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }
    public void setNameTeacher(String name) {
        this.nameTeacher = name;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void evaluate(Student student){
        Random random = new Random();
        int randomValue = random.nextInt(4) + 2;
        String evaluation = "";
        switch (randomValue){
            case 2:
                evaluation = "unsatisfactory";
                break;
            case 3:
                evaluation = "satisfactorily";
                break;
            case 4:
                evaluation = "good";
                break;
            case 5:
                evaluation = "excellent";
                break;
        }

        System.out.println("Teacher " + this.nameTeacher + " evaluate student with name " + student.getNameStudent() + " in subject " + this.subject + " for " + evaluation + ".");
    }
}

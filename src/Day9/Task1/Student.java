package Day9.Task1;

public class Student extends Human {
    private String scienceGroupName;

    public Student(String name, String scienceGroupName) {
        super(name);
        this.scienceGroupName = scienceGroupName;
    }

    public String getScienceGroupName() {
        return scienceGroupName;
    }

    public void setScienceGroupName(String scienceGroupName) {
        this.scienceGroupName = scienceGroupName;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("This student named " + getName());
    }
}

package cat.udl.ampli.factory;

public class Student implements Identifiable {

    private StudentID id;

    public Student(StudentID id) {
        this.id = id;
    }

    @Override
    public StudentID getID() {
        return  this.id;
    }
}

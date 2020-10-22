package cat.udl.ampli.factory;

public class StudentID implements ID{
    private final String code;

    public StudentID(String code) {
        this.code = code;
    }

    @Override
    public String getCode() {
        return code;
    }
}

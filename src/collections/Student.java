package collections;

public class Student {
    private String name;
    private String code;

    public Student(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", code='" + code + '\'' +
        '}';
    }
}

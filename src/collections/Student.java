package collections;

import java.util.Objects;

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

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;

        Student student = ( Student ) o;

        return name.equals( student.name ) && code.equals( student.code );
    }
}

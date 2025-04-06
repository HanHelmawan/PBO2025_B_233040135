package Pertemuan6;

class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }

    void teach() {
        System.out.println(name + " is teaching.");
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void studyWith(Teacher teacher) {
        System.out.println(name + " is studying with " + teacher.name);
        teacher.teach();
    }
}

public class Guru {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith");
        Student student = new Student("Alice");

        student.studyWith(teacher);
    }
}


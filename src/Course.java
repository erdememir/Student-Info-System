public class Course {
    Teacher teacher;
    String name;
    String courseCode;
    String prefix;
    int note;

    Course(String name, String courseCode, String prefix) {
        this.name = name;
        this.courseCode = courseCode;
        this.prefix = prefix;
        int note = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Öğretmen dalı ve Ders bölümleri uyumsuz.");
        }
    }

    void printTeacher() {
        this.teacher.print();
    }
}

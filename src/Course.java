public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı.");
        } else {
            System.out.println("Akademisyen bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine akademisyen atanamamıştır.");
        }
    }

    public void setNote(int note) {
        this.note = note;
    }

    public void setVerbalNote(int verbalNote) {
        this.verbalNote = verbalNote;
    }

    public double calculateOverallGrade() {
        double overallNote = 0.8 * note + 0.2 * verbalNote;
        return overallNote;
    }
}
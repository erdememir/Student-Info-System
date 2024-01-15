public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fzk = new Course("Fizik", "FZK101", "FZK");
        Course kmy = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Ali Hoca", "123321123", "MAT");
        Teacher t2 = new Teacher("Veli Hoca", "321213213", "FZK");
        Teacher t3 = new Teacher("Cumali Hoca", "231231232", "KMY");

        mat.addTeacher(t1);
        fzk.addTeacher(t2);
        kmy.addTeacher(t3);

        Student s1 = new Student("Osman", "001", 3, mat, fzk, kmy);
        s1.addBulkExamNote(50, 20, 40);
        s1.addVerbalExamNotes(70, 30, 50);
        s1.isPass();

        Student s2 = new Student("Ayşe", "002", 3, mat, fzk, kmy);
        s2.addBulkExamNote(100, 50, 40);
        s2.addVerbalExamNotes(80, 40, 60);
        s2.isPass();

        Student s3 = new Student("Fatma", "003", 3, mat, fzk, kmy);
        s3.addBulkExamNote(50, 20, 40);
        s3.addVerbalExamNotes(60, 25, 45);
        s3.isPass();
    }
}
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Emirhan Erdem", "+905330331324", "ENG");
        Teacher t2 = new Teacher("Kadir Sunman", "+905445825855", "YZLM");
        Teacher t3 = new Teacher("Samet Demirkul", "+905376549878", "MAT");

        Course english = new Course("İngilizce", "101", "ENG");
        english.addTeacher(t1);
        Course coding = new Course("Yazılım", "102", "YZLM");
        coding.addTeacher(t2);
        Course mathematic = new Course("Matematik", "103", "MAT");
        mathematic.addTeacher(t3);

        Student s1 = new Student("Kerem Aktürkoğlu", "07", "3", english, coding, mathematic);
        s1.addBulkExamNote(100,78,50);
        s1.isPass();

        Student s2 = new Student("Mauro Icardi", "09", "3", english, coding, mathematic);
        s2.addBulkExamNote(75,60,30);
        s2.isPass();
    }
}

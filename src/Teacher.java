public class Teacher {
    String name;
    String mobile;
    String branch;

    Teacher(String name, String mobile, String branch) {
        this.name = name;
        this.mobile = mobile;
        this.branch = branch;
    }

    void print() {
        System.out.println("Adı: " + this.name);
        System.out.println("Tlf. no: " + this.mobile);
        System.out.println("Bölümü: " + this.branch);
    }
}
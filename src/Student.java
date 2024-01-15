public class Student {
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course fzk;
    Course kmy;
    double average;
    boolean isPass;

    Student(String name, String stuNo, int classes, Course mat, Course fzk, Course kmy) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fzk = fzk;
        this.kmy = kmy;
        this.average = 0.0;
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fzk, int kmy) {
        if (mat >= 0 && mat <= 100) {
            this.mat.setNote(mat);
        }
        if (fzk >= 0 && fzk <= 100) {
            this.fzk.setNote(fzk);
        }
        if (kmy >= 0 && kmy <= 100) {
            this.kmy.setNote(kmy);
        }
    }

    public void addVerbalExamNotes(int mat, int fzk, int kmy) {
        if (mat >= 0 && mat <= 100) {
            this.mat.setVerbalNote(mat);
        }
        if (fzk >= 0 && fzk <= 100) {
            this.fzk.setVerbalNote(fzk);
        }
        if (kmy >= 0 && kmy <= 100) {
            this.kmy.setVerbalNote(kmy);
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fzk.note == 0 || this.kmy.note == 0 || this.mat.verbalNote == 0 || this.fzk.verbalNote == 0 || this.kmy.verbalNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama: " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı geçti.");
            } else {
                System.out.println("Sınıfta kaldı.");
            }
        }
    }

    public void printNote() {
        System.out.println("=============================");
        System.out.println("Öğrenci: " + this.name);
        System.out.println("Matematik notu: " + this.mat.note + ", Sözlü: " + this.mat.verbalNote);
        System.out.println("Fizik notu: " + this.fzk.note + ", Sözlü: " + this.fzk.verbalNote);
        System.out.println("Kimya notu: " + this.kmy.note + ", Sözlü: " + this.kmy.verbalNote);
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void calcAverage() {
        this.average = (0.8 * (this.mat.note + this.fzk.note + this.kmy.note) + 0.2 * (this.mat.verbalNote + this.fzk.verbalNote + this.kmy.verbalNote)) / 3;
    }
}
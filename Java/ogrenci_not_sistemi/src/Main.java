public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "TRH");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        Course tarih=new Course("Tarih","101","TRH");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1= new Student("Kemal","123","4",tarih,fizik,kimya);
        s1.addBulExamNote(100,80,50);
        s1.isPass();

        Student s2= new Student("Necmi","123","4",tarih,fizik,kimya);
        s1.addBulExamNote(50,30,540);
        s1.isPass();
    }
}
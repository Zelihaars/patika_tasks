public class Course {
    Teacher teacher;
    String name;
    String vode;
    String prefix;
    int note;

    public Course(String name, String vode, String prefix) {
        this.name = name;
        this.vode = vode;
        this.prefix = prefix;
        int note=0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            //System.out.println("Öğretmen atanmıştır");
            this.teacher = teacher;
           //printTeacher();

        } else{
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor ");
        }

    }


    void  printTeacher(){
        this.teacher.print();
    }
}

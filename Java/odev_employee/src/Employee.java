public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        double result=0.0;
        if (salary<1000){
           return result;
        } else if (salary>=1000) {
            result=salary*0.03;
        }
        return result;
    }
    double bonus(){
        double result=0.0;
        if (workHours>40){
            result=workHours-40;
            result=result*30;
        }
        else {
            return result;
        }
        return result;
    }

    double raiseSalary(){
        double result ;
        int yil =2021-hireYear;
        if(yil<10){
            result=salary*0.05;
        } else if (yil>9 && yil<20) {
            result=salary*0.10;
        } else if (yil>19) {
            result=salary*0.15;
        }else {
            return  0;
        }
        return result;
    }

     public String toString(){
        System.out.println("Adı \t: " + name );
        System.out.println("Maaşı \t: " + salary );
        System.out.println("Çalışma Saati \t: " + workHours );
        System.out.println("Başlangıç Yılı \t: " + hireYear);
        System.out.println("Vergi \t: " + tax());
        System.out.println("Bonus \t: " + bonus());
        System.out.println("Maaş artışı\t: " +raiseSalary());
        double vergiliMaas=salary-tax()+bonus();
        double toplamMaas=salary-tax()+bonus()+raiseSalary();
        System.out.println("Vergi ve Bonuslar ile birlikte maaş\t: "+ vergiliMaas);
        System.out.println("Toplam Maaş\t: "+toplamMaas);
        return "";
    }

}

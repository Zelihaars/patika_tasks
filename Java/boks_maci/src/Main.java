public class Main {
    public static void main(String[] args) {
        Fighter f1= new Fighter("A",10,120,100,30);
        Fighter f2=new Fighter("B",20,85,85,40);
        System.out.println(f1.name + " : " + f1.health);
        System.out.println(f2.name + " :  " + f2.health);

        Match match=new Match(f1,f2,85,100);
        match.run();

    }
}
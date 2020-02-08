import model.Coffee;
import model.Glasses;
import model.Student;
import service.CustomSet;

public class Main {
    public static void main(String[] args) {

        Glasses g1 = new Glasses("ceramic", 1500);
        Glasses g2 = new Glasses("plastic", 100);
        Glasses g3 = new Glasses("wooden", 2000);
        Glasses g4 = new Glasses("crystal", 5000);
        CustomSet<Glasses> glassList = new CustomSet<Glasses>(){{
            add(g1);
            add(g2);
            add(g3);
            add(g4);
        }};
        glassList.remove(g2);
        glassList.printSet();
//        System.out.println(glassList.contains(g3));

        Student s1 = new Student("Armen Khazaryan", 22);
        Student s2 = new Student("Vardan Aramyan", 19);
        Student s3 = new Student("Lilit Sahakyan", 32);
        Student s4 = new Student("Sona Avagyan", 15);
        Student s5 = new Student("Karen Aharonyan", 25);
        CustomSet<Student> studentsList = new CustomSet<Student>(){{
            add(s1);
            add(s2);
            add(s3);
            add(s4);
            add(s5);
        }};
//        studentsList.remove(s3);
        studentsList.printSet();
        System.out.println(studentsList.contains(s2));

        Coffee c1 = new Coffee("Ethiopian", 3000);
        Coffee c2 = new Coffee("Colombian", 4500);
        Coffee c3 = new Coffee("Kenyan", 5000);
        Coffee c4 = new Coffee("Indian", 2500);
        CustomSet<Coffee> coffeeList = new CustomSet<Coffee>(){{
            add(c1);
            add(c2);
            add(c3);
            add(c4);
        }};
//        coffeeList.remove(c1);
        coffeeList.printSet();
        System.out.println(coffeeList.getSize());
    }
}

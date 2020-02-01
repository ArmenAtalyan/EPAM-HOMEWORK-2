import model.Student;
import service.StudentService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        List<Student> list = new ArrayList<>();
        Student student1 = new Student("Vardan", "Aramyan", 22,
                "098225566", "Math");
        Student student2 = new Student("Vardan", "Aramyan", 20,
                "098225565", "Economic");
        Student student3 = new Student("Satik", "Vardanyan", 29,
                "098325566", "Journalistic");
        Student student4 = new Student("Satik", "Vardanyan", 31,
                "098224566", "Sociology");
        Student student5 = new Student("Aram", "Khazaryan", 18,
                "091225566", "Journalistic");
        Student student6 = new Student("Ani", "Sahakyan", 23,
                "041225566", "Economic");

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);

        Map<String, Integer> sameName = StudentService.countSameName(list);
        for(Map.Entry<String, Integer> entry: sameName.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + value);
        }
        System.out.println();
        Map<String, Integer> studentsNum = StudentService.countStudentsNumber(list);
        for(Map.Entry<String, Integer> entry: studentsNum.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }
}

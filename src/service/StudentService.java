package service;
import model.Student;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService {

    public static Map<String, Integer> countSameName(List<Student> list){
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < list.size(); i++){
            String temp = list.get(i).getFirstName()+" "+list.get(i).getLastName();
            if(map.containsKey(temp)){
                Integer count = map.get(temp);
                map.replace(temp, count+1);
            }
            else
                map.put(temp, 1);
        }
        return map;
    }

    public static Map<String, Integer> countStudentsNumber(List<Student> list){
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < list.size(); i++){
            String temp = list.get(i).getFaculty();
            if(map.containsKey(temp)){
                Integer count = map.get(temp);
                map.replace(temp, count+1);
            }
            else
                map.put(temp, 1);
        }
        return map;
    }
}

import service.MonthService;
import service.StudentService;

public class Main {
    public static void main(String[] args){

        StudentService.initAndPrintStudents();
        MonthService.initAndPrintMonths();
    }
}

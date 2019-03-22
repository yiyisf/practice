package student;

import java.time.LocalDate;
import java.time.Month;

public class StudentTest {
    public static void main(String[] args) {
        Student student;
        student = new Student(888,"杨",true, LocalDate.of(2000, Month.JANUARY,1),LocalDate.of(2000,Month.JANUARY,1),true,"宝安西乡101号",123);
        student.print();
    }
}

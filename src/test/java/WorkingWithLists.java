import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    @Test
    public void creatAndWorkingWithLists() {
        Student valera = new Student();
        valera.setFirstName("Valera");
        valera.setLastName("The Tester");
        valera.setEmail("valerunchik@test.lv");
        valera.setPhone("+371232323");

        Student Liga = new Student("Liga", "Ivanova", "liga@test.lv", "=37122222222");
        Student Dimko = new Student("Dimko", "Skatinishe", "omg@test.lv", "112");
        Student Artis = new Student("Artis", "Greatest", "", "112");

        List<Student> students = new ArrayList<>();
        students.add(valera);
        students.add(Liga);
        students.add(Dimko);
        students.add(Artis);

        //------------------------------------FOR------------------------------------------
        for (int i = 0; i < students.size(); i++) {   // i = i + 1 ->> i++
            System.out.println(students.get(i).getFirstName());

        }
        //---------------------------------------------FOREACH----------------------------------
        for (Student s : students) {
            System.out.println(s.getFirstName() + " " + s.getLastName());
            System.out.println(s.getFullName());


        }

        //---------------------------------------FOREACH with IF---------------------------------------
        for (Student s : students){
            System.out.println("Printing students with phone nr starting with +371: ");
            if (s.getPhone().startsWith("+371"));
            System.out.println(s.getFullName());

            {

            }
        }

        }


}

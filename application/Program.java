package problema4.application;

import problema4.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        String path = "/Users/iurypedrosa/Desktop/Mesa/Sistemas de Informação./CURSOS/Back End/Java-Nelio-Udemy/Secao18/Secao18/src/problema4/in2.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String employeeCsc = br.readLine();
            while (employeeCsc != null) {
                String[] fields = employeeCsc.split(",");


                list.add(new Employee(fields[0], Double.parseDouble(fields[1]) ));
                employeeCsc = br.readLine();
            }

            Collections.sort(list);
            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
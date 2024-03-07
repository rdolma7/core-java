package objectbasic.inheritance;


import java.time.LocalDate;
import java.util.List;

public class OfficeApplication {
    public static void main(String[] args) {
    Employee employee = new Employee();
    employee.setName("Rinzin");
    employee.setId(1);
    employee.setAddress("8928 Elmhurst ave,NY 11377");
    employee.setSsn("234564345");
    employee.setSalary(2390.00);
    employee.setGender("Female");
    employee.setPosition("Analyst");
    employee.setJoiningDate(LocalDate.now());
    employee.setDept("Technology");

    Manager manager = new Manager();
    manager.setName("Rita");
    manager.setId(2);
    manager.setAddress("123 Abc lane Ny, 03045");
    manager.setSsn("234566768");
    manager.setSalary(6789.50);
    manager.setGender("Female");
    manager.setJoiningDate(LocalDate.now());
    manager.setDept("Technology");
    manager.setBonus(5000);
    manager.setTree(List.of());

    Director director = new Director();
    director.setName("John");
    director.setId(3);
    director.setAddress("12354 Dowling St Ontario 23421");
    director.setSsn("343212321");
    director.setSalary(10000.00);
    director.setGender("Male");
    director.setJoiningDate(LocalDate.now());
    director.setBonus(15000);
    director.setSharePercentage(4);

    }
}

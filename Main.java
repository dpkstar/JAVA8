import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main
{
   public static void main(String[] args)
   {//from w  ww  .ja v a 2s  .  co  m
      Employee[] employees = {
         new Employee("J", "Red", 51000, "IT"),
         new Employee("A", "Green", 71600, "IT"),
         new Employee("M", "Black", 35187.5, "Sales"),
         new Employee("K", "Yellow", 47100.77, "Marketing"),
         new Employee("L", "Pink", 62001, "IT"),
         new Employee("D", "Blue", 32001, "Sales"),
         new Employee("W", "Brown", 42361.4, "Marketing")};

      // get List view of the Employees
      List<Employee> list = Arrays.asList(employees);

      // display all Employees
      System.out.println("Complete Employee list:");
      list.stream().forEach(System.out::println);
      


      // group Employees by department
      System.out.printf("%nEmployees by department:%n"); 
      Map<String, List<Employee>> groupedByDepartment =
        list.stream()
             .collect(Collectors.groupingBy(Employee::getDepartment));

      groupedByDepartment.forEach(
        (department, employeesInDepartment) -> 
        {
           System.out.println(department);
           employeesInDepartment.forEach(
              employee -> System.out.printf("   %s%n", employee));
       }
      );

   } 
}
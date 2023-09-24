import java.util.*;  
import java.util.ArrayList;



public class Stream {


    public static void main(String[] args){
        MapinStream();

    }
        public  static void  MapinStream(){        
            
        List<String> employee = new ArrayList<>();
        employee.add("Elon");
        employee.add("modi");
        employee.add("biden");

        employee.stream().map(emp-> emp.toUpperCase()).forEach(System.out::println);
        

        }


    }
    


import java.util.Random;
import java.util.*;

public class ProblemQuestion {
    public static void main(String args[]){
        //print numer in random order in sorted order using java8

        Random rm =new Random();
        rm.ints(5,1,11).sorted().forEach(System.out::println);
           
        //program to get a sum of all number using java8

        List<Integer> no= Arrays.asList(1,2,3,4,5);
          System.out.println(no.stream().mapToInt(i->i).sum());

    //square the list of number and then filter out the number greater than 10 and then find out the average

            List<Integer> sq= Arrays.asList(1,2,3,4,5);
            System.out.println(sq.stream().mapToInt(i->i*i).filter(i->i>10).average().getAsDouble());
                      
     //find the lowest and highest no of list using java8
        List<Integer> lh= Arrays.asList(1,2,3,4,5);
         System.out.println(lh.stream().max(Comparator.comparing(Integer::valueOf)).get());
         System.out.println(lh.stream().min(Comparator.comparing(Integer::valueOf)).get());
     
    // Find the no. string whose length is greater than 4
     List<String> st=Arrays.asList("Ramesh","Suresh","tony","sachin","toy");
           st.stream().filter(e-> e.length()>4).forEach(System.out::println);
            
      // to remove duplicate from list
        List<Integer> dp= Arrays.asList(1,2,1,4,2,3,4);
       dp.stream().distinct().forEach(System.out::println);

    //find out all even no. into the stream
     List<Integer> ev= Arrays.asList(1,2,6,1,4,2,3,4);
        ev.stream().filter(n->n%2==0).forEach(System.out::println);

    // find the duplicate number

             List<Integer> dp1= Arrays.asList(1,2,1,4,2,3,4);
             Set<Integer> set=new HashSet<>();
             dp1.stream().filter(i->set.add(i)).forEach(System.out::println);


}
    }

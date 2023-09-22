public class Methodref {
     public static void main(String[] args){

        staticMethodReference();
     }
    
    public static void staticMethodReference(){

        AirthmeticOperation operation=(a,b) ->{

            int sum=a+b;
            System.out.println("the sum of given number is " + sum);
            return sum;
        };

        //operation.performOperation(2,3);

         AirthmeticOperation methodref = Methodref::performAddition;
         methodref.performOperation(2,3);

    }

    public static int performAddition (int a , int b){
        int sum =a+b;
        System.out.println("the sum of given input " + sum);
        return sum;
    }


}

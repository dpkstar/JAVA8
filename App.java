
public class App {

    
    int sum =0;
     public void sum(){
        int tempSum =0;
        AirthmeticOperation sumOperation =(a,b)->{
            int sum=0;
            this.sum =a+b;
            System.out.println("the value of sum : "+sum);
            return this.sum;
        };
        System.out.println("the sum of two number is :" + sumOperation.performOperation(10,20));


        }
     
    public static void main(String[] args) throws Exception {
        App lambda =new App();
        lambda.sum();
    }
}

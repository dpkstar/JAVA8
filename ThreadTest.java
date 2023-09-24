public class ThreadTest  implements Runnable{
    @Override
    public void run(){
        System.out.println("Running");
    }
    public static void main(String[]  args){

        Thread t = new Thread(new ThreadTest());
        t.run();
        t.run();
        t.run();
    }
}

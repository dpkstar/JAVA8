import java.util.function.Consumer;

public class ConsumerFunction {
    public static void main(String[] args){
        // Creating Consumer
Consumer<String> convertdisplay =    input-> System.out.println("converted value" + input.toUpperCase());
         // invoking accept method inside consumer
               convertdisplay.accept("Deepak");

    }
}

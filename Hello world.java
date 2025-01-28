import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyFirstApp {
    public static void main(String[] args) {
        System.out.println("Hello! My name is Tim Joseph P. Osabel!");
        
        System.out.println(" Here is the date and time!");

        LocalDateTime currentDateTime = LocalDateTime.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(" yyyy-MM-dd:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
    
        
        
        System.out.println("  Current Date and Time" + formattedDateTime);
    }
}

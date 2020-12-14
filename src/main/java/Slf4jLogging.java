import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import java.util.Scanner;

public class  Slf4jLogging{


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scan.nextLine();
        Logger logger = LoggerFactory.getLogger(Slf4jLogging.class);
        logger.info("Information");
        logger.debug("name's value {}",name);
        logger.trace("Trace");
        logger.error("Error");
        logger.warn("Warn");
    }
}




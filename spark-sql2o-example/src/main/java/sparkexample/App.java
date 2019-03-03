package sparkexample;
import static spark.Spark.get;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        get("/hello", (req, res)-> {

            res.status(200);
            res.type("application/json");
            return "Hello World!";
        });
        //System.out.println( "Hello World!" );
    }
}

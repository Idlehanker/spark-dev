package sparkexample;

import static spark.Spark.get;
import static spark.Spark.port;
/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {

        port(4566);

        get("/", (req, res) -> {
            return "hello from sparkjava.com docker test.";
        });
    }
}

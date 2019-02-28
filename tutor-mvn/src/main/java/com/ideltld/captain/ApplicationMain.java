package com.ideltld.captain;

import com.ideltld.captain.utils.SparkUtils;

import org.apache.log4j.Logger;
import static spark.Spark.get;

/**
 * Hello world!
 *
 */
public class ApplicationMain {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(ApplicationMain.class);
        SparkUtils.createServerWithRequestLog(logger);

        //System.out.println("Hello World!");

        get("/hello", (req, res)-> "Hello world!");
    }
}

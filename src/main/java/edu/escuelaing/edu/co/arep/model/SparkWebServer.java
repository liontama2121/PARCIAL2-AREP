package edu.escuelaing.edu.co.arep.model;

import static spark.Spark.*;
public class SparkWebServer {
    public static void main(String... args){
        port(getPort());
        staticFiles.location("/public");
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}

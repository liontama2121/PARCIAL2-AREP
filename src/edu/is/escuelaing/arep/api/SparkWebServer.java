package edu.is.escuelaing.arep.api;

public class SparkWebServer {

    public static void main(String... args){
        port(getPort());
        // root is 'src/main/resources', so put files in 'src/main/resources/public'
        staticFiles.location("/"); // Static files
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}

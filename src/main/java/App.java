import static spark.Spark.*;
public class App {
    public static void main(String[] args) {
        System.out.println("Sanity check");
        get("/test","application/json",(request, response)->{
            return "{\"Hello\":\"Bro\"}";
        });
    }
}

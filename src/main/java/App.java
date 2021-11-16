import com.google.gson.Gson;
import dao.Sql2oDepartmentDao;
import dao.Sql2oNewsDao;
import dao.Sql2oUserDao;
import models.Department;
import models.News;
import org.sql2o.Sql2o;

import static spark.Spark.*;
public class App {
    public static void main(String[] args) {
        String connectionString = "jdbc:postgresql://localhost:5432/news_db";
        Sql2o sql2o = new Sql2o(connectionString,"ftm","sparkpass");
        Sql2oUserDao userDaoDao = new Sql2oUserDao(sql2o);
        Sql2oNewsDao newsDao = new Sql2oNewsDao(sql2o);
        Sql2oDepartmentDao departmentDao = new Sql2oDepartmentDao(sql2o);
        Gson gson = new Gson();

//        Api test
//        System.out.println("Sanity check");
//        get("/test","application/json",(request, response)->{
//            return "{\"Hello\":\"Bro\"}";
//        });

        post("/departments/new", "application/json", (req, res) -> {
            Department department = gson.fromJson(req.body(), Department.class);
            departmentDao.addDepartment(department);
            res.status(201);
            res.type("application/json");
            return gson.toJson(department);
        });

        get("/departments", "application/json", (req, res) -> { //accept a request in format JSON from an app
            res.type("application/json");
            return gson.toJson(departmentDao.getAllDepartments());//send it back to be displayed
        });

        //Create General News
        post("/GeneralNews/new", "application/json", (req, res) -> {
            News generalNews = gson.fromJson(req.body(), News.class);
            newsDao.addNews(generalNews);
            res.status(201);
            res.type("application/json");
            return gson.toJson(generalNews);
        });

        //Read general News
        get("news/articles/posts", "application/json", (req, res) -> { //accept a request in format JSON from an app
            res.type("application/json");
            return gson.toJson(newsDao.getGeneralNews());//send it back to be displayed
        });

    }
}

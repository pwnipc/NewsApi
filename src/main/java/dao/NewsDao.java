package dao;

import models.News;

import java.util.List;

public interface NewsDao {
    //Create
    void addNews(News news);

    //Read
    List<News> getAllNews();
    News getNewsById(int id);

    //Update

    //Delete
    void deleteAllNews();
    void deleteNewsById(int id);
}

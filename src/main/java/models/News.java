package models;

public class News {
    private String newsDescription;
    private String newsUrl;
    private int departmentId;
    private int id;

    public News(String newsDescription, String newsUrl){
        this.newsDescription = newsDescription;
        this.newsUrl = newsUrl;
    }

    public News(String newsDescription, String newsUrl, int departmentId){
        this.newsDescription = newsDescription;
        this.newsUrl = newsUrl;
        this.departmentId = departmentId;
    }

    public String getNewsDescription() {
        return newsDescription;
    }

    public void setNewsDescription(String newsDescription) {
        this.newsDescription = newsDescription;
    }

    public String getNewsUrl() {
        return newsUrl;
    }

    public void setNewsUrl(String newsUrl) {
        this.newsUrl = newsUrl;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

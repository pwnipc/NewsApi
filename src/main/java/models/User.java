package models;

import java.util.Objects;

public class User {
    private String userName;
    private String position;
    private String role;
    private int departmentId;
    private int id;

    public User(String userName, String position, String role, int departmentId) {
        this.userName = userName;
        this.position = position;
        this.role = role;
        this.departmentId = departmentId;
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return departmentId == user.departmentId && id == user.id && Objects.equals(userName, user.userName) && Objects.equals(position, user.position) && Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, position, role, departmentId, id);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

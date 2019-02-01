package ua.foxmind.retail.model;
// example model


public class Task {
    String user;
    String description;

    public Task() {
    }

    public Task(String user, String description) {
        this.user = user;
        this.description = description;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("Task: {user: %s, description: %s}", user, description);
    }
}

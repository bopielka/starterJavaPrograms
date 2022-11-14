import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Task {
    private String name;
    private String description;
    private String time;
    private int id;

    public Task(String name, String description, String time, int id) {
        this.name = name;
        this.description = description;
        this.time = time;
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Task() {
    }
}

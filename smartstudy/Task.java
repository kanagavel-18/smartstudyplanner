import java.io.Serializable;

public class Task implements Serializable {
    String subjectName;
    int topicsToStudy;
    boolean completed;

    public Task(String subjectName, int topicsToStudy) {
        this.subjectName = subjectName;
        this.topicsToStudy = topicsToStudy;
        this.completed = false;
    }
}
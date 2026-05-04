import java.io.Serializable;

public class Subject implements Serializable {
    String name;
    int difficulty;
    int totalTopics;
    int remainingTopics;
    int daysRemaining;

    public Subject(String name, int difficulty, int totalTopics, int daysRemaining) {
        this.name = name;
        this.difficulty = difficulty;
        this.totalTopics = totalTopics;
        this.remainingTopics = totalTopics;
        this.daysRemaining = daysRemaining;
    }

    public double getProgress() {
        return ((totalTopics - remainingTopics) * 100.0) / totalTopics;
    }
}
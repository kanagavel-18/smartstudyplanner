import java.util.*;

public class Scheduler {

    public double calculatePriority(Subject s) {
        if (s.daysRemaining == 0) return Double.MAX_VALUE;
        return (s.difficulty * s.remainingTopics) / (double) s.daysRemaining;
    }

    public List<Task> generateDailyPlan(List<Subject> subjects, int dailyHours) {
        List<Task> plan = new ArrayList<>();

        subjects.sort((a, b) ->
                Double.compare(calculatePriority(b), calculatePriority(a))
        );

        int hoursLeft = dailyHours;

        for (Subject s : subjects) {
            if (hoursLeft <= 0 || s.remainingTopics <= 0) continue;

            int topics = Math.min(s.remainingTopics, hoursLeft);

            plan.add(new Task(s.name, topics));
            s.remainingTopics -= topics;
            hoursLeft -= topics;
        }

        return plan;
    }

    public void reschedule(List<Subject> subjects) {
        for (Subject s : subjects) {
            if (s.daysRemaining > 0) {
                s.daysRemaining--;
            }
        }
    }
}
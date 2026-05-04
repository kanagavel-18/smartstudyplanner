import java.util.*;

public class ConsoleUI {
    Scanner sc = new Scanner(System.in);
    List<Subject> subjects;
    Scheduler scheduler = new Scheduler();

    public ConsoleUI() {
        subjects = FileHandler.load();
    }

    public void start() {
        while (true) {
            System.out.println("\n===== Smart Study Planner =====");
            System.out.println("1. Add Subject");
            System.out.println("2. Generate Today Plan");
            System.out.println("3. Mark Progress");
            System.out.println("4. View Status");
            System.out.println("5. Exit");

            int choice = getIntInput();

            switch (choice) {
                case 1 -> addSubject();
                case 2 -> generatePlan();
                case 3 -> markProgress();
                case 4 -> viewStatus();
                case 5 -> {
                    FileHandler.save(subjects);
                    System.out.println("Saved. Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private int getIntInput() {
        while (!sc.hasNextInt()) {
            System.out.println("Enter a valid number:");
            sc.next();
        }
        return sc.nextInt();
    }

    private void addSubject() {
        System.out.print("Subject name: ");
        String name = sc.next();

        System.out.print("Difficulty (1-5): ");
        int diff = getIntInput();

        System.out.print("Total topics: ");
        int topics = getIntInput();

        System.out.print("Days remaining: ");
        int days = getIntInput();

        subjects.add(new Subject(name, diff, topics, days));
        System.out.println("Subject added!");
    }

    private void generatePlan() {
        System.out.print("Enter daily study hours: ");
        int hours = getIntInput();

        List<Task> plan = scheduler.generateDailyPlan(subjects, hours);

        System.out.println("\nToday's Plan:");
        for (Task t : plan) {
            System.out.println("- " + t.subjectName + ": " + t.topicsToStudy + " topics");
        }

        scheduler.reschedule(subjects);
    }

    private void markProgress() {
        System.out.print("Enter subject name: ");
        String name = sc.next();

        for (Subject s : subjects) {
            if (s.name.equalsIgnoreCase(name)) {
                System.out.print("Topics completed: ");
                int done = getIntInput();

                s.remainingTopics -= done;
                if (s.remainingTopics < 0) s.remainingTopics = 0;

                System.out.println("Progress updated!");
                return;
            }
        }

        System.out.println("Subject not found!");
    }

    private void viewStatus() {
        System.out.println("\n--- Study Status ---");

        for (Subject s : subjects) {
            System.out.println(
                s.name +
                " | Remaining: " + s.remainingTopics +
                " | Days Left: " + s.daysRemaining +
                " | Progress: " + String.format("%.2f", s.getProgress()) + "%"
            );
        }
    }
}
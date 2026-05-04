Smart Study Planner (Java)
 
The Smart Study Planner is a console-based Java application designed to help students efficiently organize and manage their study schedules.
Users can add subjects by specifying details such as difficulty level, number of topics, and remaining days until deadlines. 
The system uses a priority-based algorithm to generate optimized daily study plans, ensuring that more important and urgent subjects are given higher focus. 
It also supports automatic rescheduling as time progresses and allows users to track their study progress through completion percentages. 
Additionally, the application uses file handling to save and load data, ensuring that user progress is maintained across sessions.


 🚀 Features

*  Add subjects with:

  * Difficulty level
  * Total topics
  * Deadline (days remaining)

*  Smart scheduling algorithm:

  * Prioritizes subjects based on urgency and difficulty
  * Automatically generates daily study plans

*  Auto rescheduling:

  * Adjusts plan as days pass

*  Progress tracking:

  * Shows completion percentage
  * Tracks remaining topics

*  Data persistence:

  * Saves and loads data using file handling


 🏗️ Tech Stack

* Java (Core Java, OOP, Collections)
* File Handling (Serialization)
* Console-based UI


📁 Project Structure


SmartStudyPlanner/
 ├── Main.java
 
 ├── Subject.java
 
 ├── Task.java
 
 ├── Scheduler.java
 
 ├── FileHandler.java
 
 ├── ConsoleUI.java


🧠 How It Works

The planner uses a **priority-based scheduling algorithm**:
 Subjects with:

  * Higher difficulty
  * More remaining topics
  * Fewer days left

▶️ How to Run

1. Clone or download the project
2. Open terminal in project folder

javac *.java
java Main


 📸 Sample Output

===== Smart Study Planner =====
1. Add Subject
2. Generate Today Plan
3. Mark Progress
4. View Status
5. Exit

Today's Plan:
- Math: 2 topics
- Physics: 1 topics


🚀 Future Improvements

* GUI using JavaFX
* Charts for study analytics
* Pomodoro timer
* AI-based recommendations



 ✅ Advantages

* Helps organize study time efficiently
* Prioritizes important subjects automatically
* Saves time by generating daily plans
* Tracks progress clearly (topics + percentage)
* Works offline (no internet needed)



❌ Disadvantages

* Console-based (no visual UI, less user-friendly)
* Scheduling logic is simple (not real AI)
* Requires manual data input
* Limited flexibility for complex schedules
* No reminders/notifications










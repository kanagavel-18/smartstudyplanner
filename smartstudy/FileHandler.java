import java.io.*;
import java.util.*;

public class FileHandler {

    private static final String FILE_NAME = "subjects.dat";

    public static void save(List<Subject> subjects) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(subjects);
        } catch (IOException e) {
            System.out.println("Error saving data.");
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Subject> load() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            Object obj = ois.readObject();

            if (obj instanceof List<?>) {
                return (List<Subject>) obj;
            }

        } catch (Exception e) {
            // ignore and return empty list
        }

        return new ArrayList<>();
    }
}
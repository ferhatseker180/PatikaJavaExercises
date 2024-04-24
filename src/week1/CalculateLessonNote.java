package week1;

import java.util.Scanner;

public class CalculateLessonNote {
    public static void main(String[] args) {

        // First Step : Create Variable
        // Define Scanner
        // Ask Users Lessons Note
        // Get Variable Value
        // Sum All Notes and Divide Lessons Count
        // You Check Notes And Give Feedback

        // We defined our variable
        int math, physics, chemistry, turkish, history, music;

        // We imported Scanner and we asked exam result.
        Scanner note = new Scanner(System.in);
        System.out.println("Please, Enter Your Math Exam Result:");
        math = note.nextInt();

        System.out.println("Please, Enter Your Physics Exam Result:");
        physics = note.nextInt();

        System.out.println("Please, Enter Your Chemistry Exam Result:");
        chemistry = note.nextInt();

        System.out.println("Please, Enter Your Turkish Exam Result:");
        turkish = note.nextInt();

        System.out.println("Please, Enter Your History Exam Result:");
        history = note.nextInt();

        System.out.println("Please, Enter Your Music Exam Result:");
        music = note.nextInt();

        // Then we took these notes.

        // We calculated our lessons average note in here.
        double lessonsAverage = ((double) (math + physics + chemistry + turkish + history + music) / 6);

        // We compared our notes with passing note.If the average grade is equal to or greater than the passing grade, it will show that you passed the course;
        // if it is lower, it will show that you failed.
        System.out.println(lessonsAverage > 60 ? "You passed this class. Your lessons note average " + lessonsAverage
                : "You failed. Your lessons note average " + lessonsAverage);
    }
}

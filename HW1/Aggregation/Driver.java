package HW1.Aggregation;

public class Driver {
    public static void main(String[] args){
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 = new Instructor("Gabriel", "Bermudez", "1-1010");

        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook textbook2 = new Textbook("Python", "John F. Doe", "Pearson");

        Course course1 = new Course("Java Programming", instructor1, textbook1);
        Course course2 = new Course("Intro to Python", instructor2, textbook2);

        System.out.println("Course 1 Information:");
        course1.print();
        System.out.println();

        System.out.println("Course 2 Information:");
        course2.print();
    }
}

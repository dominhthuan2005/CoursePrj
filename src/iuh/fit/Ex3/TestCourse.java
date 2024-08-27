package iuh.fit.Ex3;

import java.util.Scanner;
public class TestCourse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CourseList courseList = new CourseList(10);

        initData(courseList);

        int choice;
        do {
            System.out.println("1. Add course");
            System.out.println("2. Display all courses");
            System.out.println("3. Remove a course");
            System.out.println("4. Search course");
            System.out.println("5. Search ID");
            System.out.println("6. Search department");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter course id: ");
                    String id = sc.nextLine();
                    System.out.print("Enter course title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter course credit: ");
                    int credit = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter course department: ");
                    String department = sc.nextLine();
                    Course course = new Course(id, title, credit, department);
                    if (courseList.addCourse(course)) {
                        System.out.println("Course added successfully!");
                    } else {
                        System.out.println("Course not added!");
                    }
                }
                case 2 -> {
                    System.out.println("Course List");
                    System.out.println("\n");
                    System.out.println(String.format("%-10s%-30s %2s %-10s", "ID", "Title", "Credit", "Department"));
                    for (Course c : courseList.getCourses()) {
                        if (c != null)
                            System.out.println(c);
                    }
                    System.out.println("\n");
                }
                case 3 -> {

                }
                default ->
                        System.out.println("Invalid choice!");
            }
        } while (choice != 0);

    }

    private static void initData(CourseList courseList) {
        Course course1 = new Course("101", "Java Programming", 3, "\tIT");
        Course course2 = new Course("102", "Python Programming", 3, "\tIT");
        Course course3 = new Course("103", "Data structures and algorithms", 3, "\tIT");
        Course course4 = new Course("105", "Software Engineering", 3, "\tIT");

        courseList.addCourse(course1);
        courseList.addCourse(course2);
        courseList.addCourse(course3);
        courseList.addCourse(course4);

    }
}
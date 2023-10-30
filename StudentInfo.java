import java.util.*;

class Student {
    private String name;
    private List<String> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }
}

class School {
    private Map<String, Student> students;

    public School() {
        students = new HashMap<>();
    }

    public void addStudent(String name, List<String> courses) {
        Student student = new Student(name);
        for (String course : courses) {
            student.addCourse(course);
        }
        students.put(name, student);
    }

    public void removeStudent(String name) {
        students.remove(name);
    }

    public void addCourseToStudent(String name, String course) {
        Student student = students.get(name);
        if (student != null) {
            student.addCourse(course);
        }
    }

    public void removeCourseFromStudent(String name, String course) {
        Student student = students.get(name);
        if (student != null) {
            student.removeCourse(course);
        }
    }

    public List<String> getStudentCourses(String name) {
        Student student = students.get(name);
        if (student != null) {
            return student.getCourses();
        }
        return Collections.emptyList();
    }
}

public class StudentInfo{
    public static void main(String[] args) {
        School school = new School();

        // Adding students with their courses
        school.addStudent("Ramu", Arrays.asList("Math", "History", "Physics"));
        school.addStudent("Lucky", Arrays.asList("English", "Chemistry"));
        school.addStudent("Sita", Arrays.asList("English", "Zoology", "Botny"));
        school.addStudent("Sai", Arrays.asList("English", "Chemistry", "Telugu"));
        school.addStudent("Chintu", Arrays.asList("English", "Hindi", "Social"));
        school.addStudent("Boby", Arrays.asList("English", "Chemistry"));


        // Adding courses to a specific student
        school.addCourseToStudent("Ramu", "Biology");
        school.addCourseToStudent("Sai", "Art"); 

        // Removing a student
        school.removeStudent("Boby");

        // Removing a course from a specific student
        school.removeCourseFromStudent("Chintu", "English");

        // Getting a list of courses for a specific student
        List<String> sitaCourses = school.getStudentCourses("Sita");
        System.out.println("Sita's Courses: " + sitaCourses); 

        // Getting a list of courses for a student that doesn't exist
        List<String> chintuCourses = school.getStudentCourses("Chintu");
        System.out.println("Chintu's Courses: " + chintuCourses);
        
        List<String> ramuCourses = school.getStudentCourses("Ramu");
        System.out.println("Ramu's Courses: " + ramuCourses);
        
        List<String> bobyCourses = school.getStudentCourses("Boby");
        System.out.println("Boby's Courses: " + bobyCourses);
        
    }
}
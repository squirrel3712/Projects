package lesson17.task4;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> marks;

    public Student(String name, String group, int course, Map<String, Integer> marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<String, Integer> marks) {
        this.marks = marks;
    }

    public static void averageMark(List<Student> students) {
        int sum, averageSum = 0;
        for (Student s : students) {
            sum = 0;
            Map<String, Integer> marks = s.getMarks();
            Set<Map.Entry<String, Integer>> set = marks.entrySet();
            for (Map.Entry<String, Integer> map : set) {
                String key = map.getKey();
                sum += marks.get(key);
            }
            averageSum = sum / marks.size();
            if (averageSum >= 3) {
                s.setCourse(s.getCourse() + 1);
            } else {
                students.remove(s);
            }
        }
    }

    public static void printStudent(List<Student> students, int cource) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == cource) {
                System.out.println(student.getName());
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (course != student.course) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (group != null ? !group.equals(student.group) : student.group != null) return false;
        return marks != null ? marks.equals(student.marks) : student.marks == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (group != null ? group.hashCode() : 0);
        result = 31 * result + course;
        result = 31 * result + (marks != null ? marks.hashCode() : 0);
        return result;
    }
}


package ds.hash;

import java.util.HashSet;
import java.util.Objects;

public class HashKey01_CustomKeyDemo {
    static class Student {
        String name;
        int grade;

        Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Student)) {
                return false;
            }
            Student student = (Student) o;
            return grade == student.grade && Objects.equals(name, student.name);
        }
        @Override
        public int hashCode() {
            return Objects.hash(name, grade);
        }
        @Override
        public String toString() {
            return name + "(" + grade + ")";
        }
    }
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();

        set.add(new Student("gamja", 1));
        set.add(new Student("gamja", 1));

        System.out.println("set 크기 " + set.size());
        System.out.println(set);
    }

}

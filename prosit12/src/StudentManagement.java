import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StudentManagement implements Management {

    @Override
    public void displayStudents(List<Student> students, Consumer<Student> con) {
        for (Student s : students) {
            con.accept(s);
        }
    }

    @Override
    public void displayStudentsByFilter(List<Student> students, Predicate<Student> pre, Consumer<Student> con) {
        for (Student s : students) {
            if (pre.test(s))
                con.accept(s);
        }
    }

    @Override
    public String returnStudentsNames(List<Student> students, Function<Student, String> fun) {
        String names = "";
        for (Student s : students) {
            names += " " + fun.apply(s);
        }
        return names;
    }

    @Override
    public Student createStudent(Supplier<Student> sup) {
        return sup.get();
    }

    @Override
    public List<Student> sortStudentsById(List<Student> students, Comparator<Student> com) {
        Collections.sort(students, com);
        return students;
    }

    @Override
    public Stream<Student> convertToStream(List<Student> students) {
        return students.stream();
    }
}

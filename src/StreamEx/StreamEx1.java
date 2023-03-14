package StreamEx;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("일번타", 3, 300),
                new Student("이번타", 1, 200),
                new Student("삼번타", 2, 100),
                new Student("사번타", 2, 150),
                new Student("오번타", 1, 200),
                new Student("육번타", 3, 290),
                new Student("칠번타", 3, 180)
        );
        studentStream.sorted(Comparator.comparing(Student::getBan)
                .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);
    }
}

class Student implements Comparable<Student> {
    String name;
    int ban;
    int totalScore;
    Student(String name, int ban, int totalScore){
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    @Override
    public String toString(){
        return String.format("[%s, %d, %d]", name, ban, totalScore);
    }

    String getName(){
        return name;
    }

    int getBan(){
        return ban;
    }

    int getTotalScore(){
        return  totalScore;
    }

    public int compareTo(Student s){
        return s.totalScore - this.totalScore;
    }

}
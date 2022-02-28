package hr.management;

import hr.management.human.Human;
import hr.management.human.Student;
import hr.management.human.Worker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static List<Human> init10StudentList() {
        List<Human> students = new ArrayList<>();
        students.add(new Student("Dang", "Xuyen", 9.5));
        students.add(new Student("Nguyen", "Lan", 3.5));
        students.add(new Student("Le", "Lam", 7.5));
        students.add(new Student("Tran", "Ngoc", 9.0));
        students.add(new Student("Pham", "Han", 10.0));
        students.add(new Student("Dang", "Thang", 8.5));
        students.add(new Student("Ngo", "Phu", 8.0));
        students.add(new Student("Le", "Tuan", 9.5));
        students.add(new Student("Phan", "Tung", 5.5));
        students.add(new Student("Tran", "Han", 6.0));
        return students;
    }

    public static List<Human> init10WorkerList() {
        List<Human> workers = new ArrayList<>();
        workers.add(new Worker("Dang", "Ngoc", 893.45, 8));
        workers.add(new Worker("Tran", "Thuong", 1003.45, 12));
        workers.add(new Worker("Ngo", "Tam", 993.45, 8.5));
        workers.add(new Worker("Phan", "Yen", 793.5, 9));
        workers.add(new Worker("Pham", "Y", 493.45, 7));
        workers.add(new Worker("Pham", "Tan", 93.45, 9));
        workers.add(new Worker("Le", "Hong", 983.45, 10));
        workers.add(new Worker("Nguyen", "Phung", 793.45, 8.5));
        workers.add(new Worker("To", "Han", 876.45, 8.5));
        workers.add(new Worker("Quach", "Vy", 913.45, 9.5));
        return workers;
    }

    static void displayList(List<Human> list) {
        int index = 1;
        for (Human human : list) {
            System.out.println(index + ". " + human);
            index++;
        }
    }

    static List<Human> sortAscStudentByGrade(List<Human> list) {
        try {
            list.sort(Comparator.comparingDouble(o -> ((Student) o).getGrade()));
            return list;
        } catch (ClassCastException e) {
            return list;
        }

    }

    static List<Human> sortDesWorkerByMoneyPerHour(List<Human> list) {
        try {
            list.sort(Comparator.comparingDouble(o -> ((Worker) o).earnMoneyPerHour()));
            Collections.reverse(list);
            return list;
        } catch (
                ClassCastException e) {
            return list;
        }

    }

    public static void main(String[] args) {
        List<Human> students = init10StudentList();
        System.out.println("\nList of 10 students:");
        displayList(students);
        List<Human> workers = init10WorkerList();
        System.out.println("\nList of 10 workers:");
        displayList(workers);
        System.out.println("\nList of 10 students after sorting by grade in ascending order:");
        displayList(sortAscStudentByGrade(workers));
        System.out.println("\nList of 10 workers after sorting by money per hour in descending order:");
        displayList(sortDesWorkerByMoneyPerHour(workers));
    }

}

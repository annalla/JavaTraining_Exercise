package hr.management;

import hr.management.human.Human;
import hr.management.human.Student;
import hr.management.human.Worker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public List<Human> init10StudentList() {
        List<Human> students = new ArrayList<>();
        students.add(new Student("Dang", "Xuyen", 9.5));
        students.add(new Student("Nguyen", "Lan", 3.5));
        students.add(new Student("Le", "Lam", 7.5));
        students.add(new Student("Tran", "Ngoc", 9.0));
        students.add(new Student("Pham", "Han", 10.0));
        students.add(new Student(null, "Thang", 8.5));
        students.add(new Student("Ngo", "Phu", 8.0));
        students.add(new Student("Le", "Tuan", 9.5));
        students.add(new Student("Phan", "Tung", -5.5));
        students.add(new Student("Tran", "Han", 11.0));
        return students;
    }

    public List<Human> init10WorkerList() {
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
        workers.add(new Worker("Quach", "Vy", -913.45, -9.5));
        return workers;
    }

    public void displayList(List<Human> list) {
        int index = 1;
        for (Human human : list) {
            System.out.println(index + ". " + human);
            index++;
        }
    }


    public List<Human> mergeTwoList(List<Human> list1, List<Human> list2) {
        return Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Main main = new Main();
        List<Human> students = main.init10StudentList();
        System.out.println("\nList of 10 students:");
        main.displayList(students);
        List<Human> workers = main.init10WorkerList();
        System.out.println("\nList of 10 workers:");
        main.displayList(workers);
        System.out.println("\nList of 10 students after sorting by grade in ascending order:");
        List<Human> sortedStudent = Sorting.sortAscStudentByGrade(students);
        if (sortedStudent == null) {
            System.out.println("Sort ascending students by grade error");
        } else {
            main.displayList(sortedStudent);
        }
        List<Human> sortedWorker = Sorting.sortDesWorkerByMoneyPerHour(workers);
        System.out.println("\nList of 10 workers after sorting by money per hour in descending order:");
        if (sortedWorker == null) {
            System.out.println("Sort descending  worker by money per hour error");
        } else {
            main.displayList(sortedWorker);
        }
        main.displayList(Sorting.sortDesWorkerByMoneyPerHour(workers));
        List<Human> newList = main.mergeTwoList(students, workers);
        System.out.println("\nMerge Two List and sort by first name and last name:");

        List<Human> sortedHuman = Sorting.sortHumanByFirstnameLastName(newList);
        if (sortedHuman == null) {
            System.out.println("Sort human by first name and last name");
        } else {
            main.displayList(sortedHuman);
        }
    }

}

package hr.management;

import hr.management.human.Human;
import hr.management.human.Student;
import hr.management.human.Worker;

import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static List<Human> sortDesWorkerByMoneyPerHour(List<Human> list) {
        try {
            list.sort(Comparator.comparingDouble(o -> ((Worker) o).earnMoneyPerHour()).reversed());
            return list;
        } catch (ClassCastException e) {
            return null;
        }

    }

    public static List<Human> sortAscStudentByGrade(List<Human> list) {
        try {
            list.sort(Comparator.comparingDouble(o -> ((Student) o).getGrade()));
            return list;
        } catch (ClassCastException e) {
            return null;
        }

    }


    public static List<Human> sortHumanByFirstnameLastName(List<Human> list) {
        try {
            list.sort((h1, h2) -> {
                int res = h1.getLastName().compareToIgnoreCase(h2.getLastName());
                if (res != 0)
                    return res;
                return h1.getFirstName().compareToIgnoreCase(h2.getFirstName());
            });
            return list;
        } catch (
                ClassCastException e) {
            return null;
        }

    }
}

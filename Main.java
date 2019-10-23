package oop.lab;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Boss> bosses = new ArrayList<Boss>();
        bosses.add(new Boss("Alexey",new Company("Adidas")));
        bosses.add(new Boss("Evgenii",new Company("Acer")));
        bosses.add(new Boss("Sviatoslav",new Company("Intell")));
        bosses.add(new Boss("Egor",new Company("Oculus")));
        bosses.add(new Boss("Gena",new Company("Ali")));
        bosses.add(new Boss("Marina",new Company("Bosh")));

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Vania"));
        employees.add(new Employee("Lena"));
        employees.add(new Employee("Sasha"));
        employees.add(new Employee("Kolia"));
        employees.add(new Employee("Misha"));
        employees.add(new Employee("Igor"));

        employees.get(0).TryToJoinCompanyByBoss(bosses.get(0));
        if(!employees.get(0).TryToJoinCompanyByBoss(bosses.get(0))) {
            System.out.println("test 1 passed");
        }

        employees.get(0).TryToJoinCompanyByBoss(bosses.get(1));
        employees.get(0).TryToJoinCompanyByBoss(bosses.get(2));
        employees.get(0).TryToJoinCompanyByBoss(bosses.get(3));
        employees.get(0).TryToJoinCompanyByBoss(bosses.get(4));

        if(!employees.get(0).TryToJoinCompanyByBoss(bosses.get(5))) {
            System.out.println("test 2 passed");
        }

        if (bosses.get(0).isInCompany(employees.get(0).getName())) {
            System.out.println("test 3 passed");
        }

        bosses.get(0).kickWorker(employees.get(0));
        if (!employees.get(0).isCompany(bosses.get(0).getCompany())) {
            System.out.println("test 4.1 passed");
        }
        if (!bosses.get(0).isInCompany(employees.get(0).getName())) {
            System.out.println("test 4.2 passed");
        }

        employees.get(0).LeaveCompanyByBossName(bosses.get(1));
        if (!employees.get(0).isCompany(bosses.get(1).getCompany())) {
            System.out.println("test 5.1 passed");
        }
        if (!bosses.get(1).isInCompany(employees.get(0).getName())) {
            System.out.println("test 5.2 passed");
        }

        for (int i = 0; i < employees.size(); i++) {
            int index = Math.abs(new Random().nextInt() % bosses.size());
            employees.get(i).TryToJoinCompanyByBoss(bosses.get(index));
        }

        for (int i = 0; i < employees.size(); i++) {
            int index = Math.abs(new Random().nextInt() % bosses.size());
            employees.get(i).TryToJoinCompanyByBoss(bosses.get(index));
        }

        for (int i = 0; i < employees.size(); i++) {
            int index = Math.abs(new Random().nextInt() % bosses.size());
            employees.get(i).TryToJoinCompanyByBoss(bosses.get(index));
        }

        System.out.println("\n");
        for (Boss boss : bosses) {
            System.out.println(boss);
        }
    }

}

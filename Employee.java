package oop.lab;

import java.util.ArrayList;

public class Employee extends Worker {

    private ArrayList<Boss> bossesOfCompanies = new ArrayList<Boss>();

    public boolean TryToJoinCompanyByBoss(final Boss boss) {
        if (bossesOfCompanies.size() == 5) {
            return false;
        }
        else if (bossesOfCompanies.contains(boss)) {
            return false;
        }
        else {
            //
            if (boss.AskForAccept(this)) {
                bossesOfCompanies.add(boss);
                return true;
            }
            else {
                return false;
            }
            //
        }
    }

    public boolean LeaveCompanyByBossName(final Boss boss) {
        if(bossesOfCompanies.contains(boss)) {
            bossesOfCompanies.remove(boss);
            boss.kickWorker(this);
            return true;
        }
        else {
            return false;
        }
    }

    public Employee(final String name) {
        super(name);
    }

    public boolean isCompany(final Company company) {
        for (Boss boss: bossesOfCompanies) {
            if (boss.getCompany() == company) {
                return true;
            }
        }
        return false;
    }

}

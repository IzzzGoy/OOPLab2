package oop.lab;

public class Boss extends Worker {

    private Company company;

    public Boss(final String name,Company company) {
        super(name);
        this.company = company;
    }

    public boolean kickWorker(final Employee employee) {
        if (company.ContainsEmployee(employee)) {
            employee.LeaveCompanyByBossName(this);
            company.kickWorkerFromCompany(employee);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean AskForAccept(final Employee employee) {
        if(BossChoise()) {
            company.AcceptWorker(employee);
            return true;
        }
        else {
            return false;
        }
    }

    private boolean BossChoise() {
        if(company.getCompanySize() == 0) {
            return true;
        }
         else {
             double r = Math.random();
             if(3.0/company.getCompanySize() > r ) {
                 return true;
             }
             else {
                 return false;
             }
        }
    }

    public boolean isInCompany(final String name) {
        if(company.getEmployee(name) != null) {
            return true;
        }
        else {
            return false;
        }
    }

    public Employee getEmployye(final String name) {
        return company.getEmployee(name);
    }

    public Company getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Boss name: " + getName() + "\n" + company;
    }
}

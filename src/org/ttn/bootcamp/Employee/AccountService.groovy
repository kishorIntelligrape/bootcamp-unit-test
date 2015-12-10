package org.ttn.bootcamp.Employee

/**
 * Created by kishor on 10/12/15.
 */
class AccountService {

    private static Map salaryByAuthority = ["Manager" : 25000.00, "Team Lead" : 20000, "Associate" : 15000]

    public static Double calculateSalary (Employee employee) {
        return salaryByAuthority[employee.authority]
    }

    public static creditSalary (Employee employee) {
        // TODO:  Yet to be implemented
    }

    public static Double calculateBonus (Employee employee) {
        return BonusService.calculateBonus(employee)
    }
}

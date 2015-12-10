package org.ttn.bootcamp.Employee

/**
 * Created by kishor on 10/12/15.
 */
class BonusService {

    private static Map bonusByAuthority = ["Manager" : 25000.00, "Team Lead" : 20000, "Associate" : 15000]

    public static Double calculateBonus (Employee employee) {
        return bonusByAuthority[employee.authority]
    }
}

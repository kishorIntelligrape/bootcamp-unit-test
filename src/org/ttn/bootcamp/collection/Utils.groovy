package org.ttn.bootcamp.collection

/**
 * Created by kishor on 10/12/15.
 */
class Utils {

    public static List collect(List list, Closure callback) {
        return list.collect(callback)
    }

    public static Map groupBy(List list, Closure callback) {
        return list.groupBy(callback)
    }

    public static List sort(List list, Closure callback) {
        return list.sort(callback)
    }

    public static String joinStr(List list, String separator) {
        return list.join(separator)
    }

    public static List tokenizeStr(String str, String separator) {
        return str.tokenize(separator)
    }

    public static void main (String ...args) {
        // Test collect method
        List aList = [1,2,3,4]
        println ("Collect worked: " + ([2,4,6,8] == collect(aList) {it * 2}))
        println ("GroupBy worked: " + ([0: [2,4], 1: [1,3]] == groupBy(aList) {it % 2}))
        println ("Sort worked: " + ([1,2,3,4,5,6] == sort([2,6,4,3,1,5]) {it}))
        println ("Join worked: " + ("2,6,4,3,1,5" == joinStr([2,6,4,3,1,5], ",")))
        println ("Tokenize worked: " + (['2','6','4','3','1','5'] == tokenizeStr("2,6,4,3,1,5", ",")))

    }
}

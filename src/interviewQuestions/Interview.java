package interviewQuestions;

import java.util.*;

public class Interview {

    /*Return type should be a map.
    list of integers as an input.and need to return the highest and secondhighest of the list.
       method should return a map with the hightest and second highest key value pair*/
    public static Map<String, Integer> returnHighestAndSecondHighest(List<Integer> listOfIntegers) {
        System.out.println("Given List of Integers as input: " + listOfIntegers);
        Map<String, Integer> listMap = new LinkedHashMap<>();

        int maxElement = Integer.MIN_VALUE;
        int secondMaxElement = Integer.MIN_VALUE;

        for (int num : listOfIntegers) {
            if (num > maxElement) {
                secondMaxElement = maxElement;
                maxElement = num;
            } else if (num > secondMaxElement && num != maxElement) {
                secondMaxElement = num;
            }
        }
        listMap.put("highestElement", maxElement);
        listMap.put("secondHighestElement", secondMaxElement);

        return listMap;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 3, 9, 5, 6);

        Map<String, Integer> result = returnHighestAndSecondHighest(list);

        System.out.println("FirstHighestElement: " + result.get("highestElement"));
        System.out.println("SecondHighestElement: " + result.get("secondHighestElement"));
    }
}
//employee -4 columns
// employeeId,employeeName,departMentId,salary
// and department
// departmentId, departmentName

//to get the employeeId with its department name
//all the salary of the total employees

//   correct answers:
//    select e.employeeId, d.departmentName
//    from employee e
//    Inner Join department d on e.departmentId = d.departmentId;
//
//    select sum(salary) as totalSalary
//    from employee







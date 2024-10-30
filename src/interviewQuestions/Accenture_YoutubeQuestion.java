package interviewQuestions;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {

    private String employee_name;
    private int employee_id;
    private String phoneNumber;

    /*While phone numbers are numeric, storing them as a String instead of a long (or other numeric types) is often preferable for several reasons:

Phone Numbers Aren't Used in Arithmetic:
Phone numbers are identifiers, not values for mathematical operations. Treating them as strings prevents accidental arithmetic operations.

Preserving Leading Zeros:
Some phone numbers start with a zero, especially in certain countries or area codes. If stored as a numeric type (e.g., long), leading zeros would be removed (e.g., 0123456789 would become 123456789), which changes the phone number.

Length and Format Variations:
Phone numbers can vary in length and may include special characters like +, -, (, ), or spaces, especially in international formats (e.g., +1-234-567-8901). Strings allow us to store these characters directly, while a numeric type would not.

Overflow Concerns:
Long phone numbers exceed the maximum value that int can store and can be close to or beyond the upper limit of long (especially for international numbers with country codes). A String safely handles even very long numbers without risk of overflow.

For these reasons, String is generally a more appropriate choice for representing phone numbers in most applications.*/

    public Employee(String employee_name, String phoneNumber, int employee_id) {
        this.employee_name = employee_name;
        this.phoneNumber = phoneNumber;
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

public class Accenture_YoutubeQuestion {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee("shaik", "84579658745", 1),
                new Employee("Shavalli", "2547859632", 2),
                new Employee("Sharif", "4125779598", 3)
        );

        List<String> phoneNumbers = employeeList.stream()
                .map(Employee::getPhoneNumber)
                .collect(Collectors.toList());

        System.out.println("PhoneNumbers : " + phoneNumbers);
    }
}

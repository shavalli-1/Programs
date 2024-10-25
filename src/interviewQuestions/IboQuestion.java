package interviewQuestions;

import java.util.Arrays;

public class IboQuestion {

    public static int findIndexOfElement(int[] array, int k) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 5) {
                return i;
            }
        }
        return -1;
    }

    /* to improve the time complexity we need to go with the binary search */

    public static int findIndexOfElementWithAdv(int[] array, int k){

        // Use binary search on the sorted array
         int index = Arrays.binarySearch(array,k);
        // If element is found, return its index
         return index >=0 ? index : -1;
    }


    public static void main(String[] args) {

        //array : [1,2,2,3,3,3,4,4,5,5,5,6,7], k=5
        //function should return the first index of element k

        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 6, 7};
        //int result = findIndexOfElement(array, 5);
        int result = findIndexOfElementWithAdv(array, 5);

        System.out.println("Index position of the given element: " + result);

    }

//    public static class User {
//
//        String name;
//        String Organization;
//        int age;
//        String email;
//        double phoneNumber;
//
//
//      //  Product product = new Product();
//
//
//    }

//    public static class Products {
//
//        int quantity;
//        String color;
//        String brand;
//
//        public Products(int quantity, String color, String brand) {
//            this.quantity = quantity;
//            this.color = color;
//            this.brand = brand;
//        }
//
//
//    }

//    public static class Orders {
//
//        int quantity;
//        String brand;
//        String color;
//        String place;
//        String delar;
//
//        //total number of orders placed by each user
//
//
//    //    select o.orders,sum(orders)
//    //    from users u
//    //    inner join orders ON  orders o where u.order_id=o.order_id
//    //    group by users;
//
//    }
}

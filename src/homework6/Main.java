package homework6;

import java.lang.reflect.Array;
import java.util.Arrays;

import static homework6.Customer.customer;

public class Main {

    public static void main(String[] args) {

        customer[0] = new Phone(32223343, "Bob", "Favidson", "David", 0507562213,
                "Vysotskogo", "5353-7505-5551-0356", 5000, 1000, 6.50, 1, 5);
        customer[1] = new Phone(74869040, "Muhamed", "Favidson", "Pop", 0507562212,
                "Vysotskogo", "5353-7505-5551-0357", 6000, 104775700, 0, 0, 7);
        customer[2] = new Phone(32223346, "Sam", "Smith", "Max", 0675575621,
                "Vysotskogo", "5353-7505-5551-0358", 7000, 10300, 2.6, 0, 22);
        customer[3] = new Phone(32223347, "Alex", "Bell", "Chiliad", 0675575624,
                "Vysotskogo", "5353-7505-5551-0359", 8000, 108900, 20, 7, 0);
        customer[4] = new Phone(32223348, "Stefiny", "Muller", "Gonduras", 0675575625,
                "Vysotskogo", "5353-7505-5551-0351", 9000, 13000, 6.4, 0, 8);
        customer[5] = new Phone(32223349, "Melony", "Boguslavskaya", "Faraohn", 0675575626,
                "Vysotskogo", "5353-7505-5551-0352", 10000, 10080, 5.7, 5, 5);
        customer[6] = new Phone(32223340, "Fred", "Bimba", "Cruger", 0675575627,
                "Vysotskogo", "5353-7505-5551-0353", 52000, 109600, 50, 0, 5);
        customer[7] = new Phone(32223335, "Aboma", "Abeba", "Hrugrer", 0675575612,
                "Vysotskogo", "5353-7505-5551-0354", 58000, 14000, 6, 4, 26);
        customer[8] = new Phone(32223341, "Yuriy", "Yiruy", "Brisola", 0675575632,
                "Vysotskogo", "5353-7505-5551-0336", 50060, 107500, 4.50, 0, 4);
        customer[9] = new Phone(32223348, "Nastya", "Stalin", "Bismark", 0675575662,
                "Vysotskogo", "5353-7505-5551-0389", 50080, 10040, 8.5, 0, 100);

        Sort sort = new Sort();
//sort.getOverCityTime(10);
        System.out.println("-----------------------------------------------------------------------------");
//sort.getInternationalTime();
        System.out.println("----------------------------------------------------------------------------");
//        sort.getCustomersInAlphabetOrder();
        System.out.println("----------------------------------------------------------------------------");

        // I decided to only get the first five elements of the array because it better shows how it works. Because I only have 10 elements.

        sort.get10InternetCustomer();
    }

}

package homework6;

import java.util.Arrays;

import static homework6.Customer.customer;
import static java.lang.Float.parseFloat;

public class Sort implements SortInterface {


    @Override
    public void getOverCityTime(int time) {
        for (Phone customers : customer) {
            if (time < customers.getCityTime()) {
                System.out.println(customers);
            }
        }
    }


    @Override
    public void getInternationalTime() {
        for (Phone customers : customer) {
            if (customers.getInternationalTime() > 0)
                System.out.println(customers);
        }
    }

    @Override
    public void getCustomersInAlphabetOrder() {

        Arrays.sort(customer, (a, b) -> a.getName().compareTo(b.getName()));
        for (Phone customers : customer) {
            System.out.println(customers);
        }
    }

    @Override
    public void get10InternetCustomer() {
        Arrays.sort(customer,(a, b) -> (int) (parseFloat(String.valueOf(b.getInternetTraffic())) - parseFloat(String.valueOf(a.getInternetTraffic()))));
        for(int i = 0; i < 5; i++) {
            System.out.println(customer[i]);
        }
    }
}
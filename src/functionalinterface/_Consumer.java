package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        //Normal function
        Customer maria = new Customer("maria", "9999");
        greetCustomer(maria);

        //Consumer functional interface
        greetCustomerConsumer.accept(maria);

        //BiConsumer functional interface
        greetCustomerBiConsumer.accept(maria, false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhone) ->
            System.out.println(
                    "hello " + customer.getName() +
                            " Thank you for registering phone number " +
                            ( showPhone ? customer.getPhone() : "*******")
            );
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println(
                    "hello " + customer.getName() +
                            " Thank you for registering phone number " +
                            customer.getPhone()
            );
    static void greetCustomer(Customer customer){
        System.out.println(
                "hello " + customer.getName() +
                        "Thank you for registering phone number " +
                        customer.getPhone()
        );
    }
    static class Customer{
        private final String name ;
        private final String phone;

        public Customer(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }
    }
}

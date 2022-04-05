package org.genspark;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class AppConfig {
    @Bean
    public Phone phone1() {
        Phone phone = new Phone();
        phone.setMob("7894564567");
        return phone;
    }

    @Bean
    public Phone phone2() {
        Phone phone = new Phone();
        phone.setMob("4567892131");
        return phone;
    }

    @Bean
    public Address address() {
        Address address = new Address();
        address.setCity("New York");
        address.setCountry("United States of America");
        address.setZipcode("10001");
        address.setState("New York");
        return address;
    }

    @Bean
    public Employee employee(Phone phone1, Phone phone2, Address address) {
        Employee employee = new Employee();
        employee.setAddress(address);
        employee.setName("John Day");
        employee.setId(2);
        employee.setPh(new ArrayList<Phone>());
        employee.getPh().add(phone1);
        employee.getPh().add(phone2);
        return employee;
    }
}
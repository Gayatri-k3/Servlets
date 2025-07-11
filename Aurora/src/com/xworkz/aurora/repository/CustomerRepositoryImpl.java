package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.CustomerDTO;
import com.xworkz.aurora.dto.PassportDTO;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CustomerRepositoryImpl implements CustomerRepository {

    private final Set<CustomerDTO> customers = new HashSet<>();

    public CustomerRepositoryImpl(PassportRepository passportRepository) {
        Iterator<PassportDTO> iterator = passportRepository.findAll().iterator();

        customers.add(new CustomerDTO("Aarav Sharma", "aarav.sharma@email.com", 9876543210L, iterator.next()));
        customers.add(new CustomerDTO("Isha Verma", "isha.verma@email.com", 9876543211L, iterator.next()));
        customers.add(new CustomerDTO("Kunal Mehta", "kunal.mehta@email.com", 9876543212L, iterator.next()));
        customers.add(new CustomerDTO("Nisha Reddy", "nisha.reddy@email.com", 9876543213L, iterator.next()));
        customers.add(new CustomerDTO("Aditya Singh", "aditya.singh@email.com", 9876543214L, iterator.next()));
        customers.add(new CustomerDTO("Meera Iyer", "meera.iyer@email.com", 9876543215L, iterator.next()));
        customers.add(new CustomerDTO("Rohan Desai", "rohan.desai@email.com", 9876543216L, iterator.next()));
        customers.add(new CustomerDTO("Priya Joshi", "priya.joshi@email.com", 9876543217L, iterator.next()));
        customers.add(new CustomerDTO("Ankit Kapoor", "ankit.kapoor@email.com", 9876543218L, iterator.next()));
        customers.add(new CustomerDTO("Sanya Malhotra", "sanya.malhotra@email.com", 9876543219L, iterator.next()));
        customers.add(new CustomerDTO("Harshit Chauhan", "harshit.chauhan@email.com", 9876543220L, iterator.next()));
        customers.add(new CustomerDTO("Divya Nair", "divya.nair@email.com", 9876543221L, iterator.next()));
        customers.add(new CustomerDTO("Tanishq Jain", "tanishq.jain@email.com", 9876543222L, iterator.next()));
        customers.add(new CustomerDTO("Sneha Kulkarni", "sneha.kulkarni@email.com", 9876543223L, iterator.next()));
        customers.add(new CustomerDTO("Yash Gupta", "yash.gupta@email.com", 9876543224L, iterator.next()));
        customers.add(new CustomerDTO("Simran Kaur", "simran.kaur@email.com", 9876543225L, iterator.next()));
        customers.add(new CustomerDTO("Arjun Patil", "arjun.patil@email.com", 9876543226L, iterator.next()));
        customers.add(new CustomerDTO("Ritika Bansal", "ritika.bansal@email.com", 9876543227L, iterator.next()));
        customers.add(new CustomerDTO("Devansh Pandey", "devansh.pandey@email.com", 9876543228L, iterator.next()));
        customers.add(new CustomerDTO("Kritika Saxena", "kritika.saxena@email.com", 9876543229L, iterator.next()));
        customers.add(new CustomerDTO("Rajeev Menon", "rajeev.menon@email.com", 9876543230L, iterator.next()));
        customers.add(new CustomerDTO("Anjali Dutta", "anjali.dutta@email.com", 9876543231L, iterator.next()));
        customers.add(new CustomerDTO("Siddharth Rane", "siddharth.rane@email.com", 9876543232L, iterator.next()));
        customers.add(new CustomerDTO("Shruti Bhatt", "shruti.bhatt@email.com", 9876543233L, iterator.next()));
        customers.add(new CustomerDTO("Aman Sethi", "aman.sethi@email.com", 9876543234L, iterator.next()));
        customers.add(new CustomerDTO("Neha Sawant", "neha.sawant@email.com", 9876543235L, iterator.next()));
        customers.add(new CustomerDTO("Viraj Rao", "viraj.rao@email.com", 9876543236L, iterator.next()));
        customers.add(new CustomerDTO("Pooja Chatterjee", "pooja.chatterjee@email.com", 9876543237L, iterator.next()));
        customers.add(new CustomerDTO("Aakash Goyal", "aakash.goyal@email.com", 9876543238L, iterator.next()));
        customers.add(new CustomerDTO("Tanvi Bedi", "tanvi.bedi@email.com", 9876543239L, iterator.next()));
    }

    @Override
    public Set<CustomerDTO> findAll() {
        return customers;
    }
}

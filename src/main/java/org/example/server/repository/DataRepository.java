package org.example.server.repository;

import org.example.server.entity.Contact;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    public List<Contact> fetchData() {
        List<Contact> list = new ArrayList<>();
        list.add(new Contact(1, "Tetiana", "+380 (95) 327 88 75"));
        list.add(new Contact(2, "Yaroslav", "+380 (93) 576 80 16"));
        list.add(new Contact(3, "Vladislav", "+380 (97) 936 26 16"));
        return list;
    }
}

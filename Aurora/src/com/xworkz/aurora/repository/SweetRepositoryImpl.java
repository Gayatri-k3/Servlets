package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.SweetDTO;

import java.util.HashSet;
import java.util.Set;

public class SweetRepositoryImpl implements SweetRepository {

    @Override
    public Set<SweetDTO> findAll() {
        Set<SweetDTO> sweetSet = new HashSet<>();


        sweetSet.add(new SweetDTO("Kaju Katli", 250.0, new String[]{"Kaju", "Sugar", "Ghee", "Cardamom", "Milk"}, 0.5, 10));
        sweetSet.add(new SweetDTO("Rasgulla", 150.0, new String[]{"Milk", "Sugar", "Water", "Lemon", "Rose"}, 1.0, 12));
        sweetSet.add(new SweetDTO("Gulab Jamun", 180.0, new String[]{"Milk Powder", "Maida", "Ghee", "Sugar", "Cardamom"}, 0.75, 8));
        sweetSet.add(new SweetDTO("Mysore Pak", 200.0, new String[]{"Besan", "Ghee", "Sugar", "Water", "Cardamom"}, 0.5, 6));
        sweetSet.add(new SweetDTO("Jalebi", 160.0, new String[]{"Maida", "Curd", "Sugar", "Saffron", "Oil"}, 0.6, 15));
        sweetSet.add(new SweetDTO("Barfi", 170.0, new String[]{"Milk", "Sugar", "Ghee", "Almond", "Cardamom"}, 0.5, 7));
        sweetSet.add(new SweetDTO("Ladoo", 140.0, new String[]{"Besan", "Sugar", "Ghee", "Dry Fruits", "Cardamom"}, 0.5, 10));
        sweetSet.add(new SweetDTO("Halwa", 200.0, new String[]{"Wheat", "Sugar", "Ghee", "Cashew", "Cardamom"}, 0.6, 5));
        sweetSet.add(new SweetDTO("Soan Papdi", 120.0, new String[]{"Gram Flour", "Maida", "Ghee", "Sugar", "Cardamom"}, 0.4, 10));
        sweetSet.add(new SweetDTO("Peda", 180.0, new String[]{"Khoya", "Sugar", "Cardamom", "Saffron", "Ghee"}, 0.3, 6));
        sweetSet.add(new SweetDTO("Milk Cake", 210.0, new String[]{"Milk", "Sugar", "Ghee", "Cardamom", "Lemon"}, 0.5, 4));
        sweetSet.add(new SweetDTO("Cham Cham", 190.0, new String[]{"Chhena", "Sugar", "Milk", "Cardamom", "Coconut"}, 0.6, 8));
        sweetSet.add(new SweetDTO("Sandesh", 230.0, new String[]{"Chhena", "Sugar", "Cardamom", "Kesar", "Dry Fruits"}, 0.3, 6));
        sweetSet.add(new SweetDTO("Kalakand", 210.0, new String[]{"Milk", "Sugar", "Paneer", "Cardamom", "Ghee"}, 0.4, 7));
        sweetSet.add(new SweetDTO("Modak", 160.0, new String[]{"Rice Flour", "Jaggery", "Coconut", "Ghee", "Cardamom"}, 0.5, 11));
        sweetSet.add(new SweetDTO("Malpua", 190.0, new String[]{"Maida", "Sugar", "Milk", "Fennel", "Ghee"}, 0.4, 10));
        sweetSet.add(new SweetDTO("Kheer Kadam", 200.0, new String[]{"Milk", "Sugar", "Chhena", "Semolina", "Cardamom"}, 0.3, 4));
        sweetSet.add(new SweetDTO("Imarti", 170.0, new String[]{"Urad Dal", "Sugar", "Saffron", "Cardamom", "Ghee"}, 0.5, 10));
        sweetSet.add(new SweetDTO("Gujiya", 180.0, new String[]{"Maida", "Khoa", "Sugar", "Dry Fruits", "Ghee"}, 0.6, 8));
        sweetSet.add(new SweetDTO("Khaja", 190.0, new String[]{"Maida", "Sugar", "Ghee", "Cardamom", "Milk"}, 0.5, 5));
        sweetSet.add(new SweetDTO("Anarsa", 160.0, new String[]{"Rice Flour", "Jaggery", "Ghee", "Poppy Seeds", "Milk"}, 0.4, 6));
        sweetSet.add(new SweetDTO("Pathishapta", 200.0, new String[]{"Maida", "Jaggery", "Coconut", "Milk", "Ghee"}, 0.6, 7));
        sweetSet.add(new SweetDTO("Basundi", 180.0, new String[]{"Milk", "Sugar", "Cardamom", "Saffron", "Dry Fruits"}, 0.8, 6));
        sweetSet.add(new SweetDTO("Shrikhand", 190.0, new String[]{"Curd", "Sugar", "Saffron", "Cardamom", "Dry Fruits"}, 0.5, 3));
        sweetSet.add(new SweetDTO("Rabri", 210.0, new String[]{"Milk", "Sugar", "Cardamom", "Dry Fruits", "Kesar"}, 0.7, 4));
        sweetSet.add(new SweetDTO("Kesari Bath", 160.0, new String[]{"Semolina", "Ghee", "Sugar", "Cardamom", "Saffron"}, 0.5, 5));
        sweetSet.add(new SweetDTO("Rava Ladoo", 150.0, new String[]{"Semolina", "Sugar", "Ghee", "Dry Fruits", "Cardamom"}, 0.3, 10));
        sweetSet.add(new SweetDTO("Til Ladoo", 130.0, new String[]{"Sesame", "Jaggery", "Ghee", "Cardamom", "Peanuts"}, 0.4, 12));
        sweetSet.add(new SweetDTO("Kozhukattai", 140.0, new String[]{"Rice Flour", "Coconut", "Jaggery", "Cardamom", "Ghee"}, 0.4, 6));
        sweetSet.add(new SweetDTO("Chikki", 120.0, new String[]{"Peanuts", "Jaggery", "Ghee", "Cardamom", "Butter"}, 0.3, 10));

        return sweetSet;
    }
}

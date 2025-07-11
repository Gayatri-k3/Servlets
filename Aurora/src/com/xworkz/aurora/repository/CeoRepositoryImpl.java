package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.CeoDTO;
import com.xworkz.aurora.dto.HouseDTO;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CeoRepositoryImpl implements CeoRepository {

    private final Set<CeoDTO> ceos = new HashSet<>();

    public CeoRepositoryImpl(HouseRepository houseRepository) {
        Iterator<HouseDTO> iterator = houseRepository.findAll().iterator();

        ceos.add(new CeoDTO("Ratan Tata", 85, "Sustainable Growth", iterator.next()));
        ceos.add(new CeoDTO("Sundar Pichai", 51, "Innovation First", iterator.next()));
        ceos.add(new CeoDTO("Satya Nadella", 56, "Empower Every Person", iterator.next()));
        ceos.add(new CeoDTO("Elon Musk", 52, "Colonize Mars", iterator.next()));
        ceos.add(new CeoDTO("Tim Cook", 63, "Privacy & Environment", iterator.next()));
        ceos.add(new CeoDTO("Shantanu Narayen", 60, "Creativity for All", iterator.next()));
        ceos.add(new CeoDTO("Jeff Bezos", 60, "Customer Obsession", iterator.next()));
        ceos.add(new CeoDTO("Mark Zuckerberg", 40, "Connect the World", iterator.next()));
        ceos.add(new CeoDTO("Susan Wojcicki", 55, "Inclusive Media", iterator.next()));
        ceos.add(new CeoDTO("Arvind Krishna", 61, "AI & Cloud", iterator.next()));

        ceos.add(new CeoDTO("Andy Jassy", 57, "Global Cloud Leadership", iterator.next()));
        ceos.add(new CeoDTO("Reed Hastings", 63, "Entertainment Freedom", iterator.next()));
        ceos.add(new CeoDTO("Daniel Ek", 41, "Audio for All", iterator.next()));
        ceos.add(new CeoDTO("Jack Dorsey", 47, "Open Conversations", iterator.next()));
        ceos.add(new CeoDTO("Jensen Huang", 61, "AI Computing", iterator.next()));
        ceos.add(new CeoDTO("Lisa Su", 54, "High Performance Tech", iterator.next()));
        ceos.add(new CeoDTO("Dara Khosrowshahi", 54, "Mobility Redefined", iterator.next()));
        ceos.add(new CeoDTO("Pat Gelsinger", 62, "Semiconductor Innovation", iterator.next()));
        ceos.add(new CeoDTO("Ginni Rometty", 67, "Responsible Tech", iterator.next()));
        ceos.add(new CeoDTO("Marc Benioff", 59, "Equality & CRM", iterator.next()));

        ceos.add(new CeoDTO("Brian Chesky", 42, "Belong Anywhere", iterator.next()));
        ceos.add(new CeoDTO("Stewart Butterfield", 51, "Work Simplicity", iterator.next()));
        ceos.add(new CeoDTO("Whitney Wolfe Herd", 35, "Women First", iterator.next()));
        ceos.add(new CeoDTO("Anne Wojcicki", 51, "Genetic Health", iterator.next()));
        ceos.add(new CeoDTO("Susan Fowler", 33, "Ethical Workplaces", iterator.next()));
        ceos.add(new CeoDTO("Drew Houston", 41, "Seamless File Access", iterator.next()));
        ceos.add(new CeoDTO("Max Levchin", 49, "Smarter Finance", iterator.next()));
        ceos.add(new CeoDTO("Evan Spiegel", 34, "Augmented Reality", iterator.next()));
        ceos.add(new CeoDTO("Melanie Perkins", 37, "Design for Everyone", iterator.next()));
        ceos.add(new CeoDTO("Tobi Lütke", 44, "Empower Entrepreneurs", iterator.next()));
    }

    @Override
    public Set<CeoDTO> findAll() {
        return ceos;
    }
}

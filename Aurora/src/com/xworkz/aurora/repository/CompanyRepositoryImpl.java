package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.CeoDTO;
import com.xworkz.aurora.dto.CompanyDTO;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CompanyRepositoryImpl implements CompanyRepository {

    private final Set<CompanyDTO> companies = new HashSet<>();

    public CompanyRepositoryImpl(CeoRepository ceoRepository) {
        Iterator<CeoDTO> iterator = ceoRepository.findAll().iterator();

        companies.add(new CompanyDTO("Tata Group", "Mumbai", 750000, iterator.next()));
        companies.add(new CompanyDTO("Google", "Mountain View", 150000, iterator.next()));
        companies.add(new CompanyDTO("Microsoft", "Redmond", 220000, iterator.next()));
        companies.add(new CompanyDTO("Tesla", "Austin", 127000, iterator.next()));
        companies.add(new CompanyDTO("Apple", "Cupertino", 165000, iterator.next()));
        companies.add(new CompanyDTO("Adobe", "San Jose", 29000, iterator.next()));
        companies.add(new CompanyDTO("Amazon", "Seattle", 1600000, iterator.next()));
        companies.add(new CompanyDTO("Meta", "Menlo Park", 86000, iterator.next()));
        companies.add(new CompanyDTO("YouTube", "San Bruno", 5000, iterator.next()));
        companies.add(new CompanyDTO("IBM", "Armonk", 300000, iterator.next()));

        companies.add(new CompanyDTO("AWS", "Seattle", 600000, iterator.next()));
        companies.add(new CompanyDTO("Netflix", "Los Gatos", 12000, iterator.next()));
        companies.add(new CompanyDTO("Spotify", "Stockholm", 8000, iterator.next()));
        companies.add(new CompanyDTO("Twitter", "San Francisco", 4000, iterator.next()));
        companies.add(new CompanyDTO("NVIDIA", "Santa Clara", 26000, iterator.next()));
        companies.add(new CompanyDTO("AMD", "Santa Clara", 15000, iterator.next()));
        companies.add(new CompanyDTO("Uber", "San Francisco", 32000, iterator.next()));
        companies.add(new CompanyDTO("Intel", "Santa Clara", 125000, iterator.next()));
        companies.add(new CompanyDTO("Accenture", "Dublin", 738000, iterator.next()));
        companies.add(new CompanyDTO("Salesforce", "San Francisco", 79000, iterator.next()));

        companies.add(new CompanyDTO("Airbnb", "San Francisco", 6000, iterator.next()));
        companies.add(new CompanyDTO("Slack", "San Francisco", 2000, iterator.next()));
        companies.add(new CompanyDTO("Bumble", "Austin", 1000, iterator.next()));
        companies.add(new CompanyDTO("23andMe", "Sunnyvale", 900, iterator.next()));
        companies.add(new CompanyDTO("Refinery29", "New York", 300, iterator.next()));
        companies.add(new CompanyDTO("Dropbox", "San Francisco", 2700, iterator.next()));
        companies.add(new CompanyDTO("Affirm", "San Francisco", 2000, iterator.next()));
        companies.add(new CompanyDTO("Snap Inc.", "Santa Monica", 5000, iterator.next()));
        companies.add(new CompanyDTO("Canva", "Sydney", 3500, iterator.next()));
        companies.add(new CompanyDTO("Shopify", "Ottawa", 11000, iterator.next()));
    }

    @Override
    public Set<CompanyDTO> findAll() {
        return companies;
    }
}

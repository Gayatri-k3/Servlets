package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.DetailDTO;
import com.xworkz.aurora.dto.JobDTO;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JobRepositoryImpl implements JobRepository {
    private final Set<JobDTO> jobs = new HashSet<>();

    public JobRepositoryImpl(DetailRepository detailRepository) {
        Iterator<DetailDTO> iterator = detailRepository.findAll().iterator();

        jobs.add(new JobDTO("Software Engineer", "IT", 80000, iterator.next()));
        jobs.add(new JobDTO("Data Analyst", "Analytics", 60000, iterator.next()));
        jobs.add(new JobDTO("Product Manager", "Product", 95000, iterator.next()));
        jobs.add(new JobDTO("UI/UX Designer", "Design", 70000, iterator.next()));
        jobs.add(new JobDTO("HR Executive", "Human Resources", 50000, iterator.next()));
        jobs.add(new JobDTO("Marketing Specialist", "Marketing", 65000, iterator.next()));
        jobs.add(new JobDTO("QA Engineer", "Quality Assurance", 55000, iterator.next()));
        jobs.add(new JobDTO("DevOps Engineer", "Infrastructure", 85000, iterator.next()));
        jobs.add(new JobDTO("Technical Writer", "Documentation", 50000, iterator.next()));
        jobs.add(new JobDTO("Business Analyst", "Operations", 72000, iterator.next()));

        jobs.add(new JobDTO("Cloud Architect", "Cloud Services", 105000, iterator.next()));
        jobs.add(new JobDTO("Cybersecurity Analyst", "Security", 90000, iterator.next()));
        jobs.add(new JobDTO("AI Engineer", "Research", 110000, iterator.next()));
        jobs.add(new JobDTO("Database Admin", "Data Management", 75000, iterator.next()));
        jobs.add(new JobDTO("Front-End Developer", "IT", 70000, iterator.next()));
        jobs.add(new JobDTO("Back-End Developer", "IT", 75000, iterator.next()));
        jobs.add(new JobDTO("Network Engineer", "Networking", 67000, iterator.next()));
        jobs.add(new JobDTO("Content Strategist", "Content", 62000, iterator.next()));
        jobs.add(new JobDTO("SEO Analyst", "Digital Marketing", 58000, iterator.next()));
        jobs.add(new JobDTO("Scrum Master", "Agile Management", 90000, iterator.next()));

        jobs.add(new JobDTO("Legal Advisor", "Legal", 97000, iterator.next()));
        jobs.add(new JobDTO("Graphic Designer", "Design", 60000, iterator.next()));
        jobs.add(new JobDTO("Systems Analyst", "Systems", 71000, iterator.next()));
        jobs.add(new JobDTO("Sales Executive", "Sales", 64000, iterator.next()));
        jobs.add(new JobDTO("Public Relations Officer", "PR", 68000, iterator.next()));
        jobs.add(new JobDTO("Financial Analyst", "Finance", 80000, iterator.next()));
        jobs.add(new JobDTO("Mobile Developer", "IT", 77000, iterator.next()));
        jobs.add(new JobDTO("Instructional Designer", "Training", 66000, iterator.next()));
        jobs.add(new JobDTO("Research Associate", "R&D", 72000, iterator.next()));
        jobs.add(new JobDTO("Project Coordinator", "Project Management", 70000, iterator.next()));
    }

    @Override
    public Set<JobDTO> findAll() {
        return jobs;
    }
}

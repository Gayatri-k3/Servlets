package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.EducationDTO;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class EducationRepositoryImpl implements EducationRepository{
    @Override
    public Set<EducationDTO> findAll() {
        Set<EducationDTO> educations = new HashSet<>();

        educations.add(new EducationDTO("B.E", "IIT Bombay", 2015, "A"));
        educations.add(new EducationDTO("M.Tech", "MIT", 2016, "A"));
        educations.add(new EducationDTO("MBA", "IIM Bangalore", 2017, "B+"));
        educations.add(new EducationDTO("PhD", "Cambridge", 2018, "A"));
        educations.add(new EducationDTO("B.Sc", "St. Xavier's", 2014, "A-"));
        educations.add(new EducationDTO("MCA", "NIT Trichy", 2016, "A"));
        educations.add(new EducationDTO("B.Com", "Delhi University", 2015, "B+"));
        educations.add(new EducationDTO("B.A", "Oxford", 2013, "A"));
        educations.add(new EducationDTO("M.Sc", "Harvard", 2019, "A"));
        educations.add(new EducationDTO("M.E", "IISc Bangalore", 2020, "A+"));

        educations.add(new EducationDTO("LLB", "NLSIU", 2012, "A-"));
        educations.add(new EducationDTO("B.Arch", "SPA Delhi", 2016, "B"));
        educations.add(new EducationDTO("MBBS", "AIIMS Delhi", 2011, "A+"));
        educations.add(new EducationDTO("BDS", "Manipal", 2013, "A"));
        educations.add(new EducationDTO("BCA", "Christ University", 2017, "B+"));
        educations.add(new EducationDTO("M.Com", "Mumbai University", 2018, "B"));
        educations.add(new EducationDTO("BBA", "Symbiosis", 2015, "A-"));
        educations.add(new EducationDTO("Diploma in CS", "Govt Polytech", 2014, "B"));
        educations.add(new EducationDTO("M.A", "JNU", 2016, "A"));
        educations.add(new EducationDTO("M.Phil", "TISS", 2019, "A+"));

        educations.add(new EducationDTO("D.Pharm", "KLE College", 2012, "B"));
        educations.add(new EducationDTO("B.Ed", "BHU", 2013, "A"));
        educations.add(new EducationDTO("M.Ed", "IGNOU", 2016, "A-"));
        educations.add(new EducationDTO("MFA", "JJ School of Art", 2018, "A"));
        educations.add(new EducationDTO("BFA", "Shantiniketan", 2015, "B+"));
        educations.add(new EducationDTO("PGDM", "XLRI", 2017, "A"));
        educations.add(new EducationDTO("PGDBA", "ISB", 2019, "A+"));
        educations.add(new EducationDTO("M.Des", "NID Ahmedabad", 2016, "B+"));
        educations.add(new EducationDTO("B.Des", "Pearl Academy", 2014, "A-"));
        educations.add(new EducationDTO("D.Lit", "Jadavpur University", 2020, "A"));

        return educations;
    }
}

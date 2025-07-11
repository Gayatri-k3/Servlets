package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.DetailDTO;
import com.xworkz.aurora.dto.EducationDTO;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DetailRepositoryImpl implements DetailRepository {
     Set<DetailDTO> details = new HashSet<>();

    public DetailRepositoryImpl(EducationRepository educationRepository) {
        Iterator<EducationDTO> eduItr = educationRepository.findAll().iterator();

        details.add(new DetailDTO("Reading", "Java", 2, eduItr.next()));
        details.add(new DetailDTO("Swimming", "Python", 3, eduItr.next()));
        details.add(new DetailDTO("Hiking", "C++", 1, eduItr.next()));
        details.add(new DetailDTO("Singing", "SQL", 5, eduItr.next()));
        details.add(new DetailDTO("Dancing", "JavaScript", 4, eduItr.next()));
        details.add(new DetailDTO("Sketching", "Go", 2, eduItr.next()));
        details.add(new DetailDTO("Gaming", "Kotlin", 6, eduItr.next()));
        details.add(new DetailDTO("Writing", "Swift", 3, eduItr.next()));
        details.add(new DetailDTO("Photography", "R", 4, eduItr.next()));
        details.add(new DetailDTO("Cycling", "Rust", 1, eduItr.next()));

        details.add(new DetailDTO("Blogging", "TypeScript", 2, eduItr.next()));
        details.add(new DetailDTO("Public Speaking", "Shell", 5, eduItr.next()));
        details.add(new DetailDTO("Yoga", "Dart", 3, eduItr.next()));
        details.add(new DetailDTO("Meditation", "C#", 6, eduItr.next()));
        details.add(new DetailDTO("Acting", "Matlab", 2, eduItr.next()));
        details.add(new DetailDTO("Crafting", "VB.NET", 4, eduItr.next()));
        details.add(new DetailDTO("Gardening", "Perl", 3, eduItr.next()));
        details.add(new DetailDTO("Cooking", "Fortran", 5, eduItr.next()));
        details.add(new DetailDTO("Debating", "Scala", 2, eduItr.next()));
        details.add(new DetailDTO("Volunteering", "Groovy", 1, eduItr.next()));

        details.add(new DetailDTO("Travelling", "PowerShell", 6, eduItr.next()));
        details.add(new DetailDTO("Exploring", "Julia", 2, eduItr.next()));
        details.add(new DetailDTO("Filmmaking", "ABAP", 3, eduItr.next()));
        details.add(new DetailDTO("Learning Languages", "Bash", 4, eduItr.next()));
        details.add(new DetailDTO("Astronomy", "Assembly", 5, eduItr.next()));
        details.add(new DetailDTO("Bird Watching", "COBOL", 1, eduItr.next()));
        details.add(new DetailDTO("Calligraphy", "Haskell", 3, eduItr.next()));
        details.add(new DetailDTO("Storytelling", "Pascal", 2, eduItr.next()));
        details.add(new DetailDTO("Teaching", "VBScript", 6, eduItr.next()));
        details.add(new DetailDTO("Music Production", "Delphi", 4, eduItr.next()));
    }

    @Override
    public Set<DetailDTO> findAll() {
        return details;
    }
}

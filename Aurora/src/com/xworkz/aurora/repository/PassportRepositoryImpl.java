package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.CountryDTO;
import com.xworkz.aurora.dto.PassportDTO;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PassportRepositoryImpl implements PassportRepository {

    private final Set<PassportDTO> passports = new HashSet<>();

    public PassportRepositoryImpl(CountryRepository countryRepository) {
        Iterator<CountryDTO> iterator = countryRepository.findAll().iterator();

        passports.add(new PassportDTO("P1234567", "2015-01-10", "2025-01-10", iterator.next()));
        passports.add(new PassportDTO("P2345678", "2016-03-15", "2026-03-15", iterator.next()));
        passports.add(new PassportDTO("P3456789", "2014-06-20", "2024-06-20", iterator.next()));
        passports.add(new PassportDTO("P4567890", "2017-09-05", "2027-09-05", iterator.next()));
        passports.add(new PassportDTO("P5678901", "2018-11-30", "2028-11-30", iterator.next()));
        passports.add(new PassportDTO("P6789012", "2013-04-25", "2023-04-25", iterator.next()));
        passports.add(new PassportDTO("P7890123", "2019-07-10", "2029-07-10", iterator.next()));
        passports.add(new PassportDTO("P8901234", "2015-02-18", "2025-02-18", iterator.next()));
        passports.add(new PassportDTO("P9012345", "2016-10-01", "2026-10-01", iterator.next()));
        passports.add(new PassportDTO("P0123456", "2017-12-22", "2027-12-22", iterator.next()));

        passports.add(new PassportDTO("P1111111", "2018-05-14", "2028-05-14", iterator.next()));
        passports.add(new PassportDTO("P2222222", "2014-08-08", "2024-08-08", iterator.next()));
        passports.add(new PassportDTO("P3333333", "2015-03-29", "2025-03-29", iterator.next()));
        passports.add(new PassportDTO("P4444444", "2016-06-17", "2026-06-17", iterator.next()));
        passports.add(new PassportDTO("P5555555", "2017-09-21", "2027-09-21", iterator.next()));
        passports.add(new PassportDTO("P6666666", "2018-01-05", "2028-01-05", iterator.next()));
        passports.add(new PassportDTO("P7777777", "2019-04-30", "2029-04-30", iterator.next()));
        passports.add(new PassportDTO("P8888888", "2013-07-19", "2023-07-19", iterator.next()));
        passports.add(new PassportDTO("P9999999", "2014-11-11", "2024-11-11", iterator.next()));
        passports.add(new PassportDTO("P0000000", "2015-12-25", "2025-12-25", iterator.next()));

        passports.add(new PassportDTO("P1472583", "2016-08-01", "2026-08-01", iterator.next()));
        passports.add(new PassportDTO("P2583691", "2017-10-12", "2027-10-12", iterator.next()));
        passports.add(new PassportDTO("P3692581", "2018-03-03", "2028-03-03", iterator.next()));
        passports.add(new PassportDTO("P1239874", "2019-06-06", "2029-06-06", iterator.next()));
        passports.add(new PassportDTO("P3216547", "2020-09-09", "2030-09-09", iterator.next()));
        passports.add(new PassportDTO("P6543217", "2013-01-30", "2023-01-30", iterator.next()));
        passports.add(new PassportDTO("P9876543", "2014-04-14", "2024-04-14", iterator.next()));
        passports.add(new PassportDTO("P4567891", "2015-07-07", "2025-07-07", iterator.next()));
        passports.add(new PassportDTO("P8529637", "2016-12-12", "2026-12-12", iterator.next()));
        passports.add(new PassportDTO("P7418529", "2017-02-02", "2027-02-02", iterator.next()));
    }

    @Override
    public Set<PassportDTO> findAll() {
        return passports;
    }
}

package com.xworkz.applications.repository;

import com.xworkz.applications.dto.ApplicationDto;
import com.xworkz.applications.dto.ApplicationType;
import com.xworkz.applications.dto.ApplicationVersion;
import com.xworkz.applications.dto.OwnerDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplicationRepositoryImpl implements ApplicationRepository{
    @Override
    public List<ApplicationDto> findAll() {
        List<ApplicationDto> list = new ArrayList<>();
        ApplicationDto dto1 = new ApplicationDto("ShopEase", ApplicationVersion.RELEASE, LocalDate.of(2022, 1, 5), 25.5, ApplicationType.WEB, true, 0.0, Arrays.asList(new OwnerDto("Ravi Kumar", "ravi@example.com", 9876543210L)));
        ApplicationDto dto2 = new ApplicationDto("NoteBuddy", ApplicationVersion.BETA, LocalDate.of(2021, 4, 10), 12.8, ApplicationType.DESKTOP, false, 150.0, Arrays.asList(new OwnerDto("Priya Singh", "priya.singh@example.com", 9123456780L)));
        ApplicationDto dto3 = new ApplicationDto("FitTrack", ApplicationVersion.MAINTENANCE, LocalDate.of(2023, 3, 22), 18.2, ApplicationType.MOBILE, true, 0.0, Arrays.asList(new OwnerDto("Arjun Rao", "arjun@example.com", 9988776655L)));
        ApplicationDto dto4 = new ApplicationDto("EduCraft", ApplicationVersion.RELEASE, LocalDate.of(2020, 10, 12), 35.7, ApplicationType.WEB, false, 99.99, Arrays.asList(new OwnerDto("Divya Mehta", "divya.m@example.com", 9012345678L)));
        ApplicationDto dto5 = new ApplicationDto("CodeWiz", ApplicationVersion.ALPHA, LocalDate.of(2024, 2, 18), 42.0, ApplicationType.DESKTOP, true, 0.0, Arrays.asList(new OwnerDto("Karthik Dev", "karthik@example.com", 9812345678L)));
        ApplicationDto dto6 = new ApplicationDto("BudgetPal", ApplicationVersion.BETA, LocalDate.of(2022, 5, 1), 22.1, ApplicationType.MOBILE, false, 49.99, Arrays.asList(new OwnerDto("Sneha R", "sneha.r@example.com", 9876512345L)));
        ApplicationDto dto7 = new ApplicationDto("QuickDocs", ApplicationVersion.ALPHA, LocalDate.of(2023, 6, 14), 10.5, ApplicationType.WEB, true, 0.0, Arrays.asList(new OwnerDto("Rahul Jain", "rahul.j@example.com", 9567891234L)));
        ApplicationDto dto8 = new ApplicationDto("DailyPlanner", ApplicationVersion.MAINTENANCE, LocalDate.of(2021, 9, 19), 16.9, ApplicationType.DESKTOP, false, 129.0, Arrays.asList(new OwnerDto("Neha S", "neha.s@example.com", 9345678912L)));
        ApplicationDto dto9 = new ApplicationDto("MedAssist", ApplicationVersion.BETA, LocalDate.of(2022, 8, 7), 20.3, ApplicationType.MOBILE, true, 0.0, Arrays.asList(new OwnerDto("Dr. Singh", "dr.singh@example.com", 9988123456L)));
        ApplicationDto dto10 = new ApplicationDto("TravelTrek", ApplicationVersion.RELEASE, LocalDate.of(2024, 1, 25), 30.0, ApplicationType.WEB, false, 75.0, Arrays.asList(new OwnerDto("Aditi M", "aditi.m@example.com", 9198765432L)));
        ApplicationDto dto11 = new ApplicationDto("TimeMaster", ApplicationVersion.MAINTENANCE, LocalDate.of(2023, 3, 15), 25.0, ApplicationType.DESKTOP, false, 60.0, Arrays.asList(new OwnerDto("Rohit Sharma", "rohit.s@example.com", 9011223344L)));
        ApplicationDto dto12 = new ApplicationDto("QuizUp", ApplicationVersion.ALPHA, LocalDate.of(2022, 5, 25), 19.4, ApplicationType.WEB, true, 0.0, Arrays.asList(new OwnerDto("Meera Das", "meera.d@example.com", 9022446688L)));
        ApplicationDto dto13 = new ApplicationDto("StudySphere", ApplicationVersion.BETA, LocalDate.of(2021, 8, 12), 28.9, ApplicationType.MOBILE, false, 70.5, Arrays.asList(new OwnerDto("Sanjay Verma", "sanjay.v@example.com", 9033221100L)));
        ApplicationDto dto14 = new ApplicationDto("EventEase", ApplicationVersion.RELEASE, LocalDate.of(2023, 2, 2), 30.7, ApplicationType.DESKTOP, true, 0.0, Arrays.asList(new OwnerDto("Rekha N", "rekha.n@example.com", 9044667788L)));
        ApplicationDto dto15 = new ApplicationDto("SnapSketch", ApplicationVersion.BETA, LocalDate.of(2024, 4, 4), 31.8, ApplicationType.MOBILE, false, 55.0, Arrays.asList(new OwnerDto("Imran Shaikh", "imran.s@example.com", 9055778899L)));
        ApplicationDto dto16 = new ApplicationDto("DietWise", ApplicationVersion.MAINTENANCE, LocalDate.of(2021, 6, 18), 22.5, ApplicationType.WEB, false, 59.0, Arrays.asList(new OwnerDto("Anita P", "anita.p@example.com", 9066889900L)));
        ApplicationDto dto17 = new ApplicationDto("GameCraft", ApplicationVersion.RELEASE, LocalDate.of(2022, 2, 9), 45.0, ApplicationType.DESKTOP, true, 0.0, Arrays.asList(new OwnerDto("Vinay G", "vinay.g@example.com", 9077990011L)));
        ApplicationDto dto18 = new ApplicationDto("YogaTune", ApplicationVersion.BETA, LocalDate.of(2023, 5, 11), 15.2, ApplicationType.MOBILE, false, 89.99, Arrays.asList(new OwnerDto("Kavya S", "kavya.s@example.com", 9088001122L)));
        ApplicationDto dto19 = new ApplicationDto("MindMapr", ApplicationVersion.ALPHA, LocalDate.of(2020, 9, 30), 13.8, ApplicationType.WEB, true, 0.0, Arrays.asList(new OwnerDto("Manoj T", "manoj.t@example.com", 9099112233L)));
        ApplicationDto dto20 = new ApplicationDto("GroceryGo", ApplicationVersion.RELEASE, LocalDate.of(2023, 7, 20), 36.0, ApplicationType.MOBILE, true, 0.0, Arrays.asList(new OwnerDto("Lakshmi R", "lakshmi.r@example.com", 9111223344L)));
        ApplicationDto dto21 = new ApplicationDto("FlashNote", ApplicationVersion.BETA, LocalDate.of(2022, 8, 1), 20.0, ApplicationType.DESKTOP, false, 80.0, Arrays.asList(new OwnerDto("Varun Iyer", "varun.iyer@example.com", 9123001122L)));
        ApplicationDto dto22 = new ApplicationDto("CalmSleep", ApplicationVersion.MAINTENANCE, LocalDate.of(2023, 12, 5), 18.6, ApplicationType.MOBILE, true, 0.0, Arrays.asList(new OwnerDto("Shruti P", "shruti.p@example.com", 9234002211L)));
        ApplicationDto dto23 = new ApplicationDto("FocusTime", ApplicationVersion.RELEASE, LocalDate.of(2021, 10, 15), 28.2, ApplicationType.WEB, false, 65.0, Arrays.asList(new OwnerDto("Jay Mehta", "jay.mehta@example.com", 9345003322L)));
        ApplicationDto dto24 = new ApplicationDto("ArtLab", ApplicationVersion.ALPHA, LocalDate.of(2022, 7, 25), 29.3, ApplicationType.DESKTOP, true, 0.0, Arrays.asList(new OwnerDto("Tanya Shah", "tanya.shah@example.com", 9456004433L)));
        ApplicationDto dto25 = new ApplicationDto("PocketDiary", ApplicationVersion.BETA, LocalDate.of(2024, 1, 10), 17.0, ApplicationType.MOBILE, false, 39.0, Arrays.asList(new OwnerDto("Aditya Rao", "aditya.rao@example.com", 9567005544L)));
        ApplicationDto dto26 = new ApplicationDto("NewsPulse", ApplicationVersion.RELEASE, LocalDate.of(2023, 11, 3), 23.8, ApplicationType.WEB, true, 0.0, Arrays.asList(new OwnerDto("Reena Joseph", "reena.j@example.com", 9678006655L)));
        ApplicationDto dto27 = new ApplicationDto("CryptoCalc", ApplicationVersion.MAINTENANCE, LocalDate.of(2022, 2, 20), 32.1, ApplicationType.DESKTOP, false, 109.99, Arrays.asList(new OwnerDto("Rakesh Nair", "rakesh.nair@example.com", 9789007766L)));
        ApplicationDto dto28 = new ApplicationDto("LangLearn", ApplicationVersion.ALPHA, LocalDate.of(2021, 3, 5), 27.6, ApplicationType.MOBILE, true, 0.0, Arrays.asList(new OwnerDto("Vani B", "vani.b@example.com", 9890008877L)));
        ApplicationDto dto29 = new ApplicationDto("MoodTracker", ApplicationVersion.BETA, LocalDate.of(2023, 6, 14), 21.9, ApplicationType.WEB, false, 49.5, Arrays.asList(new OwnerDto("Raghav K", "raghav.k@example.com", 9001119988L)));
        ApplicationDto dto30 = new ApplicationDto("VoiceVault", ApplicationVersion.RELEASE, LocalDate.of(2020, 9, 28), 33.7, ApplicationType.MOBILE, false, 99.99, Arrays.asList(new OwnerDto("Devika I", "devika.i@example.com", 9112220099L)));
        ApplicationDto dto31 = new ApplicationDto("StudyBot", ApplicationVersion.ALPHA, LocalDate.of(2022, 11, 6), 14.3, ApplicationType.WEB, true, 0.0, Arrays.asList(new OwnerDto("Uday V", "uday.v@example.com", 9223331100L)));
        ApplicationDto dto32 = new ApplicationDto("DreamHouse", ApplicationVersion.MAINTENANCE, LocalDate.of(2021, 5, 8), 40.5, ApplicationType.DESKTOP, true, 0.0, Arrays.asList(new OwnerDto("Maya G", "maya.g@example.com", 9334442211L)));
        ApplicationDto dto33 = new ApplicationDto("ClimaCast", ApplicationVersion.BETA, LocalDate.of(2023, 1, 1), 19.2, ApplicationType.MOBILE, false, 59.0, Arrays.asList(new OwnerDto("Zaid A", "zaid.a@example.com", 9445553322L)));
        ApplicationDto dto34 = new ApplicationDto("BillTrackr", ApplicationVersion.RELEASE, LocalDate.of(2022, 12, 15), 24.4, ApplicationType.WEB, true, 0.0, Arrays.asList(new OwnerDto("Ayesha K", "ayesha.k@example.com", 9556664433L)));
        ApplicationDto dto35 = new ApplicationDto("MindMirror", ApplicationVersion.ALPHA, LocalDate.of(2024, 2, 2), 35.0, ApplicationType.DESKTOP, false, 88.0, Arrays.asList(new OwnerDto("Farhan Q", "farhan.q@example.com", 9667775544L)));
        ApplicationDto dto36 = new ApplicationDto("Skedulr", ApplicationVersion.BETA, LocalDate.of(2021, 10, 23), 13.9, ApplicationType.MOBILE, false, 79.0, Arrays.asList(new OwnerDto("Ritika M", "ritika.m@example.com", 9778886655L)));
        ApplicationDto dto37 = new ApplicationDto("PlantBuddy", ApplicationVersion.MAINTENANCE, LocalDate.of(2022, 6, 18), 26.0, ApplicationType.WEB, true, 0.0, Arrays.asList(new OwnerDto("Yogesh R", "yogesh.r@example.com", 9889997766L)));
        ApplicationDto dto38 = new ApplicationDto("DesignDeck", ApplicationVersion.RELEASE, LocalDate.of(2023, 3, 12), 41.3, ApplicationType.DESKTOP, true, 0.0, Arrays.asList(new OwnerDto("Ishita D", "ishita.d@example.com", 9001112233L)));
        ApplicationDto dto39 = new ApplicationDto("VidClass", ApplicationVersion.ALPHA, LocalDate.of(2021, 11, 19), 38.5, ApplicationType.MOBILE, false, 119.0, Arrays.asList(new OwnerDto("Aman K", "aman.k@example.com", 9112223344L)));
        ApplicationDto dto40 = new ApplicationDto("CookEase", ApplicationVersion.BETA, LocalDate.of(2020, 8, 30), 22.2, ApplicationType.WEB, false, 44.0, Arrays.asList(new OwnerDto("Bhavna T", "bhavna.t@example.com", 9223334455L)));
        ApplicationDto dto41 = new ApplicationDto("TimeSync", ApplicationVersion.MAINTENANCE, LocalDate.of(2022, 3, 15), 16.1, ApplicationType.DESKTOP, true, 0.0, Arrays.asList(new OwnerDto("Suresh M", "suresh.m@example.com", 9334445566L)));
        ApplicationDto dto42 = new ApplicationDto("PetLog", ApplicationVersion.RELEASE, LocalDate.of(2023, 5, 17), 20.6, ApplicationType.MOBILE, false, 55.5, Arrays.asList(new OwnerDto("Meenal C", "meenal.c@example.com", 9445556677L)));
        ApplicationDto dto43 = new ApplicationDto("SpeechEase", ApplicationVersion.BETA, LocalDate.of(2021, 9, 9), 31.4, ApplicationType.WEB, true, 0.0, Arrays.asList(new OwnerDto("Arvind B", "arvind.b@example.com", 9556667788L)));
        ApplicationDto dto44 = new ApplicationDto("CraftBox", ApplicationVersion.ALPHA, LocalDate.of(2022, 10, 11), 23.3, ApplicationType.DESKTOP, false, 64.0, Arrays.asList(new OwnerDto("Neelima A", "neelima.a@example.com", 9667778899L)));
        ApplicationDto dto45 = new ApplicationDto("Moodify", ApplicationVersion.RELEASE, LocalDate.of(2020, 12, 12), 19.5, ApplicationType.MOBILE, true, 0.0, Arrays.asList(new OwnerDto("Deepak L", "deepak.l@example.com", 9778889900L)));
        ApplicationDto dto46 = new ApplicationDto("SkillMap", ApplicationVersion.MAINTENANCE, LocalDate.of(2023, 4, 4), 36.8, ApplicationType.WEB, false, 69.99, Arrays.asList(new OwnerDto("Kamala J", "kamala.j@example.com", 9889990011L)));
        ApplicationDto dto47 = new ApplicationDto("Quizzy", ApplicationVersion.BETA, LocalDate.of(2022, 7, 7), 18.7, ApplicationType.DESKTOP, false, 72.0, Arrays.asList(new OwnerDto("Sahil R", "sahil.r@example.com", 9001111122L)));
        ApplicationDto dto48 = new ApplicationDto("AutoDiary", ApplicationVersion.RELEASE, LocalDate.of(2023, 8, 8), 28.5, ApplicationType.MOBILE, true, 0.0, Arrays.asList(new OwnerDto("Karishma P", "karishma.p@example.com", 9112222233L)));
        ApplicationDto dto49 = new ApplicationDto("TrekMate", ApplicationVersion.ALPHA, LocalDate.of(2021, 2, 2), 34.9, ApplicationType.WEB, false, 79.99, Arrays.asList(new OwnerDto("Nikhil S", "nikhil.s@example.com", 9223333344L)));
        ApplicationDto dto50 = new ApplicationDto("FinSnap", ApplicationVersion.MAINTENANCE, LocalDate.of(2022, 1, 1), 27.1, ApplicationType.DESKTOP, false, 89.99, Arrays.asList(new OwnerDto("Harini V", "harini.v@example.com", 9334444455L)));
        list.add(dto1);
        list.add(dto2);
        list.add(dto3);
        list.add(dto4);
        list.add(dto5);
        list.add(dto6);
        list.add(dto7);
        list.add(dto8);
        list.add(dto9);
        list.add(dto10);

        list.add(dto11);
        list.add(dto12);
        list.add(dto13);
        list.add(dto14);
        list.add(dto15);
        list.add(dto16);
        list.add(dto17);
        list.add(dto18);
        list.add(dto19);
        list.add(dto20);

        list.add(dto21);
        list.add(dto22);
        list.add(dto23);
        list.add(dto24);
        list.add(dto25);
        list.add(dto26);
        list.add(dto27);
        list.add(dto28);
        list.add(dto29);
        list.add(dto30);

        list.add(dto31);
        list.add(dto32);
        list.add(dto33);
        list.add(dto34);
        list.add(dto35);
        list.add(dto36);
        list.add(dto37);
        list.add(dto38);
        list.add(dto39);
        list.add(dto40);

        list.add(dto41);
        list.add(dto42);
        list.add(dto43);
        list.add(dto44);
        list.add(dto45);
        list.add(dto46);
        list.add(dto47);
        list.add(dto48);
        list.add(dto49);
        list.add(dto50);

        return list;
    }
}

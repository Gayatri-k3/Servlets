package com.xworkz.streamexamples.repository;

import com.xworkz.streamexamples.dto.ProductDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;


public class ProductRepositoryImpl implements ProductRepository{
    @Override
    public Collection<ProductDto> findAll() {
        Collection<ProductDto> collection=new ArrayList<>();
        ProductDto dto1 = new ProductDto(1, "Foundation", "Cosmetic", LocalDate.of(2025, 5, 4), "Loreal", 600.0, 70.0, 1, 0);
        ProductDto dto2 = new ProductDto(2, "Shampoo", "Haircare", LocalDate.of(2024, 7, 12), "Dove", 350.0, 120.0, 2, 1);
        ProductDto dto3 = new ProductDto(3, "Lipstick", "Cosmetic", LocalDate.of(2025, 11, 22), "Maybelline", 450.0, 50.0, 3, 0);
        ProductDto dto4 = new ProductDto(4, "Sunscreen", "Skincare", LocalDate.of(2026, 3, 10), "Neutrogena", 799.0, 100.0, 1, 1);
        ProductDto dto5 = new ProductDto(5, "Perfume", "Fragrance", LocalDate.of(2026, 1, 15), "Titan", 999.0, 20.0, 2, 10);
        ProductDto dto6 = new ProductDto(6, "Body Lotion", "Skincare", LocalDate.of(2025, 12, 30), "Vaseline", 499.0, 90.0, 4, 1);
        ProductDto dto7 = new ProductDto(7, "Eyeliner", "Cosmetic", LocalDate.of(2024, 6, 20), "Lakme", 250.0, 30.0, 5, 0);
        ProductDto dto8 = new ProductDto(8, "Hair Oil", "Haircare", LocalDate.of(2025, 9, 1), "Parachute", 120.0, 10.0, 6, 1);
        ProductDto dto9 = new ProductDto(9, "Face Wash", "Skincare", LocalDate.of(2024, 8, 5), "Clean & Clear", 150.0, 15.0, 7, 1);
        ProductDto dto10 = new ProductDto(10, "Deodorant", "Fragrance", LocalDate.of(2025, 3, 3), "Nivea", 220.0, 5.0, 8, 0);
        ProductDto dto11 = new ProductDto(11, "Toner", "Skincare", LocalDate.of(2025, 1, 9), "Biotique", 180.0, 20.0, 2, 0);
        ProductDto dto12 = new ProductDto(12, "Moisturizer", "Skincare", LocalDate.of(2025, 4, 19), "Cetaphil", 330.0, 15.0, 3, 0);
        ProductDto dto13 = new ProductDto(13, "Concealer", "Cosmetic", LocalDate.of(2025, 2, 12), "Colorbar", 620.0, 60.0, 1, 1);
        ProductDto dto14 = new ProductDto(14, "BB Cream", "Cosmetic", LocalDate.of(2024, 11, 27), "Garnier", 300.0, 40.0, 2, 0);
        ProductDto dto15 = new ProductDto(15, "Conditioner", "Haircare", LocalDate.of(2025, 7, 14), "Pantene", 280.0, 25.0, 3, 1);
        ProductDto dto16 = new ProductDto(16, "Face Serum", "Skincare", LocalDate.of(2025, 10, 22), "Olay", 750.0, 100.0, 1, 1);
        ProductDto dto17 = new ProductDto(17, "Mascara", "Cosmetic", LocalDate.of(2025, 9, 9), "Faces", 420.0, 35.0, 2, 0);
        ProductDto dto18 = new ProductDto(18, "Compact Powder", "Cosmetic", LocalDate.of(2024, 10, 10), "Lakme", 290.0, 25.0, 4, 0);
        ProductDto dto19 = new ProductDto(19, "Face Mask", "Skincare", LocalDate.of(2025, 6, 18), "Himalaya", 210.0, 15.0, 6, 0);
        ProductDto dto20 = new ProductDto(20, "Shaving Cream", "Grooming", LocalDate.of(2025, 8, 8), "Gillette", 190.0, 10.0, 5, 4);
        ProductDto dto21 = new ProductDto(21, "After Shave", "Grooming", LocalDate.of(2025, 1, 1), "Gillette", 240.0, 12.0, 3, 3);
        ProductDto dto22 = new ProductDto(22, "Foot Cream", "Skincare", LocalDate.of(2025, 5, 5), "Lotus", 330.0, 18.0, 2, 0);
        ProductDto dto23 = new ProductDto(23, "Hand Wash", "Hygiene", LocalDate.of(2024, 9, 20), "Dettol", 120.0, 10.0, 10, 0);
        ProductDto dto24 = new ProductDto(24, "Toothpaste", "Oralcare", LocalDate.of(2025, 12, 12), "Colgate", 95.0, 5.0, 15, 0);
        ProductDto dto25 = new ProductDto(25, "Mouthwash", "Oralcare", LocalDate.of(2025, 11, 1), "Listerine", 140.0, 8.0, 6, 1);
        ProductDto dto26 = new ProductDto(26, "Hair Gel", "Haircare", LocalDate.of(2025, 2, 22), "Set Wet", 180.0, 20.0, 4, 15);
        ProductDto dto27 = new ProductDto(27, "Makeup Remover", "Skincare", LocalDate.of(2025, 3, 11), "Garnier", 260.0, 25.0, 3, 1);
        ProductDto dto28 = new ProductDto(28, "Beard Oil", "Grooming", LocalDate.of(2025, 4, 2), "Ustraa", 340.0, 30.0, 2, 1);
        ProductDto dto29 = new ProductDto(29, "Hair Color", "Haircare", LocalDate.of(2025, 6, 30), "Godrej", 420.0, 35.0, 5, 1);
        ProductDto dto30 = new ProductDto(30, "Nail Polish", "Cosmetic", LocalDate.of(2025, 8, 18), "Nykaa", 160.0, 10.0, 6, 0);
        ProductDto dto31 = new ProductDto(31, "Shower Gel", "Hygiene", LocalDate.of(2025, 7, 5), "Fiama", 280.0, 20.0, 4, 0);
        ProductDto dto32 = new ProductDto(32, "Sanitizer", "Hygiene", LocalDate.of(2024, 12, 25), "Lifebuoy", 90.0, 5.0, 10, 0);
        ProductDto dto33 = new ProductDto(33, "Kajal", "Cosmetic", LocalDate.of(2025, 10, 10), "Lakme", 210.0, 20.0, 5, 0);
        ProductDto dto34 = new ProductDto(34, "Hair Serum", "Haircare", LocalDate.of(2025, 1, 19), "Streax", 370.0, 35.0, 3, 1);
        ProductDto dto35 = new ProductDto(35, "Face Scrub", "Skincare", LocalDate.of(2025, 5, 28), "Biotique", 260.0, 15.0, 6, 0);
        ProductDto dto36 = new ProductDto(36, "Lip Balm", "Cosmetic", LocalDate.of(2025, 3, 30), "Himalaya", 120.0, 5.0, 10, 0);
        ProductDto dto37 = new ProductDto(37, "Body Scrub", "Skincare", LocalDate.of(2025, 6, 6), "MCaffeine", 499.0, 60.0, 2, 0);
        ProductDto dto38 = new ProductDto(38, "Facial Kit", "Skincare", LocalDate.of(2025, 9, 13), "VLCC", 799.0, 100.0, 1, 1);
        ProductDto dto39 = new ProductDto(39, "Lip Liner", "Cosmetic", LocalDate.of(2025, 2, 14), "Colorbar", 250.0, 20.0, 3, 0);
        ProductDto dto40 = new ProductDto(40, "Hair Straightener", "Electronics", LocalDate.of(2025, 4, 7), "Philips", 1999.0, 150.0, 1, 6);
        ProductDto dto41 = new ProductDto(41, "Epilator", "Electronics", LocalDate.of(2025, 11, 11), "Braun", 2999.0, 200.0, 1, 2);
        ProductDto dto42 = new ProductDto(42, "Electric Toothbrush", "Oralcare", LocalDate.of(2025, 10, 1), "Oral-B", 1599.0, 120.0, 2, 1);
        ProductDto dto43 = new ProductDto(43, "Essential Oil", "Wellness", LocalDate.of(2025, 8, 22), "Soulflower", 999.0, 50.0, 2, 0);
        ProductDto dto44 = new ProductDto(44, "Eye Cream", "Skincare", LocalDate.of(2026, 2, 18), "The Ordinary", 850.0, 70.0, 1, 1);

        collection.add(dto1);
        collection.add(dto2);
        collection.add(dto3);
        collection.add(dto4);
        collection.add(dto5);
        collection.add(dto6);
        collection.add(dto7);
        collection.add(dto8);
        collection.add(dto9);
        collection.add(dto10);
        collection.add(dto11);
        collection.add(dto12);
        collection.add(dto13);
        collection.add(dto14);
        collection.add(dto15);
        collection.add(dto16);
        collection.add(dto17);
        collection.add(dto18);
        collection.add(dto19);
        collection.add(dto20);
        collection.add(dto21);
        collection.add(dto22);
        collection.add(dto23);
        collection.add(dto24);
        collection.add(dto25);
        collection.add(dto26);
        collection.add(dto27);
        collection.add(dto28);
        collection.add(dto29);
        collection.add(dto30);
        collection.add(dto31);
        collection.add(dto32);
        collection.add(dto33);
        collection.add(dto34);
        collection.add(dto35);
        collection.add(dto36);
        collection.add(dto37);
        collection.add(dto38);
        collection.add(dto39);
        collection.add(dto40);
        collection.add(dto41);
        collection.add(dto42);
        collection.add(dto43);
        collection.add(dto44);


        return collection;
    }
}

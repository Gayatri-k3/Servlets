package com.xworkz.petrichor.dto;

import com.xworkz.petrichor.service.FeedbackService;
import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class FeedbackDto {

    private String name;
    private String type;
    private Integer rollno;
    private String staffName;
    private String msg;

}
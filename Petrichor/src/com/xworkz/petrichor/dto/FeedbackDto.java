package com.xworkz.petrichor.dto;

import com.xworkz.petrichor.service.FeedbackService;

public class FeedbackDto {
    public FeedbackDto(){
        System.out.println("running no-arg const of dto");
    }
    private String name;
    private String type;
    private Integer rollno;
    private String staffName;
    private String msg;

    public void setName(String name) {
        this.name = name;
    }


    public String getType() { return type; }
    public void setType(String type) { this.type = type; }


    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public String getCourse() {
        return type;
    }

    public String getMsg() {
        return msg;
    }

    public String getStaffName() {
        return staffName;
    }
}

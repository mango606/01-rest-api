package com.example.restapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
    어노테이션 사용으로 반복 작업 제거
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookQueryParam {

    // Query Param에서는 Camel Case로 가는 것이 편함. 변수명을 바꿔서 자바 컨벤션을 어기지 않음.
    private String category;
    private String issuedYeer;
    private String issuedMonth;
    private String issuedDay;

//    public BookQueryParam() {
//
//    }
//
//    public BookQueryParam(String category, String issuedYeer, String issuedMonth, String issuedDay) {
//        this.category = category;
//        this.issuedYeer = issuedYeer;
//        this.issuedMonth = issuedMonth;
//        this.issuedDay = issuedDay;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//    public String getIssuedYeer() {
//        return issuedYeer;
//    }
//
//    public void setIssuedYeer(String issuedYeer) {
//        this.issuedYeer = issuedYeer;
//    }
//
//    public String getIssuedMonth() {
//        return issuedMonth;
//    }
//
//    public void setIssuedMonth(String issuedMonth) {
//        this.issuedMonth = issuedMonth;
//    }
//
//    public String getIssuedDay() {
//        return issuedDay;
//    }
//
//    public void setIssuedDay(String issuedDay) {
//        this.issuedDay = issuedDay;
//    }
}

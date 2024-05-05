package com.sudynoor.springdemo.mvc.validationdemo;

import com.sudynoor.springdemo.mvc.validationdemo.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName = "";

    @NotNull(message = "is required")
    @Min(value = 0,message = "must be greater than zero")
    @Max(value = 10, message = "must be less than 10")
    private Integer freePasses;
    // we wrapped freePasses via this coding we wont get errors
    // cause if freePasses field is blank or has spaces
    // they'll actually trim it  to null using string trimmer editor
    // that we've added before

    @Pattern(regexp ="^[a-zA-z0-9]{5}" , message = "only 5 chars/digits")
    private String postalCode;

    @CourseCode
    private String courseCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }


    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}

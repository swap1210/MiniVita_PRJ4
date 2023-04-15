/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;

/**
 *
 * @author swapn
 */
public class Course implements Serializable{
    // Attributes of the UniversityCourse class
    private String courseCode;
    private String courseName;
    private int creditHours;
    private String department;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Course objToCompare = (Course) obj;
        return (this.courseCode.equals(objToCompare.courseCode) 
          && this.courseName.equals(objToCompare.courseName)
          && this.department.equals(objToCompare.department))
                && this.creditHours == objToCompare.creditHours;
    }

    @Override
    public int hashCode() {
        return this.department.hashCode()*this.courseName.hashCode()*this.courseCode.hashCode()*this.creditHours; 
    }

    
    public Course(String courseCode, String courseName, int creditHours, String department) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.department = department;
    }
    
    // Getters and setters for the attributes of the UniversityCourse class
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

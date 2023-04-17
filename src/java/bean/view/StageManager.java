/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package bean.view;

import bean.CourseController;
import bean.FacultyController;
import common.MiniVitaStore;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.ManagedProperty;
import jakarta.faces.bean.RequestScoped;
import models.Faculty;

/**
 *
 * @author swapn
 */
@ManagedBean
@RequestScoped
public class StageManager {

    @ManagedProperty(value="#{miniVitaStore}")
    private MiniVitaStore miniVitaStore;
    @ManagedProperty(value="#{facultyController}")
    private FacultyController facultyController;
    @ManagedProperty(value="#{courseController}")
    private CourseController courseController;
    /**
     * Creates a new instance of StageManager
     */
    public StageManager() {
    }
    
    public String openNewFaculty(){
        facultyController.setFaculty(new Faculty());
        return "faculty/newFaculty.xhtml";
    }
    public String openFaculty(int facultyHash){
        facultyController.setFaculty(miniVitaStore.getFaculty(facultyHash));
        return "faculty/faculty.xhtml";
    }
    public String openCourse(int courseHash){
        courseController.setCourse(facultyController.getFaculty().getCourses(courseHash));
        return "course/course.xhtml";
    }

    public CourseController getCourseController() {
        return courseController;
    }

    public void setCourseController(CourseController courseController) {
        this.courseController = courseController;
    }

    public FacultyController getFacultyController() {
        return facultyController;
    }

    public void setFacultyController(FacultyController facultyController) {
        this.facultyController = facultyController;
    }
    
    public MiniVitaStore getMiniVitaStore() {
        return miniVitaStore;
    }

    public void setMiniVitaStore(MiniVitaStore miniVitaStore) {
        this.miniVitaStore = miniVitaStore;
    }
}

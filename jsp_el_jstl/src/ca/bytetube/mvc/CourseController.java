package ca.bytetube.mvc;

public class CourseController {

    private Course courseModel;
    private CourseView courseView;

    public CourseController() {
    }

    public CourseController(Course courseModel, CourseView courseView) {
        this.courseModel = courseModel;
        this.courseView = courseView;
    }

    public void setCourseName(String name){
        courseModel.setCourseName(name);
    }

    public String getCourseName(){
       return courseModel.getCourseName();
    }


    public void setCourseId(String id){
        courseModel.setCourseId(id);
    }

    public String getCourseId(){
        return courseModel.getCourseId();
    }

    public void setCourseCategory(String category){
        courseModel.setCourseCategory(category);
    }

    public String getCourseCategory(){
        return courseModel.getCourseCategory();
    }

    public void updateView(){
        courseView.printCourseDetails(courseModel.getCourseName(),courseModel.getCourseId(),courseModel.getCourseCategory());
    }



}

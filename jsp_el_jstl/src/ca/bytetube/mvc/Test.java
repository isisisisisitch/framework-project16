package ca.bytetube.mvc;

public class Test {
    public static void main(String[] args) {
        Course model = getCourseData();
        CourseView view = new CourseView();
        CourseController controller = new CourseController(model,view);
        controller.updateView();
        System.out.println("============================");
        //update model data
        controller.setCourseName("python");
        controller.setCourseId("02");
        controller.updateView();

    }



    public static Course getCourseData(){
        Course course = new Course();
        course.setCourseName("java");
        course.setCourseId("01");
        course.setCourseCategory("programming");

        return course;
    }
}

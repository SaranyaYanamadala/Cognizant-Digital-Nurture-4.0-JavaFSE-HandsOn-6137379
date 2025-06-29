public class TestClass {
    public static void main(String[] args) {
        Student student_model = new Student();
        student_model.setName("Devi Saranya");
        student_model.setID(6137379);
        student_model.setGrade("A");
        StudentView student_view = new StudentView();
        StudentController student_controller = new StudentController(student_model, student_view);

        student_controller.updateView();

        student_controller.setStudentName("Saranya");
        student_controller.updateView();
    }
}

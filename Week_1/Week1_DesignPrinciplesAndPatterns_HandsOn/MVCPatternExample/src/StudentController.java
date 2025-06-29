public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public void setStudentID(int id) {
        model.setID(id);
    }

    public void setStudentGrade(String grade) {
        model.setGrade(grade);
    }

    public void getStudentName() {
        model.getName();
    }

    public void getStudentID() {
        model.getID();
    }

    public void getStudentGrade() {
        model.getGrade();
    }

    public void updateView() {
        view.displayStudentDetails(model.name, model.id, model.grade);
    }
}

package controller;

import dao.IStudentDAO;
import dao.StudentDAO;
import model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "StudentServlet" , urlPatterns = "/students")
public class StudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private IStudentDAO studentDAO;

    public void init() {
        studentDAO =  new StudentDAO();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    insertStudent(request, response);
                    break;
                case "edit":
                    updateStudent(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action ="";
        }
        try {
            switch (action){
                case "create":
                    showNewForm(request, response);
                    break;
                case "edit":
                    showEditForm(request, response);
                    break;
                case "delete":
                    deleteStudent(request, response);
                    break;
                default:
                    listStudent(request, response);
                    break;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void listStudent(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Student> listUser = studentDAO.selectAllStudents();
        request.setAttribute("listStudent", listUser);
        RequestDispatcher dispatcher = request.getRequestDispatcher("student/list.jsp");
        dispatcher.forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("student/create.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Student existingStudent = studentDAO.selectStudent(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("student/edit.jsp");
        request.setAttribute("student", existingStudent);
        dispatcher.forward(request, response);
    }

    private void insertStudent(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {

        String name = request.getParameter("name");
        String date = request.getParameter("email");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String classHv = request.getParameter("classHv");

        Student newStudent = new Student(name, date, address, phone, email, classHv);
        studentDAO.insertStudent(newStudent);
        RequestDispatcher dispatcher = request.getRequestDispatcher("student/create.jsp");
        dispatcher.forward(request, response);
    }

    private void updateStudent(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String date = request.getParameter("date");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String classHv = request.getParameter("classHv");

        Student book = new Student(id, name, date, address,phone,email,classHv );
        studentDAO.updateStudent(book);
        RequestDispatcher dispatcher = request.getRequestDispatcher("student/edit.jsp");
        dispatcher.forward(request, response);
    }

    private void deleteStudent(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        studentDAO.deleteStudent(id);

        List<Student> listStudent = studentDAO.selectAllStudents();
        request.setAttribute("listStudent", listStudent);
        RequestDispatcher dispatcher = request.getRequestDispatcher("student/list.jsp");
        dispatcher.forward(request, response);
    }
}

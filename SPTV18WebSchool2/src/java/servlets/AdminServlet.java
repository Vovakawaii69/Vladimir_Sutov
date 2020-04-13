package servlets;



import entity.Lessons;
import entity.SchoolClasses;
import entity.Students;
import entity.Teachers;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sessions.HistoryFacade;
import sessions.LessonsFacade;
import sessions.SchoolClassesFacade;
import sessions.StudentsFacade;
import sessions.TeachersFacade;

/**
 *
 * @author user
 */
@WebServlet(name = "AdminServlet", urlPatterns = {
    "/listLessons",
    "/addLessons",
    "/listSchoolClasses",
    "/addSchoolClasses",
    "/listStudents",
    "/addStudents",
    "/listTeachers",
    "/addTeachers",
    "/addHistory",
    
})
public class AdminServlet extends HttpServlet {
    @EJB private LessonsFacade lessonsFacade;
    @EJB private SchoolClassesFacade schoolClassesFacade;
    @EJB private StudentsFacade studentsFacade;
    @EJB private TeachersFacade teachersFacade;
    @EJB private HistoryFacade historyFacade;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        switch (request.getServletPath()) {
            case "/listLessons":
                request.getRequestDispatcher("/listLessons.jsp")
                        .forward(request, response);
                break;
            case "/addLessons":
                String nameOfLessons = request.getParameter("nameOfLessons");
                if(nameOfLessons == null || "".equals(nameOfLessons)){
                    request.setAttribute("nameOfLessons",nameOfLessons);
                    request.setAttribute("info", "Заполните все поля!");
                    request.getRequestDispatcher("/listLessons")
                            .forward(request, response);
                }
                Lessons lessons = new Lessons(nameOfLessons
                );
                lessonsFacade.create(lessons);
                request.setAttribute("info", "Предмет \""+lessons.getNameOfLesson()+"\" добавлен в базу");
                request.getRequestDispatcher("/index")
                        .forward(request, response);
                break;
            case "/listSchoolClasses":
                request.getRequestDispatcher("/listSchoolClasses.jsp")
                        .forward(request, response);
                break;
            case "/addSchoolClasses":
                String title = request.getParameter("title");
                
                if(title == null || "".equals(title)){
                    request.setAttribute("firstname",title);
                    
                    request.setAttribute("info", "Заполните все поля!");
                    request.getRequestDispatcher("/listSchoolClasses")
                            .forward(request, response);
                }
                SchoolClasses schoolClasses = new SchoolClasses(title);
                schoolClassesFacade.create(schoolClasses);
                request.setAttribute("info", 
                        "Школьный класс \""+schoolClasses.getTitle()
                                + "\" добавлен в базу"
                );
                request.getRequestDispatcher("/index")
                        .forward(request, response);
                break;
            case "/listStudents":
                request.getRequestDispatcher("/listStudents.jsp")
                        .forward(request, response);
                break;
            case "/addStudents":
                String age = request.getParameter("age");
                String fName = request.getParameter("fName");
                String lName = request.getParameter("lName");
                if(age == null || "".equals(age)
                        || fName == null || "".equals(fName)
                        || lName == null || "".equals(lName)){
                    request.setAttribute("age", age);
                    request.setAttribute("fName", fName);
                    request.setAttribute("lName", lName);
                    request.setAttribute("info", "Заполните все поля!");
                    request.getRequestDispatcher("/addStudents")
                            .forward(request, response);
                }
                Students students = new Students(age, fName, lName);
                studentsFacade.create(students);
                request.setAttribute("info",
                        "Ученик \""+students.getfName()
                        +" "
                        +students.getlName(lName)
                        +" "
                        +students.getAge(age)
                        +"\"добавлен в базу"
                );
                request.getRequestDispatcher("/index")
                        .forward(request, response);
                break;
            case "/listTeachers":
                request.getRequestDispatcher("/listTeachers.jsp")
                        .forward(request, response);
                break;
            case "/addTeachers":
                String Fname = request.getParameter("Fname");
                String Lname = request.getParameter("Lname");
                if(Fname == null || "".equals(Fname)
                        || Lname == null || "".equals(Lname)){
                    request.setAttribute("Fname", Fname);
                    request.setAttribute("Lname", Lname);
                    request.setAttribute("info", "Заполните все поля!");
                    request.getRequestDispatcher("/addTeachers")
                            .forward(request, response);
                }
                Teachers teachers = new Teachers(Fname, Lname);
                teachersFacade.create(teachers);
                request.setAttribute("info",
                        "Учитель \""+teachers.getFname()
                        +" "
                        +teachers.getLname()
                        +"\"добавлен в базу"
                );
                request.getRequestDispatcher("/index")
                        .forward(request, response);
                break;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
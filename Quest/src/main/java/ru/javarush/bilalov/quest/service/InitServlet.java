package ru.javarush.bilalov.quest.service;

import ru.javarush.bilalov.quest.repository.MagicQuestRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet (name = "initServlet", value = "/start")
public class InitServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(true);
        MagicQuestRepository magicQuestRepository = new MagicQuestRepository();

        if (session.getAttribute("allAnswers") == null) {
            session.setAttribute("allAnswers", 1);
            session.setAttribute("quantity", magicQuestRepository.getAnswersQuantity());
            session.setAttribute("endGames", 0);
            session.setAttribute("allAnswersViewed", 0);
        }

        ServletContext servletContext = this.getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(req, resp);
    }
}

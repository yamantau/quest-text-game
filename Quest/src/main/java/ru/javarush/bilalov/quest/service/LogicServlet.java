package ru.javarush.bilalov.quest.service;

import ru.javarush.bilalov.quest.repository.LifeQuestRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "magicQuestGame", value = "/magic-quest")
public class LogicServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        LifeQuestRepository lifeQuestRepository = new LifeQuestRepository();
        int id = Integer.parseInt(req.getParameter("value"));
        HttpSession session = req.getSession(true);

        String allAnswersRaw = session.getAttribute("allAnswers").toString();
        List<Integer> allAnswers = new ArrayList<>();
        String[] s = allAnswersRaw.replaceAll("\\p{P}", "").split(" ");

        for (String item :
                s) {
            try {
                Integer itemInt = Integer.parseInt(String.valueOf(item));
                allAnswers.add(itemInt);
            }catch (Exception e){

            }
        }

        if (!allAnswers.contains(id))
            allAnswers.add(id);

        if ("Финал".equals(lifeQuestRepository.getAnswerById(id).getDescription())){
            int endGames = Integer.parseInt(session.getAttribute("endGames").toString());
            session.setAttribute("endGames", ++endGames);
        }

        session.setAttribute("allAnswers", allAnswers);
        session.setAttribute("allAnswersViewed", allAnswers.size());

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println(lifeQuestRepository.getGsonAnswerById(id));
    }

}

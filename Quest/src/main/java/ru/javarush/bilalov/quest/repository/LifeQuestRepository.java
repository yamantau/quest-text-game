package ru.javarush.bilalov.quest.repository;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ru.javarush.bilalov.quest.entity.Answer;
import ru.javarush.bilalov.quest.entity.Variant;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Scanner;

public class LifeQuestRepository implements Repository{

    String pathToDb = getClass().getResource("/").getPath() + "DataBase.json";

    @Override
    public void createNewAnswer(int id, String description, String text, List<Variant> variants) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Answer answer = new Answer(id, description, text, variants);
        List<Answer> answers = getAllAnswers();

        for (Answer answerIterator:
             answers) {
            if (answerIterator.getId() == id){
                System.out.println("Такой id уже существует");
                return;
            }
        }

        answers.add(answer);

        try (FileWriter fw = new FileWriter(pathToDb)){
            fw.write(gson.toJson(answers));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String getGsonAnswerById(int id){
        Answer answer = getAnswerById(id);
        return new Gson().toJson(answer);
    }

    @Override
    public int getAnswersQuantity() {
        return getAllAnswers().size();
    }

    @Override
    public Answer getAnswerById(int id) {

        List<Answer> answers = getAllAnswers();

        for (Answer answer :
                answers) {
            if (id == answer.getId())
                return answer;
        }

        return null;
    }

    @Override
    public List<Answer> getAllAnswers() {
        Gson gson = new Gson();
        List<Answer> answers = null;
        String rawAnswers = "";

        try(FileReader fr = new FileReader(pathToDb);
            Scanner scanner = new Scanner(fr)){

            while (scanner.hasNext()){
                rawAnswers += scanner.nextLine();
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        //Довольно отвратительно: обратите внимание, как мы определяем тип коллекции. К сожалению, в Java нет способа обойти это.
        Type answerCollectionType =  new TypeToken<List<Answer>>(){}.getType();
        answers = gson.fromJson(rawAnswers, answerCollectionType);

        return answers;
    }

}

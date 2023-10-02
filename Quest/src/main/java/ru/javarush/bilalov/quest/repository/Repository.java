package ru.javarush.bilalov.quest.repository;

import ru.javarush.bilalov.quest.entity.Answer;
import ru.javarush.bilalov.quest.entity.Variant;

import java.util.List;

public interface Repository {

    List<Answer> getAllAnswers();

    Answer getAnswerById(int id);

    void createNewAnswer(int id, String description, String text, List<Variant> variants);

    String getGsonAnswerById(int id);

    int getAnswersQuantity();

}

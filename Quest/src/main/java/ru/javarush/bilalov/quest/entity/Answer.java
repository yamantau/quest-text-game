package ru.javarush.bilalov.quest.entity;

import java.util.List;

public class Answer {
    private int id;
    private String description;
    private String text;
    private List<Variant> variants;

    public Answer(int id, String description, String text, List<Variant> variants) {
        this.id = id;
        this.description = description;
        this.text = text;
        this.variants = variants;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Variant> getVariants() {
        return variants;
    }

    public void setVariants(List<Variant> variants) {
        this.variants = variants;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", text='" + text + '\'' +
                ", variants=" + variants +
                '}';
    }
}

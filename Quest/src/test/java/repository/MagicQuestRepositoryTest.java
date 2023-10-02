package repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.javarush.bilalov.quest.repository.MagicQuestRepository;


import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MagicQuestRepositoryTest {

    MagicQuestRepository magicQuestRepository;

    @BeforeEach
            public void init(){
        magicQuestRepository = new MagicQuestRepository();
    }


    @Test
    public void getAnswerByID(){
        String description =  magicQuestRepository.getAnswerById(1).getDescription();
        assertEquals("Предыстория", description);
    }

    @Test
    public void getAnswersQuantity(){
        int quantity = magicQuestRepository.getAnswersQuantity();
        assertEquals(13, quantity);
    }

}

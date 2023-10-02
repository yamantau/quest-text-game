import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.javarush.bilalov.quest.entity.Answer;
import ru.javarush.bilalov.quest.entity.Variant;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class AnswerTest {

    @Test
    public void getterTest(){

        Variant mockVariant = Mockito.mock(Variant.class);

        Answer answer = new Answer(1, "asd", "asd", List.of(mockVariant));

        assertEquals(1, answer.getId());
        assertEquals("asd", answer.getDescription());
        assertEquals("asd", answer.getText());
        assertEquals(List.of(mockVariant), answer.getVariants());

    }

    @Test
    public void setterTest(){

        Variant oldMockVariant = Mockito.mock(Variant.class);
        Variant newMockVariant = Mockito.mock(Variant.class);
        Answer answer = new Answer(1, "asd", "asd", List.of(oldMockVariant));

        answer.setDescription("dsa");
        answer.setText("dsa");
        answer.setId(2);
        answer.setVariants(List.of(newMockVariant));

        assertEquals(2, answer.getId());
        assertEquals("dsa", answer.getDescription());
        assertEquals("dsa", answer.getText());
        assertEquals(List.of(newMockVariant), answer.getVariants());

    }
}

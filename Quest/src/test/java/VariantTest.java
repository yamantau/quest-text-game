import org.junit.jupiter.api.Test;
import ru.javarush.bilalov.quest.entity.Answer;
import ru.javarush.bilalov.quest.entity.Variant;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VariantTest {

    @Test
    public void getterTest(){
        Variant variant = new Variant(1, "asd");

        assertEquals(1, variant.getId());
        assertEquals("asd", variant.getText());
    }

    @Test
    public void setterTest(){
        Variant variant = new Variant(1, "asd");

        variant.setId(2);
        variant.setText("dsa");

        assertEquals(2, variant.getId());
        assertEquals("dsa", variant.getText());
    }

}

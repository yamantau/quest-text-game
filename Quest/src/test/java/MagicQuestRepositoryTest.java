import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.javarush.bilalov.quest.entity.Variant;
import ru.javarush.bilalov.quest.repository.MagicQuestRepository;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class MagicQuestRepositoryTest {

    private String pathToDb = getClass().getResource("/").getPath() + "DataBase.json";
    @Test
    @Disabled
    public void createNewAnswerTest(){

        Variant firstMockitoVariant = Mockito.mock(Variant.class);
        Variant secondMockitoVariant = Mockito.mock(Variant.class);
//        Mockito.doReturn(1).when(mockitoVariant).getId();

        MagicQuestRepository magicQuestRepository = new MagicQuestRepository();
        magicQuestRepository.createNewAnswer(1, "asd", "asd", List.of(firstMockitoVariant, secondMockitoVariant));

    }

}

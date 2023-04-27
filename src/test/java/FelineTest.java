import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class FelineTest {
    String animalKind;
    List<String>expectedResult;
    public FelineTest(String animalKind, List<String>expectedResult){
        this.animalKind = animalKind;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][]getAnimalKind(){
        return new Object[][]{
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Травоядное", List.of("Трава", "Различные растения")}

        };
    }

    @Test
    public void getFoodTest() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals(expectedResult, feline.getFood(animalKind));
    }
}

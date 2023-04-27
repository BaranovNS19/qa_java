import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class Lion2Test {
    @Mock
    Feline feline;

    @Test
    public void getKittensTest(){
        Lion lion = new Lion(feline);
        Mockito.when(feline.getKittens()).thenReturn(3);
        int expected = 3;
        Assert.assertEquals(expected, lion.getKittens());
    }

    @Test
    public void getFoodLionTest() throws Exception {
        try {
            Lion lion = new Lion(feline);
            Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            List<String> expected = List.of("Животные", "Птицы", "Рыба");
            Assert.assertEquals(expected, lion.getFood());
        }catch (Exception exception){
            System.out.println("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }


}

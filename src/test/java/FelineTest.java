import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test
    public void eatMeatIsTrue() throws Exception {
        Feline feline = new Feline();
         List<String>expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, feline.eatMeat());
    }
    @Test
    public void getFamilyFeline(){
        Feline feline = new Feline();
        String expected = "Кошачьи";
        Assert.assertEquals(expected, feline.getFamily());
    }

    @Mock
    Feline feline = new Feline();
    @Test
    public void getFoodParameter() throws Exception {
        feline.getFood("Хищник");
        Mockito.verify(feline).getFood("Хищник");
    }

    @Spy
    Feline felineSpy = new Feline();

    @Test
    public void getCountKittens(){
        int expected = 1;
        Assert.assertEquals(expected, felineSpy.getKittens(1));
        Assert.assertEquals(expected, felineSpy.getKittens());
    }


}

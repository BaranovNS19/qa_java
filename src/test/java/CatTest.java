import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Test
    public void getSoundCatTest(){
        String expected = "Мяу";
        Cat cat = new Cat(new Feline());
        Assert.assertEquals(expected, cat.getSound());

    }

    @Mock
    Cat cat = new Cat(new Feline());
    @Test
    public void getFoodCatTest() throws Exception {
        Mockito.when(cat.getFood()).thenReturn(Collections.singletonList("Травоядное"));
    }

}

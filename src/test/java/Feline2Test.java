import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Feline2Test {

    @Test
    public void eatMeatFeline() throws Exception {
        Feline feline = new Feline();
        List<String>expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, feline.eatMeat());
    }

    @Test
    public void getFamilyTest(){
        Feline feline = new Feline();
        String expected = "Кошачьи";
        Assert.assertEquals(expected, feline.getFamily());
    }

    @Test
    public void getKittensTest(){
        Feline feline = new Feline();
        int expected = 1;
        Assert.assertEquals(expected, feline.getKittens());

    }
}

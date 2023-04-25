import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.List;

@RunWith(Parameterized.class)
public class LionTest {
    private String sex;
    private boolean expected;

    public LionTest(String sex, boolean expected){
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getSex() throws Exception {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"1234", true}

        };

    }

    @Test
    public void getSexLion() throws Exception {
        Lion lion = new Lion();
        Assert.assertEquals(expected, lion.Lion(sex));
    }

    Lion lion = Mockito.mock(Lion.class);

    @Test
    public void getKittensTest(){
        Mockito.when(lion.getKittens()).thenReturn(1);
    }

    @Test
    public void doesHaveManeTest(){
        Lion lion = new Lion();
        lion.doesHaveMane();
    }
    @Test
    public void eatMeatIsTrue() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, feline.eatMeat());
    }


}

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Feline3Test {
    int expected;
    int kittensCount;
    public Feline3Test(int expected, int kittensCount){
        this.expected = expected;
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters
    public static Object[][]getKittensCount(){
        return new Object[][]{
                {1,1},
                {5,5},
                {8,8}

        };
    }

    @Test
    public void getKittensCountTest(){
        Feline feline = new Feline();
        Assert.assertEquals(expected, feline.getKittens(kittensCount));
    }

}

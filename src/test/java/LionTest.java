import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class LionTest {
    String sexLion;
    boolean expectedResult;

    public LionTest(String sexLion, boolean expectedResult){
        this.sexLion = sexLion;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][]getSex(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}

        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        try {
            Lion lion = new Lion(sexLion);
            Assert.assertEquals(expectedResult, lion.doesHaveMane());
        }catch (Exception exception){
            System.out.println("Используйте допустимые значения пола животного - самец или самка");
        }


    }





}

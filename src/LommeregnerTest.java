import org.junit.Assert;
import org.junit.Test;

public class LommeregnerTest {
    @org.junit.Test
    public void sum() {
        //Arrange
        Lommeregner lommeregner = new Lommeregner();

        //Act
        double result = lommeregner.sum(10,10);

        //Assert
        Assert.assertEquals(20, result,0);

    }

    @org.junit.Test
    public void minus() {
        //Arrange
        Lommeregner lommeregner = new Lommeregner();

        //Act
        double result = lommeregner.minus(10,5);

        //Assert
        Assert.assertEquals(5, result,0);
    }

    @Test
    public void multiplicere() {
        //Arrange
        Lommeregner lommeregner = new Lommeregner();

        //Act
        double result = lommeregner.multiplicere(10,10);

        //Assert
        Assert.assertEquals(100, result,0);
    }

    @Test
    public void division() {
        //Arrange
        Lommeregner lommeregner = new Lommeregner();

        //Act
        double result = lommeregner.division(10,2);

        //Assert
        Assert.assertEquals(5, result,0);
    }

    @Test
    public void secret() {
        //Arrange
        Lommeregner lommeregner = new Lommeregner();

        //Act
        double result = lommeregner.secret();

        //Assert
        Assert.assertEquals(20, result,0);
    }
}

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

        //Secret 1
        //Act
        lommeregner.setSecretOperation(1);
        double result1 = lommeregner.secret(5, 4);

        //Assert
        Assert.assertEquals(9, result1,0);

        //Secret 2
        //Act
        lommeregner.setSecretOperation(2);
        double result2 = lommeregner.secret(5, 4);

        //Assert
        Assert.assertEquals(1, result2,0);

        //Secret 3
        //Act
        lommeregner.setSecretOperation(3);
        double result3 = lommeregner.secret(5, 4);

        //Assert
        Assert.assertEquals(20, result3,0);

        //Secret 4
        //Act
        lommeregner.setSecretOperation(4);
        double result4 = lommeregner.secret(10, 2);

        //Assert
        Assert.assertEquals(5, result4,0);


    }

}

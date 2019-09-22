public class Lommeregner {
    int secretOperation = (int)(Math.random() * (4) + 1);

    public void setSecretOperation(int secretOperation) {
        this.secretOperation = secretOperation;
    }

    public int getSecretOperation() {
        return secretOperation;
    }

    int sum(int a, int b) {
        return a+b;
    }

    int minus(int a, int b) {
        return a-b;


    }
    int multiplicere(int a , int b) {
        return a*b;

    }
    int division(int a, int b) {
        return a/b;

    }

    int secret (int a, int b)  {

        System.out.println(secretOperation);
        switch (secretOperation) {
            case 1:
                sum(a, b);
                return sum(a, b);
            case 2:
                minus(a, b);
                return minus(a, b);
            case 3:
                multiplicere(a, b);
                return multiplicere(a, b);
            case 4:
                division(a, b);
                return division(a, b);
            default:
                return 0;
        }
    }
}

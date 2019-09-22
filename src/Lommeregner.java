public class Lommeregner {
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

        int s = (int)(Math.random() * (4) + 1);
        System.out.println(s);
        switch (s) {
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

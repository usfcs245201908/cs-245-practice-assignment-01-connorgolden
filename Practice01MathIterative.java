import static jdk.nashorn.internal.objects.Global.print;

public class Practice01MathIterative implements Practice01Math {

    @Override
    public int fact(int n) throws Exception {

        if (n < 0){
            throw new IllegalArgumentException("Input Cannot Be Negative");
        }
        //print("hi");
        int fact = 1;
        for (int i=1; i <= n; i++){
           fact*=i;
        }
        return fact;
    }

    @Override
    public int fib(int n) throws Exception {

        //Set start values

        if (n < 0){
            throw new IllegalArgumentException("Input Cannot Be Negative");
        }

        if (n == 0){
            return 0;
        }

        if (n == 1 || n == 2){
            return 1;
        }

        int a = -1;
        int b = 1;

        for (int i = 0; i <= n; i++) {
            //use sum to save the sum so we dont lose a when setting
            int sum = b + a;
            a = b;
            b = sum;
        }

        return b;

    }
}

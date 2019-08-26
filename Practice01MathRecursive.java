public class Practice01MathRecursive implements Practice01Math {


    @Override
    public int fact(int n) throws Exception {

        if (n < 0){
            throw new IllegalArgumentException("Input Cannot Be Negative");
        }

        int factorial;

        if(n<=1){
            return 1;
        }
        factorial = fact(n-1)* n;
        return factorial;
    }

    @Override
    public int fib(int n) throws Exception {
        if (n < 0){
            throw new IllegalArgumentException("Input Cannot Be Negative");
        }

        if (n==0 || n==1){
            return n;
        }

        return fib(n-1)+fib(n-2);
    }
}

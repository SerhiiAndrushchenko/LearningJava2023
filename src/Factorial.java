public class Factorial {
    public long FactorialUsingLoop(int n){
        if (n < 0)
            return 0;

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}

public class Fibonacci {
    public long getFibonacciByIndex(int index) {
        if (index == 0) {
            return 0;
        }
        if (index < 0 || index > 92) {
            throw new IndexOutOfBoundsException();
        }
        var n0 = 0;
        var n1 = 1;
        for (var i =2; i <= index; i++) {
            var n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
        }
        return n1;
    }
}

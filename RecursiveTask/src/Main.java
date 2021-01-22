import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        int n = 10;
        Fibonacci fibonacci = new Fibonacci(n);
        forkJoinPool.execute(fibonacci);
        Long r =  fibonacci.join();









        System.out.println("Fib("+n+"): " +r);


    }


}

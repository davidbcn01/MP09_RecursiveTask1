import java.util.concurrent.RecursiveTask;

public class Fibonacci extends RecursiveTask<Long> {
    public int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    public Long fibRec(){
        if(n<=1) return (long) n;
        Fibonacci f1 = new Fibonacci(n-1);
        Fibonacci f2 =new Fibonacci(n-2);
        f1.fork();
        f2.fork();
        return f1.join() + f2.join();
    }


    public Long fibbonaciIterative(){
        long prev=0, next=1;
        for (int i = 0; i < n; i++) {
            long temp =prev;
            prev=next;
            next=temp + next;
        }
        return prev;
    }

    @Override
    protected Long compute() {
        if (n>8) return fibRec();
        else return fibbonaciIterative();
    }
}

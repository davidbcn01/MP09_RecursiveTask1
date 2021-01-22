import java.util.concurrent.RecursiveTask;

public class MainTask extends RecursiveTask<Integer> {
public int n;
    public MainTask(int n) {
        this.n = n;
    }


  /* public  Long factorialRecursive() {
        MainTask mainTask = new MainTask(n - 1);
        mainTask.fork();
        //if (n <= 1) {

       // } else {
            return mainTask.join() * n;
        }
   //}

*/

    public  Long factorialIterative(){
        Long result=1L;
        int i=1;
        while(i<=n){
            result=result*i;
            i++;
        }

        return result;
    }


    @Override
    protected Integer compute() {
        return null;
    }
}


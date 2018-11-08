package course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test1(){
        System.out.println("123");
        System.out.printf("Thread id: %s%n",Thread.currentThread().getId());
    }
}

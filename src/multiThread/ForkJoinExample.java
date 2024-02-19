package multiThread;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;
    public class ForkJoinExample extends RecursiveTask<Integer> {
        private static final int THRESHOLD = 2; // Adjust the threshold based on the size of the task
        private int[] array;
        private int start;
        private int end;

        public ForkJoinExample(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {
            System.out.println(Thread.currentThread().getName() + " End : " + end + " start: " + start);
            if (end - start <= THRESHOLD) {
                // Perform the computation directly for small tasks
                int sum = 0;
                for (int i = start; i < end; i++) {
                    sum += array[i];
                }
                return sum;
            } else {
                // Split the task into smaller subtasks
                int mid = (start + end) / 2;
                ForkJoinExample leftTask = new ForkJoinExample(array, start, mid);
                ForkJoinExample rightTask = new ForkJoinExample(array, mid, end);

                // Fork the subtasks
                leftTask.fork();
                rightTask.fork();

                // Join and combine the results
                return leftTask.join() + rightTask.join();
            }
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            ForkJoinPool forkJoinPool = new ForkJoinPool();
            int sum = forkJoinPool.invoke(new ForkJoinExample(array, 0, array.length));

            System.out.println("Sum: " + sum);
        }



    }

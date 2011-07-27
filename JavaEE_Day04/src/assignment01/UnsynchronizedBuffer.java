package assignment01;

public class UnsynchronizedBuffer implements Buffer {
    private int buffer = -1;

    public void set(int value) {
        System.err
                .println(Thread.currentThread().getName() + " write " + value);
        buffer = value;
    }

    public int get() {
        System.err.println(Thread.currentThread().getName() + " reads "
                + buffer);
        return buffer;
    }
}

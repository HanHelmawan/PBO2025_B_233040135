
// Tugas 3

package Pertemuan14;

public class Counter {
    static int instanceCount = 0;

    public Counter() {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}

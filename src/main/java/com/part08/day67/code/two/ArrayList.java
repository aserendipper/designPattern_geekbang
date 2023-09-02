package com.part08.day67.code.two;

/**
 * @author aserendipper
 * @date 2023/8/30
 * @desc
 */
public class ArrayList<E> implements List<E> {
    private static final int DEFAULT_CAPACITY = 10;
    
    private int actualSize;
    private int totalSize;
    
    private Object[] elements;
    private long[] addTimestamps;
    private long[] delTimestamps;
    
    public ArrayList() {
        this.actualSize = 0;
        this.totalSize = 0;
        this.elements = new Object[DEFAULT_CAPACITY];
        this.addTimestamps = new long[DEFAULT_CAPACITY];
        this.delTimestamps = new long[DEFAULT_CAPACITY];
    }
    
    @Override
    public void add(E obj) {
        elements[totalSize] = obj;
        addTimestamps[totalSize] = System.currentTimeMillis();
        delTimestamps[totalSize] = Long.MAX_VALUE;
        totalSize++;
        actualSize++;
    }
    
    @Override
    public void remove(E obj) {
        for (int i = 0; i < totalSize; i++) {
            if (elements[i].equals(obj)) {
                delTimestamps[i] = System.currentTimeMillis();
                actualSize--;
            }
        }
    }
    
    public int actualSize() {
        return actualSize;
    }
    
    public int totalSize() {
        return totalSize;
    }
    
    public E get(int index) {
        if (index >= totalSize) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[index];
    }
    
    public long getAddTimestamp(int index) {
        if (index >= totalSize) {
            throw new IndexOutOfBoundsException();
        }
        return addTimestamps[index];
    }
    
    public long getDelTimestamp(int index) {
        if (index >= totalSize) {
            throw new IndexOutOfBoundsException();
        }
        return delTimestamps[index];
    }
}

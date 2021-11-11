package com.sf.exception;

public class OutOfMemory {

    public void createArray(int size) {
        try {
              String[] myArray = new String[size];
        } catch (OutOfMemoryError e) {
            System.err.println("Array size too large");
            System.err.println("Max JVM memory: " + Runtime.getRuntime().maxMemory());
        }
    }

    public static void main(String[] args) {
        OutOfMemory memory = new OutOfMemory();
        memory.createArray(1000 * 1000 * 1000);
    }
}

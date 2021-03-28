package com.GenericsProblems;

public class FindMaxGeneric<T extends Comparable<T>> {

    private final T a;
    private final T b;
    private final T c;

    public FindMaxGeneric(T a, T b, T c) {
        this.a =a;
        this.b = b;
        this.c = c;
    }

    public T findMaximum() {
        return FindMaxGeneric.findMaximum(a, b, c);
    }

    //Single generic method to compare different types of data
    public static <T extends Comparable<T>> T findMaximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
    
    public static void main(String[] args) {
    	System.out.println(findMaximum(10,40,25));
    	System.out.println(findMaximum(1.44,2.332,3.444));
    	System.out.println(findMaximum("Apple","Banana","Peach"));

    }
}
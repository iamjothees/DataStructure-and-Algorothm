public class Sorting {
    static int size=20;
    public static void main(String[] args){
        int[] array = new int[size];
        for(int i=0;i<size ;i++){
            array[i] = (int)(Math.random()*99);
        }

        /* InsertionSort s1 = new InsertionSort();
        s1.sort(array);
        for(int i=0; i<array.length; i++)
            System.out.print(array[i] + " ");

        System.out.println();
        QuickSort s2 = new QuickSort();
        s2.sort(array);
        for(int i=0; i<array.length; i++)
            System.out.print(array[i] + " ");

        System.out.println();
        HeapSort s3 = new HeapSort();
        s3.sort(array);
        for(int i=0; i<array.length; i++)
            System.out.print(array[i] + " "); */

        System.out.println();
        MergeSort s4 = new MergeSort();
        s4.sort(array);
        for(int i=0; i<array.length; i++)
            System.out.print(array[i] + " ");
    }
}
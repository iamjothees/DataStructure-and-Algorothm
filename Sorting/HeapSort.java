public class HeapSort {
    HeapSort(){}
    HeapSort(int[] arr){
        sort(arr, arr.length);
    }
    public void sort(int[] arr){
        sort(arr, arr.length);
    }
    public void sort(int[] arr, int n){
        if (n>0){
            for (int i=1; i<n; i++){
                int c=i;
                maxHeap(arr, c);
            }
            {
                int temp=arr[0];
                arr[0] = arr[n-1];
                arr[n-1] = temp;
            }

            n--;
            sort(arr, n);
        }
    }
    private void maxHeap(int[] arr, int c){
        while (c!=0){
            int root=(c-1)/2;
            if (arr[c]>arr[root]){
                int temp=arr[c];
                arr[c] = arr[root];
                arr[root] = temp;
            }
            c = root;
        }
    }
}

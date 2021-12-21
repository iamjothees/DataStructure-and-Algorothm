public class QuickSort {

    QuickSort(int[] arr){
        sort(arr, 0, (arr.length-1));
    }
    QuickSort(){    }

    public void sort(int[] arr){
        sort(arr, 0, (arr.length-1));
    }
    public void sort(int[] arr, int low, int high){
        if (low<high){
            int pivot=partition(arr, low, high);
            sort(arr, low, pivot-1);
            sort(arr, pivot+1, high);
        }
    }

    private int partition(int[] arr, int low, int high){
        int i=low;
        int pivot=arr[high];
        { 
            int top=high;
            for (int j=low; j<top; j++){
                if (arr[j]<pivot){
                    swap(arr[i], arr[j]);
                    i++;
                }
            }
        }
        swap(arr[high],arr[i]);
        return i;
    }

    private void swap(int x, int y){
        int temp = x;
        x = y; y = temp;
    }
}

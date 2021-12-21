class InsertionSort
{
    InsertionSort(int[] arr){
        sort(arr);
    }
    InsertionSort(){}

    public void sort(int[] arr){
        int arrLength = arr.length;
        for (int i=1; i<arrLength; i++){
            int key=arr[i];
            for (int j=i-1; j>=0; j--){
                if (key>arr[j]){
                    arr[j+1] = key;
                    break;
                }
                else
                    arr[j+1] = arr[j];
            }
        }
    }
}
public class MergeSort{
    MergeSort(){    }

    MergeSort(int[] arr){
        sort(arr ,0 ,(arr.length-1) );
    }

    public void sort(int[] arr){
        sort(arr ,0 ,(arr.length-1) );
    }

    public void sort(int[] arr ,int beg,int end){
        if (beg<end){
            int mid = beg + ((end-beg) / 2);
            sort(arr, beg, mid);
            sort(arr, mid+1, end);
            merge(arr, beg, mid, end);
        }
    }

    private void merge(int[] arr, int beg, int mid, int end){
        int n1=mid-beg+1;
        int n2=end-mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i=0; i<n1; i++){
            leftArr[i] = arr[beg+i];
        }
        for (int i=0; i<n2; i++){
            rightArr[i] = arr[mid+1+i];
        }

        int i=0, j=0, k=beg;
        while (i<n1 && j<n2){
            if (leftArr[i]<=rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }
            else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i<n1){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
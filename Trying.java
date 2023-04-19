public class Trying {

    static void print(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void mergeSort(int arr[], int si, int ei) {
        if(si >= ei) return;

        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= ei) {
            if(arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while(i <= mid) {
            temp[k++] = arr[i++];
        }
        while(j <= si) {
            temp[j++] = arr[j++];
        }
        for(k=0, i=si; k<temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void quickSort(int arr[], int si, int ei) {
        /* base case */

        if(si >= ei) {
            return;
        }
        /* kaam */
        int Idx = partition(arr, si, ei);
        quickSort(arr, si, Idx-1);
        quickSort(arr, Idx+1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        /* creating pivot */
        int pivot = arr[ei];
        /* creating index for transversing */
        int i = si-1;
        /* transversing */
        for(int j=si; j<ei; j++) {
            if(arr[j] <= pivot) {
                i++;
                /* swap */
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        /* setting pivot at right place */
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
     public static void main(String args[]) {

        int arr[] = {6, 3, 9, 5, 2, 8};
        quickSort(arr, 0, arr.length-1);
        print(arr);
    }
}

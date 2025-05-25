import java.util.Arrays;
public class sorting{
    public static void bubblesort(int arr[]){
        for(int t=0;t<arr.length-1;t++){
            for(int j=0;j<arr.length-1-t;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length-1;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0&&arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;}
            int j=0;
            for(int i=0;i<count.length;i++){
                while(count[i]>0){
                    arr[j]=i;
                    j++;
                    count[i]--;
                }
            }
        
    }
    public static void printArr(int arr[]){
     for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
     }
     System.out.println();
    }
public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the size of an array:");
//     int n=sc.nextInt();
// int arr[]=new int[n];
// System.out.println("enter elements of an array:");
// for(int i=0;i<n;i++){
//      arr[i]=sc.nextInt();
// }
// System.out.print("elements in array are:");
// for(int i=0;i<n;i++){
//     System.out.print(arr[i]+" ");
    
// }
// System.out.println();
// bubblesort(arr);

int arr[]={2,3,6,9,4};
// insertionSort(arr);
// selectionsort(arr);
countingSort(arr);
System.out.println("Sorted array are as follows:");
// Arrays.sort(arr,0,3);
printArr(arr);
}
}
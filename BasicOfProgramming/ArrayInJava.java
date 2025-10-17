package BasicOfProgramming;

import java.util.Scanner;

public class ArrayInJava {

    public static void insert(int []arr,int pos,int size,int value){
        if (size>arr.length){
            System.out.println("Array is full. Cannot insert.");
            return;
        }
        if (pos < 0 || pos > size) {
            System.out.println("Invalid position!");
            return;
        }
        // Shift elements to the right
        for (int i = size - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        // Insert new element
        arr[pos] = value;
        System.out.println("Element inserted successfully!");
    }
    public static int delete(int arr[],int pos,int size){
        if (pos < 0 || pos > size) {
            System.out.println("Invalid position!");
            return -1;
        }
        int deleteElement = 0 ;
        for (int i=0;i<size;i++){
            if (arr[i] == pos){
                deleteElement = arr[i];
                arr[i] = 0;
            }
        }
        return deleteElement;
    }
    public static void update(int arr[],int pos,int size,int newValue){
        if (pos < 0 || pos > size){
            return;
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i] == pos){
                arr[i] = newValue;
            }
        }
    }
    public static void printArray(int arr[]){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                continue;
            }
            System.out.print(i+"-->("+arr[i]+"),");
        }
        System.out.print("]");
    }

    public  static void main(String[] args) {
        int arr[] = new int[10];
        int pos =0;
        int value =0;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("\n 1. Insert New Element \n 2. Update The Element \n 3. Delete The Element \n 4. Print Array");
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Enter The Position Which Element Insert  :- ");
                    pos = sc.nextInt();
                    System.out.println("Enter The Value of That Position  :- ");
                    value = sc.nextInt();
                    insert(arr,pos,arr.length-1,value);
                    break;
                case 2:
                    System.out.println("Enter The Position Which Element Update :-");
                    pos = sc.nextInt();
                    System.out.println("Enter The New Value of That Position  :- ");
                    int newValue = sc.nextInt();
                    update(arr,pos,arr.length-1,newValue);
                    break;
                case 3:
                    System.out.println("Enter The Position Which Element Delete :-");
                    pos = sc.nextInt();
                    System.out.println("Deleted Element :- "+delete(arr,pos,arr.length-1)+" pos : "+pos);
                    break;
                case 4:
                    printArray(arr);
            }
        }
    }
}

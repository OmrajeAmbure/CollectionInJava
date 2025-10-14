package ArrayList;

import java.util.Scanner;

public class Array{

        public static void insertStudent(int []arr,int pos,int size,int value){
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
        public static void deleteStudent(){

        }
        public static void updateStudent(){

        }
        public static void removeStudent(){

        }
        public static void printArray(int arr[]){
            for(int i=0;i<arr.length;i++){
                if(arr[i] == 0){
                    continue;
                }
                System.out.println(arr[i]);
            }
        }

    public static void main(String[] args) {
            int arr[] = new int[10];
            int pos;
            int value;
            Scanner sc = new Scanner(System.in);
            while (arr.length != arr.length-1) {
                System.out.println("Enter The Position of new Value (0 to 4) :- ");
                pos = sc.nextInt();
                System.out.println("Enter The new Value :- ");
                value = sc.nextInt();
                insertStudent(arr,pos,5,value);
                printArray(arr);
            }


    }
}


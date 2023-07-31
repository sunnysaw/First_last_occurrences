/*
Question : Given a sorted array arr containing n elements with possibly duplicate elements, the task is to find indexes
           of first and last occurrences of an element x in the given array.
________________________________________________________________________________________________________________________
Example 1:
Input:
n=9, x=5
arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
Output:  2 5
Explanation: First occurrence of 5 is at index 2 and last
             occurrence of 5 is at index 5.
______________________________________________________________________________________________________________________
Example 2:
Input:
n=9, x=7
arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 }
Output:  6 6
___________________________________________________________________________________________________________________
Your Task:
Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code.
You just need to complete the function find() that takes array arr, integer n and integer x as parameters and returns
 the required answer.Note: If the number x is not found in the array just return both index as -1.
_______________________________________________________________________________________________________________________
 Expected Time Complexity: O(logN)
Expected Auxiliary Space: O(1).
____________________________________________________________________________________________________________________
Constraints:
1 ≤ N ≤ 107
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int first_Index = -1 , last_Index = -1;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of array :");
        int length = input.nextInt();

        System.out.println("Enter element inside array :");
        int[] array = new int[length];

        for (int start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }

        System.out.println("Enter the element to get index of it :");
        int target = input.nextInt();

        System.out.println("Printing the result :");
        for (int start = 0; start < array.length; start++){
            if (array[start] == target){
                if (first_Index == -1){
                    first_Index = start;
                }
                last_Index = start;
            }
        }

        System.out.println("First index : " + first_Index);
        System.out.println("Last index : " + last_Index);
    }
}
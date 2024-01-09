//Michael, Steven, Joseph
public class CommonArray {//The class for problem 4
    public static boolean even(int[] number){//go through the array and determine if there is odd number
        int pos=0;
        while(pos!=number.length){
            if(number[pos]%2==1){
                return false;
            }
            pos++;
        }
        return true;
    }
    public static void main(String[] args){//main method testing the function
        int number[] = {2,4,6,8,10};
        System.out.println(even(number));
    }
}

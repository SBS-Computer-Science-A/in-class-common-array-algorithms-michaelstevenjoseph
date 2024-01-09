//Michael, Steven, Joseph
public class CommonArray {
    public static boolean even(int[] number){
        int pos=0;
        while(pos!=number.length){
            if(number[pos]%2==1){
                return false;
            }
            pos++;
        }
        return true;
    }
    public static void main(String[] args){
        int number[] = {2,4,6,8,10};
        System.out.println(even(number));
    }
}

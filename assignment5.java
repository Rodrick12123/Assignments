import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class assignment5 {
    public static void main(String[] args) {
        try{
            notHandled();
        }catch(ArithmeticException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
    public void handleIndexOut(){
        try {
            int[] arr = new int[10];
            arr[20] = 0;
            System.out.println("Value has been inserted");
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    public static void notHandled(){
        int i = 100/0;
    }
}

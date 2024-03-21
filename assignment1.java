import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


class Assignment1{
    public static void main(String args[]){
        ArrayList<Integer> array =  new ArrayList<>();
        array.add(4);
        array.add(3);
        array.add(6);
        array.add(4);
        array.add(1);
        
        Collections.sort(array);
        int prevVal = array.get(0);
        ArrayList<Integer> result = new ArrayList<>();
        result.add(array.get(0));
        for(int val : array){
            if(prevVal == val){
                continue;
            }else{
                result.add(val);
            }
            prevVal = val;
        }
        System.out.println(result);
        Assignment1 c = new Assignment1();
        c.copy();
        c.copy("54321");
        c.palindrome(1221);
        c.repeating("Jkkslaj");
    }

    public void copy(){
        for(int i =1; i < 5; i++){
            int j=1;
            System.out.println("");
            while(j <= i){
                if(j == 1 || j == 2){
                    System.out.print("*");
                }else{
                    System.out.print(j + " ");
                }
                
                j++;
            }
            
        }
    }

    public void copy(String number){
        String res = "";
        for(int i = number.length() - 1; i > -1; i--){
            res += number.charAt(i);
        }        
        System.out.println(res);
    }
    public void prime(int num){
        if(num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public boolean palindrome(int num){
        String number = Integer.toString(num);
        int l = 0;
        int r = number.length() -1;
        while(l <= r){
            if(number.charAt(l) != number.charAt(r)){
                System.out.println("Not a Palindrome"+l+r);
                return false;
            }
            l++;
            r--;
        }
        System.out.println("Palindrome");
        return true;
    }
    public boolean palindromeString(String num){
        int l = 0;
        int r = num.length() -1;
        while(l <= r){
            if(num.charAt(l) != num.charAt(r)){
                System.out.println("Not a Palindrome"+l+r);
                return false;
            }
            l++;
            r--;
        }
        System.out.println("Palindrome");
        return true;
    }
    public int charInString(char cr, String word){
        int occ = 0;
        char[] w = word.toCharArray();
        for(char cha : w){
            if(cha == cr){
                occ++;
            }
        }
        return occ;
    }
    public void sort(String[] arr){
        //Descend
        Arrays.sort(arr, Collections.reverseOrder());
        //Ascend
        Arrays.sort(arr);
    }
    public List<Character> repeating(String input){
        
        
        char[] w = input.toCharArray();
        Arrays.sort(w);
        List<Character> list = new ArrayList<>();
        char prev = w[0];
        list.add(w[0]);
        for(int i = 1; i<w.length; i++){
            list.add(w[i]);
            if(prev == w[i]){
                list.remove(list.size() - 1);
            }
            prev = w[i];
        }
        return list;
    }

    public String removeRepeat(String str){
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        for (Character ch : set) {
            result.append(ch);
        }
        return result.toString();
    }

    public String removeSpace(String str){
        return str.replaceAll("\\s", "");
    }

    public boolean isVowel(char c){
        char letter = Character.toLowerCase(c);
        if(letter == 'a' ||letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            return true;
        }else{
            return false;
        }
    }
    public String replaceVowel(String str){
        char[] arr = str.toCharArray();

        for(char c: arr){
            if(isVowel(c)){
                c = '-';
                String s = new String(arr);
                return s;
            }
        }
        String s = new String(arr);
        return s;

    }
    public boolean checkDigit(char c){
        if(c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '0'){
            return true;
        }else{
            return false;
        }
    }
    public void countVowCon(String s){
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            if (Character.isLetter(chr)) {
                // Check if the letter is a vowel
                if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
    }
    public char highestFrq(String s){
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            
        }

        char maxChar = '\0';
        int frq = 0;
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() > frq) {
                frq = e.getValue();
                maxChar = e.getKey();
            }
        }
        return maxChar;
    }
    public boolean anagram(String s1, String s2){
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
    public int sumInt(String s){
        char[] arr = s.toCharArray();
        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
}
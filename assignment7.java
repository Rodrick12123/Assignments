import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student{
    private ArrayList<String> names = new ArrayList<String>();
    public static void main(String[] args) {
        
    }
    public void setNames() {
        boolean done = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the names. Type done when finnished.");
        String name = null;
        while(done == false){
            name = sc.nextLine();
            if(name.equals("done")){
                done = true;
                sc.close();
            }else{
                names.add(name);
            }
        }
    }
    public void searchName(String name) {
        if(names.contains(name)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    public void searchName(int index) {
        System.out.println(names.get(index));
    }
    public void printNames( ) {
        for(String name : names){
            System.out.println(name);
        }
    }
    public void removeName( String stuName ) {
        names.remove(stuName);
    }
}
class Employee{
    private HashMap<String,String> empNames;
    public void setNames( ) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Type names and done when finnished");
        while(true){
            name = sc.nextLine();
            if (name == "done") {
                sc.close();
                break;
            }
            empNames.put(name, "0");
           
        }
    }
    public void printNames( ) {
        for (Map.Entry<String, String> name : empNames.entrySet()) {
            System.out.println("Name: " + name.getKey());
        }
    }

    public void getName( String key ) {
        System.out.println(empNames.get(key));
    }

    public void printNamesKeySet(){
        for (String key : empNames.keySet()) {
            System.out.println(empNames.get(key));
        }
    }
    public void printSize( ) {
        System.out.println(empNames.size());
    }
    public void remove( String key ) {
        empNames.remove(key);
    }
}
class ArrayListDemo{
    public static void main(String[] args) {
        Student student = new Student();
        student.setNames();
        student.printNames();
        student.searchName(0);
        student.searchName("null");
        
    }
}

class TestHashMap{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setNames();
        e.printNames();
        e.remove("null");
        e.printNamesKeySet();
        e.printSize();
    }
}
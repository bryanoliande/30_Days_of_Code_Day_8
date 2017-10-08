//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String nameToLookUp = in.next();
            if(phoneBook.containsKey(nameToLookUp))
            {
                Integer phoneNumber = phoneBook.get(nameToLookUp);
                System.out.println(nameToLookUp + "=" + phoneNumber);
            }
            else
            {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
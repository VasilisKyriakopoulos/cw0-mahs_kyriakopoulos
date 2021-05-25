import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.lang.Exception;

public class App {
    public static void bubblesrt(ArrayList<word> arr)
    {
        word temp ;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 1; j < (arr.size() - i); j++) {
                if (arr.get(j - 1).getWord().toLowerCase().compareTo(arr.get(j).getWord().toLowerCase())>0) {
                    temp = arr.get(j - 1);
                    arr.set(j - 1, arr.get(j));
                    arr.set(j, temp);
                }

            }
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("a.txt"));
        ArrayList<word> arr = new ArrayList<word>();
        boolean flag = true;
        do{
            String word = input.next();
            for (word tmp : arr){
                if(word.equals(tmp.getWord())){
                    tmp.incNum();
                    flag = false;
                    break;
                }
            }
            if(flag){
                arr.add(new word(word));
            }
            flag = true;
        }while(input.hasNext());
        for (word tmp : arr){
            System.out.println("The word:" + tmp.getWord()  + " "+ tmp.getNum());
        }
        bubblesrt(arr);
        System.out.println("\nThe Sorted Array list is :");
        for (word tmp : arr){
            System.out.println("The word:" + tmp.getWord()  + " "+ tmp.getNum());
        }
}
}

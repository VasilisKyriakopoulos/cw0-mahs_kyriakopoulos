import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.lang.Exception;

public class App {
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
}
}

import java.util.Scanner;
import java.io.*;
public class Mark{
public Mark(){
    File f = new File("quiz responses.csv");
    int count = 0;
    int line = 0;
    String result = "";
    try{
        Scanner input = new Scanner(f);   
        String a = input.nextLine();
        String answ = input.nextLine();
        String[]ans = answ.split(",");
        while(input.hasNext()){
            String str = input.nextLine();
            String[]res = str.split(",");
            int mark = 0;
            for(int i = 1;i<=ans.length-1;i++){
                if(ans[i].equals(res[i])){
                    mark++;
                }
            }
            System.out.println(res[0]+" "+ mark+"/"+(ans.length-1));
    }
}catch(FileNotFoundException e){
     e.printStackTrace();   
    }
}
}

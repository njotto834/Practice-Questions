import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/*
* Given an array of integers, where all elements but one occur twice, find the unique element.
*/

class Result {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    //Method to implement
    public static int lonelyinteger(List<Integer> a) {
    boolean matched = true;
    
    for (int i = 0; i < a.size(); i++){
        int cur = a.get(i);        

        for (int j = 0; j < a.size(); j++){
            if (i == j){
                continue;
            }
            else{
                if (a.get(j) == cur){
                    matched = true;
                    break;
                }
                else{
                    matched = false;
                }
            }
        }
        if (!matched){
            return cur;
        }
    }
    
    if (a.size() == 1){
        return a.get(0);
    }
    else{
        return 0;
    }

    }

}

//Class provided by HackerRank
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

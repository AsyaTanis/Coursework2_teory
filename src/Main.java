import java.util.*;
import java.util.stream.*;

public class Main{
    public static String keepDistinct(String ...arr){
        return Arrays.stream(arr)
                .distinct()
                .collect(Collectors.joining());
    }
    public static void main(String[] args){
        System.out.println(keepDistinct("aa","pppp","sss","aaa","bbb","pppp","bbb"));
    }
}
package on.focus0147.strings;

import java.util.*;
import java.util.stream.Collectors;



public class ReverseWordsInString {

    public static void main(String[] args){
        System.out.println(reverseWords("the sky is blue"));
    }

    public static String reverseWords(String s) {
        List<String> list = Arrays.stream(s.split(" ")).filter(word -> !word.isBlank())
                .collect(Collectors.toList());
        Collections.reverse(list);
        return String.join(" ", list);

    }

    public static String reverseWords2(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.split(" ");
        for(int i = str.length; i >= 0; i--){
            if(!(str[i]).isBlank()){
                sb.append(str[i]);
                sb.append(" ");
            }
        }
        String sbs = sb.toString();
        return sbs.substring(0, sbs.length()-1);
    }

}

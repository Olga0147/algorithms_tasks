package on.focus0147.strings;


import java.util.LinkedList;
import java.util.List;

public class TextJustification {
    
    public static void main(String[] args){
        String[] arr = {"This", "is", "an", "example", "of", "text", "justification."};
        System.out.println(fullJustify(arr, 16));
    }

    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new LinkedList<String>();
        int currentStart = 0;
        int currentEnd = 0;
        while(currentEnd<words.length){

            int sum = 0;
            boolean firstWord = true;
            int check = 0;
            //найдем количество влезающих слов
            for(int i = currentStart; i<words.length; i++){
                check = firstWord ? (sum + words[i].length()) : (sum + 1 + words[i].length());
                if(check<=maxWidth){
                    firstWord = false;
                    currentEnd = i;
                    sum = check;
                } else {
                    break;
                }
            }

            if(currentEnd!=words.length-1){
                //распределим между ними пробелы
                int spacesNeeded = maxWidth - sum;
                int wordsBetween = currentEnd - currentStart ;
                int each = wordsBetween == 0 ? 0: spacesNeeded/wordsBetween;
                int left = wordsBetween == 0 ? 0: spacesNeeded%wordsBetween;
                //создадим строку
                StringBuilder sb = new StringBuilder();
                for(int i = currentStart; i<= currentEnd; i++){
                    if(i!=currentStart){
                        sb.append(" ");
                    }
                    if(i==currentStart+1){
                        sb.append(" ".repeat(left+each));
                    } else {
                        sb.append(" ".repeat(each));
                    }
                    sb.append(words[i]);
                }
                //добавим строку
                System.out.println(sb.toString());
                result.add(sb.toString());
            }
            currentStart = currentEnd;

            //


        }
        return result;
    }

}

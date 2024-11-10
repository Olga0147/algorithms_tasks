package on.focus0147.strings;

/**
 * From "PAYPALISHIRING" to "PAHNAPLSIIGYIR"
 * Подсмотрела вариант решения
 *
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 */
public class ZigZagString {
    
    public static void main(String[] args){
        System.out.println(convert("PAYPALISHIRING", 3));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) return s;
        int l = Math.min(numRows,s.length());
        StringBuilder[] sbs = new StringBuilder[l];
        for(int i = 0 ; i<l;i++){
            sbs[i] = new StringBuilder();
        }

        s.indexOf("d");

        boolean goDown = false;
        int row = 0;
        for(char c :s.toCharArray()){
            sbs[row].append(c);
            if(row == 0 || row == l-1){
                goDown = !goDown;
            }
            row += goDown? 1 : -1;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : sbs) {
            result.append(sb);
        }
        return result.toString();
    }

}

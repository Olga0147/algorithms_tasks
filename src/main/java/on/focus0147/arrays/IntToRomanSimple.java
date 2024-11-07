package on.focus0147.arrays;

public class IntToRomanSimple {


    public static void main(String[] args){
       // int[] nums1 = {1,2,2};

        System.out.println("res = " + intToRoman(1994));
    }

    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        while (num >=1000){
            num -= 1000;
            sb.append("M");
        }
        if (num>=900){
            num -= 900;
            sb.append("CM");
        }
        if (num>=500){
            num -= 500;
            sb.append("D");
        }

        while (num >=100){
            num -= 100;
            sb.append("C");
        }
        if (num>=90){
            num -= 90;
            sb.append("XC");
        }
        if (num>=50){
            num -= 50;
            sb.append("L");
        }

        while (num >=10){
            num -= 10;
            sb.append("X");
        }
        if (num>=9){
            num -= 9;
            sb.append("IX");
        }
        if (num>=5){
            num -= 5;
            sb.append("V");
        }

        while (num >=1){
            num -= 1;
            sb.append("I");
        }
    return sb.toString();
    }

}

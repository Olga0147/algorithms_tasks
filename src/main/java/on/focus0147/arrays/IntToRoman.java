package on.focus0147.arrays;

public class IntToRoman {


    public static void main(String[] args){
        System.out.println("res = " + intToRoman(1994));
    }

    public static String intToRoman(int num) {
        String sb = "";
        String nums = String.valueOf(num);
        char[] numc = nums.toCharArray();
        int numDigits = numc.length;


        for(int i = numDigits-1, j = 1; i >=0;i--, j=j*10){
            int current =  Character.getNumericValue(numc[i]);
            sb = getN(current, j) + sb;
        }
        return  sb;

    }


    public static String getN(int i, int j){
        switch(i*j){
            case 1:return "I";
            case 5:return "V";
            case 10:return "X";
            case 50:return "L";
            case 100:return "C";
            case 500:return "D";
            case 1000:return "M";
            default:
                boolean minus = false;
                int plus = 0;
                if((1< i && i < 4)){
                    String res = getN(j,1);
                    return res.repeat(i);
                } else if(5< i && i <9 ){
                    String res = getN(j,1);
                    return getN(5*j, 1) + res.repeat(i-5);

                } else if(i==4) {
                    return getN(1*j, 1) + getN(getNext(i)*j, 1);
                }
                else if(i == 9){
                    return getN(1*j, 1) + getN(getNext(i)*j, 1);


                }
                return "";
        }
    }

    static int getNext(int i){
        if(i<5) return 5;
        return 10;
    }

}

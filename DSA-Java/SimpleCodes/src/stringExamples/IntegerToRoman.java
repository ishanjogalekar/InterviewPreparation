package stringExamples;
/*Roman	Value
M	1000
CM	900
D	500
CD	400
C	100
XC	90
L	50
XL	40
X	10
IX	9
V	5
IV	4
I	1*/

//Use of greedy approach - always subtract from nearest large  value
public class IntegerToRoman {
    public String convertToRoman(int num) {
        //First get all pivot values - like multiple of 100 & 10 and their symbols
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        //String Builder as output
        StringBuilder roman = new StringBuilder();
        //Iterate over values and num > 0
        for(int i = 0 ; i < values.length && num>0 ; i++){
            //if input no > value subtract it from value and append the symbol at that
            // particular point to builder
            while(num>=values[i]){
                num -= values[i];
                roman.append(symbols[i]);
            }
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        IntegerToRoman roman = new IntegerToRoman();
        int num = 1;
        System.out.println(roman.convertToRoman(num));
    }
}

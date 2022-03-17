class Solution {
    public int romanToInt(String s) {
        boolean wasI = false;
        boolean wasX = false;
        boolean wasC = false;
        int length = s.length();
        int result = 0;
        
        for (int i = 0; i < length; i++){
            char c = s.charAt(i);
            if (c == 'I'){
                result += 1;
                wasI = true;
            }
            else if (c == 'V'){
                result += 5;
                if (wasI){
                    result -= 2;
                }
            }
            else if (c == 'X'){
                result += 10;
                wasX = true;
                if (wasI){
                    result -= 2; 
                }
            }
            else if (c == 'L'){
                result += 50;
                if (wasX){
                    result -= 20;
                }
            }
            else if (c == 'C'){
                result += 100;
                wasC = true;
                if (wasX){
                    result -= 20;
                }
            }
            else if (c == 'D'){
                result += 500;
                if (wasC){
                    result -= 200;
                }
            }
            else if (c == 'M'){
                result += 1000;
                if (wasC){
                    result -= 200;
                }
            }
        }
        return result;
    }
}
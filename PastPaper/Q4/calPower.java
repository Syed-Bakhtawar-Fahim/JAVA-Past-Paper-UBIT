import java.util.Scanner;

class calPower{
  static  int result=1;
    static int IntegerPower(int base,int exponent){
        if(exponent==0){
            return 1;
        }

        else if(exponent<0){
            for (int i = 0; i < exponent ; i++) {
                result = result*base;
            }

            return 1/result;
        }

        else{

            for (int i = 0; i < exponent ; i++) {

                result =result*base;
            }

            return result;
        }
        }
    }



import java.text.DecimalFormat;

public class Power {

     public boolean isPowerOfTwo(int number){

         while(number % 2 == 0){
             number = number / 2;
         }


        if(number == 1){
            return true;

        } else {

            return false;
        }


    }







}

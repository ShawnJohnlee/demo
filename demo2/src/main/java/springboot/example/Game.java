package springboot.example;
import org.junit.Test;
/**
 * Created by JOHN on 2019/4/27.
 */
public class Game {

    @Test
    public void stage(){
        for (int i =1;i<=100;i++){
            if(i%3==0&&i%5!=0){
                System.out.println("Fizz");
            }

            if(i%5==0&&i%3!=0){
                System.out.println("Buzz");
            }

            if(i%5==0&&i%3==0){
                System.out.println("FizzBuzz");
            }

            if(i%5!=0&&i%3!=0){
                System.out.println(i);
            }
        }
    }


    @Test
    public void stage2(){
        for (int i =1;i<=100;i++){
            String s = String.valueOf(i);
            String result = "";
            if((i%3==0||s.indexOf("3")>-1)&&(i%5!=0||s.indexOf("5")==-1)){
                result = "Fizz";
            }

            if((i%5==0||s.indexOf("5")>-1)&&(i%3!=0||s.indexOf("3")==-1)){
                result = "Buzz";
            }

            if((i%5==0||s.indexOf("5")>-1)&&(i%3==0||s.indexOf("3")>-1)){
                result = "FizzBuzz";
            }

            if(i%5!=0&&s.indexOf("5")==-1&&i%3!=0&&s.indexOf("3")==-1){
                result = s;
            }

            System.out.println(result);
        }
    }

}

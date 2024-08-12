
public class Conditionals {
    public static void main(String[] args) {
        int number=10;

        // if statement
        if(number>5){ // true
            System.out.println(number+" is greater than 5");
        }

        // else if statement
        if(number<5){ // false
            System.out.println(number+" is smaller than 5");
        }else{
            System.out.println(number+" is greater than 5");
        }

        // if else-if else

        if(number == 5){
            System.out.println(number+" is equal to 5");
        }else if(number > 5){
            System.out.println(number+" is greater than 5");
        }else{
            System.out.println(number+" is smaller than 5");
        }

    }
}

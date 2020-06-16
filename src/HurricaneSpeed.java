import java.util.Scanner;

public class HurricaneSpeed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Category for Hurricane
        int category;

        //User-submitted speed
        int speed;
        System.out.println("Wind speed: ");
        speed = input.nextInt();

        if (speed >= 157 ){
            category = 5;
        } else if (speed >= 130 ){
            category = 4;
        }else if (speed >= 111 ){
            category = 3;
        }else if (speed >= 96 ){
            category = 2;
        }else                       // if (speed >= 74 )//
        {
            category = 1;
        }

        //Return hurricane category
        System.out.println("Category " + category);

    }
}

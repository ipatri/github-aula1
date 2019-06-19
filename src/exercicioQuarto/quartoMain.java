package exercicioQuarto;

import java.util.Locale;
import java.util.Scanner;

public class quartoMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rooms?");
        int rooms = sc.nextInt();
        quartoEntity[] vecRoom = new quartoEntity[10];
        for (int i= 0;i<rooms;i++){
            System.out.printf("Rent #%d%n",i+1);
            System.out.print("Name:");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email:");
            String email = sc.nextLine();

            System.out.print("Room:");
            int room = sc.nextInt();
            vecRoom[room]= new quartoEntity(name,email,room);
        }
        System.out.println("Busy rooms:");
        for(int i = 0;i<vecRoom.length;i++){
            if(vecRoom[i]!=null){
                System.out.println(vecRoom[i]);
            }
        }

//        System.out.println(vecRoom[0]);
    }
}

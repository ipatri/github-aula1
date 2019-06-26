//package application;
//
//import model.entities.Contract;
//import model.entities.Installments;
//import model.services.ContractService;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Locale;
//import java.util.Scanner;
//
//public class Program {
//    public static void main(String[] args) throws ParseException {
//        Locale.setDefault(Locale.US);
//        SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter contract data");
//        System.out.print("Number: ");
//        int number = sc.nextInt();
//        System.out.print("Date (Dd/MM/yyyy): ");
//        Date date = sdf.parse(sc.next());
//        System.out.print("Contract value: ");
//        double value=sc.nextDouble();
//        System.out.print("Enter the number of installments: ");
//        int installmentsQ = sc.nextInt();
//        Contract contract = new Contract(number,date,value);
//
//        sc.close();
//    }
//}

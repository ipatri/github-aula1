package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class lista1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2,"Marco");

        System.out.println(list.size());
        System.out.println("_____________________________");


        for (String nome:list) {
            System.out.println(nome);
        }

        System.out.println("_____________________________");
//        list.remove(1);
//        list.remove("Anna");
        list.removeIf(nome->nome.charAt(0)=='M');
        for(String nome:list){
            System.out.println(nome);
        }
        System.out.println("__________________________________");
        System.out.println("Index of Bob: "+list.indexOf("Bob"));
        System.out.println("Index of Marco: "+list.indexOf("Marco"));
        System.out.println("_________________________________");
        List<String> result = list.stream().filter(nome->nome.charAt(0)=='A').collect(Collectors.toList());
        for(String nome:result){
            System.out.println(nome);
        }
        System.out.println("__________________________________");
        String name = list.stream().filter(nome->nome.charAt(0)=='J').findFirst().orElse(null);
        System.out.println(name);


    }
}

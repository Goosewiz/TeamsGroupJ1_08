package main.gusev.java23.task1;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws AlreadyExistsException {
        Map<String, Integer> info = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Вводите текст");
        String input;
        int number = 0;
        while(true){
            try{
                input = sc.nextLine();
                number = number + 1;
                if (info.keySet().contains(input)){
                    throw new AlreadyExistsException(input, info.get(input));
                }
                info.put(input, number);
            }
            catch (AlreadyExistsException e){
                System.out.print("Повторно введено значение: " + e.getMessage());
                break;
            }
        }
        sc.close();
    }
}
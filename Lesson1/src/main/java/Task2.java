import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int pos = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целые числа через пробел: ");
        String str = in.nextLine();
        String[] nums = str.split("\\s+");
        for(String num: nums){
            if(!num.contains("-")&& !num.equals("0")){
                pos++;
            }
        }
        System.out.println("Количество положительных чисел: " + pos);
    }
}
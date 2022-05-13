package ua.lviv.lgs.task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String name;
        int length;
        int width;
        double weight;
        Commodity c = new Commodity();
        Scanner sc = new Scanner(System.in);

        while (true){
            menu();
            switch (sc.nextInt()){
                case 1 :{

                    c.addСommodity();
                    break;
                }
                case 2:{
                    c.removeСommodity();
                    break;
                }
                case 3:{
                    c.displayCommodity();
                    break;
                }
                case 4:{
                    c.sortByName();
                    break;
                }
                case  9:{
                    System.exit(1);
                    break;
                }

                default: {
                    System.out.println("В меню немає такої дії!");
                }
            }
        }
    }

    public static void menu(){
        System.out.println();
        System.out.println("Натисніть 1, щоб добавити товар в колекцію: ");
        System.out.println("Натисніть 2 , щоб видалити товар: ");
        System.out.println("Натисніть 3, щоб відобразити всі товари: ");
        System.out.println("Натисніть 4, щоб відсортувати товари за назвою: ");
        System.out.println("Натисніть 5, щоб відсортувати товари за довжиною: ");
        System.out.println("Натисніть 6, щоб відсортувати товари за шириною: ");
        System.out.println("Натисніть 7, щоб відсортувати товари за вагою: ");
        System.out.println("Натисніть 9, щоб вийти з програми: ");
    }
}

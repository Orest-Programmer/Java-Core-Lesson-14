package ua.lviv.lgs.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Commodity{
    private String name;
    private int length;
    private  int width;
    private double weight;


    List<Commodity> сommodityCollection = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public Commodity(){

    }
    public Commodity(String name, int length, int width, double weight) {
        super();
        this.name = name;
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }



    public void addСommodity(){
        System.out.println("Введіть назву товару");
        name = scan.next();
        System.out.println("Введіть довжина товару");
        length = scan.nextInt();
        System.out.println("Введіть ширина товару");
        width = scan.nextInt();
        System.out.println("Введіть вага товару");
        weight = scan.nextDouble();
        сommodityCollection.add(new Commodity(name, length, width, weight));

    }

    public void removeСommodity(){
        System.out.println("Введіть назву товару якого хочете видалити: ");
        Iterator<Commodity> iterator = сommodityCollection.iterator();
        String enterName = scan.next();

        while (iterator.hasNext()){
                if(iterator.next().getName().equals(enterName)){
                    iterator.remove();
                    System.out.println("Товар видалено! ");
                }
        }
    }

    public void changeСommodity(){

    }

    public void sortByName(){
        for(Commodity c: сommodityCollection){
            System.out.println(c);
        }
    }

    public void sortByLength(){

    }

    public void sortByWidth(){

    }

    public void sortByWeight(){

    }

    public void displayCommodity(){
        System.out.println(сommodityCollection);
    }

    @Override
    public String toString() {
        return "\nCommodity{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", weight=" + weight +
                '}';
    }


}

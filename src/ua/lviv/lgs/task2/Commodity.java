package ua.lviv.lgs.task2;

import java.util.*;
import java.util.Arrays;

public class Commodity implements Comparator<Commodity>{
    private String name;
    private int length;
    private  int width;
    private int weight;



    List<Commodity> сommodityCollection = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public Commodity(){

    }
    public Commodity(String name, int length, int width, int weight) {
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
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
        weight = scan.nextInt();

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
        System.out.println("Введіть назву товару якого хочете замінити: ");
        Iterator<Commodity> iterator = сommodityCollection.iterator();
        String enterName = scan.next();

        while (iterator.hasNext()){
            if(iterator.next().getName().equals(enterName)){
                iterator.remove();
            }
        }
        addСommodity();
        System.out.println("Товар замінено! ");
    }

    public void sortByName(){
        сommodityCollection.sort(NameComparator);
        System.out.println(сommodityCollection);
    }

    public void sortByLength(){
        сommodityCollection.sort(LengthComparator);
        System.out.println(сommodityCollection);
    }

    public void sortByWidth(){
        сommodityCollection.sort(WidthComparator);
        System.out.println(сommodityCollection);
    }

    public void sortByWeight(){
        сommodityCollection.sort(WeightComparator);
        System.out.println(сommodityCollection);
    }

    public void displayId(){
        System.out.println("Введіть і-тий елемент який хочете вивести: ");
        int enterId = scan.nextInt() -1;
        if (enterId > сommodityCollection.size()){
            System.out.println("Введіть коректне число");
        }else if(enterId == 0){
            System.out.println("Введіть коректне число");
        }else {
            System.out.println(сommodityCollection.get(enterId));
        }
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


    @Override
    public int compare(Commodity o1, Commodity o2) {
        return o1.getName().compareTo(o2.getName());
    }

    public static  Comparator<Commodity> NameComparator = new Comparator<Commodity>() {
        @Override
        public int compare(Commodity o1, Commodity o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public static  Comparator<Commodity> LengthComparator = new Comparator<Commodity>() {
        @Override
        public int compare(Commodity o1, Commodity o2) {
            return o1.getLength() - o2.getLength();
        }
    };

    public static  Comparator<Commodity> WidthComparator = new Comparator<Commodity>() {
        @Override
        public int compare(Commodity o1, Commodity o2) {
            return o1.getWidth() - o2.getWidth();
        }
    };

    public static  Comparator<Commodity> WeightComparator = new Comparator<Commodity>() {
        @Override
        public int compare(Commodity o1, Commodity o2) {
            return o1.getWeight() - o2.getWeight();
        }
    };


}

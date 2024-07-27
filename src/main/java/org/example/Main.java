package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Dog", true));
        animals.add(new Animal("Cat"));
        animals.add(new Animal());

        for (Animal animal : animals) {
            System.out.println(animal);
        }


        ArrayList<TvShow> tvShows = new ArrayList<>();
        tvShows.add(new TvShow("Breaking Bad", 62, "Crime"));
        tvShows.add(new TvShow("Friends"));
        tvShows.add(new TvShow());

        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow);
        }


        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Harry Potter", 500, 1997));
        books.add(new Book("To Kill a Mockingbird"));
        books.add(new Book());

        for (Book book : books) {
            System.out.println(book);
        }


        Counter counter1 = new Counter(5);
        Counter counter2 = new Counter();

        System.out.println("Counter 1 initial value: " + counter1.value());
        System.out.println("Counter 2 initial value: " + counter2.value());

        counter1.increase();
        counter2.decrease();

        System.out.println("Counter 1 after increase: " + counter1.value());
        System.out.println("Counter 2 after decrease: " + counter2.value());

        counter1.increase(3);
        counter2.decrease(2);

        System.out.println("Counter 1 after increase by 3: " + counter1.value());
        System.out.println("Counter 2 after decrease by 2: " + counter2.value());
    }
}

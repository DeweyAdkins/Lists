package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<TvShow> tvShows = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();
        while (true) {

                System.out.println("Enter the name of your animal (or press Enter to stop: ");
                String name = scanner.nextLine();

                if (name.isEmpty()) {
                    break;
                }

                System.out.print("Is this animal a dog? (True/false): ");
                boolean isDog = scanner.nextBoolean();
                scanner.nextLine();

                animals.add(new Animal(name, isDog));
            }

            System.out.println("\nList of Animals:");
            for (Animal animal : animals) {
                System.out.println(animal);
            }




        while (true) {
        System.out.print("Enter the name of the TV show ( or press Enter to stop): ");
        String showName = scanner.nextLine();

        if (showName.isEmpty()) {
            break;
        }

        System.out.print("Enter the number of episodes: ");
        int numberOfEpisodes = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the Genre: ");
        String genre = scanner.nextLine();
        tvShows.add(new TvShow(showName, numberOfEpisodes, genre));
    }

        System.out.println("\nList of TV Shows:");
        for (TvShow show : tvShows) {
            System.out.println(show);
        }



        while (true) {
            System.out.print("Enter the name of the book (or press Enter to stop): ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Enter the number of pages: ");
            int numberOfPages = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter the publication year: ");
            int publicationYear = scanner.nextInt();
            scanner.nextLine();

            books.add(new Book(title, numberOfPages, publicationYear));
        }

        System.out.print("What do you want to print? (everything/name):");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (choice.equalsIgnoreCase("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }

        scanner.close();
    }
}








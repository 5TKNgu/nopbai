package az;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        book[] books = new book[6];
        books[0] = new book("Sach 1", "Tac gia 1", 100);
        books[1] = new book("Sach 2", "Tac gia 2", 200);
        books[2] = new book("Sach 3", "Tac gia 1", 300);
        books[3] = new book("Sach 4", "Tac gia 4", 400);
        books[4] = new book("Sach 5", "Tac gia 1", 500);
        books[5] = new book("Sach 5", "Tac gia 1");

        Library library = new Library();
        library.setBooks(books);

        menu(library);
    }

    public static void HAM(){}

    public static void Sl(Library library) {

    }
    public static void menu(Library library) {
        for (book book : library.getBooks()) {
            book.display();
        }
        System.out.println("1. Tim sach theo tac gia");
        System.out.println("2. Mua sach theo ten");
        System.out.println("3. Thoat");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                searchBookByAuthor(library);
                break;
            case 2:
                buyBooksByName(library);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Lua chon khong hop le");
                break;
        }

        scanner.close();
    }


    public static void searchBookByAuthor(Library library) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten tac gia: ");
        String author = scanner.nextLine();

        book[] books = library.getBookByAuthor(author);
        for (book book : books) {
            if (book != null) {
                book.display();
            }
        }

        buyBooksByName(library);
        scanner.close();
    }

    public static void buyBooksByName(Library library) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten sach: ");
        String name = scanner.nextLine();

        if (library.getBookByName(name) == null){
            System.out.println("Khong tim thay sach");
            scanner.close();
            return;
        }
        System.out.println("Nhap so luong sach hien co ");
        int booknow = scanner.nextInt();

        System.out.println("Nhap so luong muon mua: ");
        int quantity = scanner.nextInt();

        
        System.out.println("Nhap so luong sach them để nhập: ");
        int add = scanner.nextInt();
        int now = add + booknow;

        if(quantity > now){
            System.out.println("dell du sach ban r bạn đi chỗ khác dùm t");
            return;
        }

        book book = library.getBookByName(name);
        int total = book.getPrice() * quantity;

        System.out.println("Tong tien: " + total);

        scanner.close();
    }
}
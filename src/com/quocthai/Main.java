package com.quocthai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("----------------------------------");
            System.out.println("Enter the number of your selection");
            System.out.println("1.Multi-Adding Customer");
            System.out.println("2.Delete");
            System.out.println("3.Display All");
            System.out.println("4.Search");
            System.out.println("5.Billing");
            System.out.println("6.Update Customer's Service");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Enter the number of customers you want to add ?");
                    int n = Integer.parseInt(scanner.nextLine());
                    hotel.addMultiCustomer(n);
                    hotel.showListCustomer();
                    break;
                case 2:
                    System.out.println("Enter customer's identity: ");
                    String identity = scanner.nextLine();
                    int index = hotel.findCustomerByIdentity(identity);
                    hotel.deleteCustomerInfo(hotel.customers.get(index));
                    break;
                case 3:
                    hotel.showListCustomer();
                    break;
                case 4:
                    System.out.println("Enter customer's identity: ");
                    identity = scanner.nextLine();
                    index = hotel.findCustomerByIdentity(identity);
                    hotel.showCustomerInfo(hotel.customers.get(index));
                    break;
                case 5:
                    System.out.println("Enter customer's identity: ");
                    identity = scanner.nextLine();
                    System.out.println("Tổng số tiền phải thanh toán là: " + hotel.totalMoney(identity));
                    break;
                case 6:
                    System.out.println("Enter customer's identity: ");
                    identity = scanner.nextLine();
                    System.out.println("Enter updated number of days: ");
                    int days = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter updated type of room: ");
                    String type = scanner.nextLine();
                    hotel.updateCustomerService(identity, days, type);
                    hotel.showCustomerInfo(hotel.customers.get(hotel.findCustomerByIdentity(identity)));
                    break;
            }
        }while(true);
    }
}

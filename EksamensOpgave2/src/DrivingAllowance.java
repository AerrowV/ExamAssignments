import java.util.Scanner;

public class DrivingAllowance {
    private String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private double totalPayment = 0;
    private Scanner scanner = new Scanner(System.in);


    public void registerDrives() {

        String continueRegistration = "Y";
        while (!continueRegistration.equalsIgnoreCase("N")) {
            System.out.println("Enter your drive with the format [month,number]: ");
            String registration = scanner.nextLine();

            try {

            String[] values = registration.split(",");

            int month = Integer.parseInt(values[0]);
            int count = Integer.parseInt(values[1]);

            double amountPerDrive = month <= 6 ? 60 : 80;
            double monthAmount = count * amountPerDrive;

            totalPayment += monthAmount;
            System.out.println("Compensation for " + months[month - 1] + ": " + monthAmount + "kr");

            System.out.println("Continue registration? Y/N");
            continueRegistration = scanner.nextLine();

        } catch (Exception e) {
                System.out.println("Try again mister/missus. ex: '1,3'");
            }
        }
        System.out.println("Thank you for your help! " + totalPayment + "kr will be deposited into your account.");
    }
}
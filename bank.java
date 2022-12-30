import java.util.Scanner;

class account {
    String name;
    int account_num;
    String acc_type;
}

class sav_acct extends account {
    double balance;

    sav_acct(String n, int ac, String actype, Double bl) {
        name = n;
        account_num = ac;
        actype = acc_type;
        balance = bl;
    }

    Scanner sc = new Scanner(System.in);

    void deposit(int val) {
        balance += val;
    }

    void display_bal() {
        System.out.println("Balance is: " + balance);
    }

    void deposit_interest() {
        double int_rate = 0.05;
        double time = 0;
        System.out.println("enter the time period");
        time = sc.nextDouble();
        double amount;
        amount = balance * Math.pow((1 + int_rate), time);
        balance = amount;
    }

    void withdraw(int val) {
        if (val > balance) {
            System.out.println("out of funds, withdraw lesser");
        } else {
            balance -= val;
            System.out.println("withdrawal successful");
            System.out.println("new balance: " + balance);
        }
    }

    void check_min() {
        Double min_bal = 1000.00;
        Double penalty = 100.00;
        if (balance < min_bal) {
            System.out.println("balance lesser than minimum balance, penalty imposed");
            balance -= penalty;
        } else {
            System.out.println("balance higher than minimum balance");
        }
    }
}

class cur_acct extends account {
    double balance;

    cur_acct(String n, int ac, String actype, Double bl) {
        name = n;
        account_num = ac;
        actype = acc_type;
        balance = bl;
    }

    void deposit(int val) {
        balance += val;
    }

    void display_bal() {
        System.out.println("Balance is: " + balance);
    }

    void deposit_interest() {
        System.out.println("Current account doesnt provide any interest");
    }

    void withdraw(int val) {
        System.out.println("Current account doesnt provide withdrawal facility");
    }

    void check_min() {
        System.out.println("no minimun balance requirement for current account");
    }
}

class bank {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name, account number, aacount type(savings/current), balance");
        String name = sc.nextLine();
        int account_num = sc.nextInt();
        String acc_type = sc.next();
        double balance = sc.nextDouble();
        if (acc_type.equals("savings")) {
            sav_acct a1 = new sav_acct(name, account_num, acc_type, balance);
            int choice = 0;
            while (choice != 6) {
                System.out.println(
                        "1.deposit\n2.display balance\n3.compute and deposit interest\n4.withdraw\n5.check for minimum balance\n6.exit");
                choice = sc.nextInt();
                switch (choice) {
                    case (1):
                        System.out.println("enter the value to deposit");
                        int val = sc.nextInt();
                        a1.deposit(val);
                        break;
                    case (2):
                        a1.display_bal();
                        break;
                    case (3):
                        a1.deposit_interest();
                        break;
                    case (4):
                        System.out.println("enter the value to withdraw");
                        int withd = sc.nextInt();
                        a1.withdraw(withd);
                        break;
                    case (5):
                        a1.check_min();
                        break;
                    case (6):
                        System.out.println("exited");
                        break;
                    default:
                        System.out.println("enter a valid choice");
                        break;
                }
            }
        } else {
            cur_acct a1 = new cur_acct(name, account_num, acc_type, balance);
            int choice = 0;
            while (choice != 6) {
                System.out.println(
                        "1.deposit\n2.display balance\n3.compute and deposit interest\n4.withdraw\n5.check for minimum balance\n6.exit");
                choice = sc.nextInt();
                switch (choice) {
                    case (1):
                        System.out.println("enter the value to deposit");
                        int val = sc.nextInt();
                        a1.deposit(val);
                        break;
                    case (2):
                        a1.display_bal();
                        break;
                    case (3):
                        a1.deposit_interest();
                        break;
                    case (4):
                        System.out.println("enter the value to withdraw");
                        int withd = sc.nextInt();
                        a1.withdraw(withd);
                        break;
                    case (5):
                        a1.check_min();
                        break;
                    case (6):
                        System.out.println("exited");
                        break;
                    default:
                        System.out.println("enter a valid choice");
                        break;
                }
            }
        }
    }
}
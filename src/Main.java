public class Main {
    public static void main(String[] args) {
        ATM ATM=new ATM(20000,3500);
        System.out.println(ATM.putMoney(2000));
        System.out.println(ATM.withdrawMoney(3000));
    }
}

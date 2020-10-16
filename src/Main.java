public class Main {
    public static void main(String[] args) {
        ATM ATM=new ATM(20000,3500,3000);
        System.out.println(ATM.putMoney());
        System.out.println(ATM.withdrawMoney());
    }
}

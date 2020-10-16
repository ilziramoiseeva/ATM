public class ATM {
    private int initialSum;
    private int deposit;
    private int result;
    private int maxDeposit;

    public ATM(int initialSum,int deposit,int maxDeposit) {
        this.initialSum = initialSum;
        this.deposit=deposit;
        this.maxDeposit=maxDeposit;
    }

    public int putMoney(){
        if(deposit==0){
            System.out.println("Внесите сумму");
            return 0;
        }
        result=initialSum+deposit;
        return result;
    }
    public int withdrawMoney(){
        if(initialSum<deposit){
            System.out.println("Недостаточно средств");
            return 0;
        }
        if(deposit==0){
            System.out.println("Введите сумму");
            return 0;
        }
        if(deposit>maxDeposit){
            System.out.println("В банкомате недостаточно средств");
            return 0;
        }
        result=initialSum-deposit;
        return result;
    }

}

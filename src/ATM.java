public class ATM {
    private int initialSum;
    private int deposit;
    private int result;
    private int maxDeposit;

    public ATM(int initialSum,int maxDeposit) {
        this.initialSum = initialSum;
        this.maxDeposit=maxDeposit;
    }

    public int putMoney(int deposit){
        if(deposit==0){
            return 0;
        }
        result=initialSum+deposit;
        return result;
    }
    public int withdrawMoney(int deposit){
        if(initialSum<deposit){
            return 0;
        }
        if(deposit==0){
            return 0;
        }
        if(deposit>maxDeposit){
            return 0;
        }
        result=initialSum-deposit;
        return result;
    }

}

public class ATM {
    public int countBanknotes(int sum) {   
   
        int[] banknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int balance = 0;
        int sumStart = sum;
        int result = 0;
        int i = 0;

        while (i < banknotes.length) {
            balance = sumStart % banknotes[i];
            result += (sumStart - balance) / banknotes[i];
            sumStart = balance;
            i++;

        }
        return result;
   }
}  
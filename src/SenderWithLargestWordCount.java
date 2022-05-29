import java.util.Scanner;

public class SenderWithLargestWordCount {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sender : ");
        int n = input.nextInt();

        String[] messages = new String[n];
        String[] senders = new String[n];
        input.nextLine();
        for(int i = 0; i< n;i++){

            System.out.print("Enter Message : ");
            String s = input.nextLine();
             messages[i] = s;

        }
        for(int j = 0;j<n;j++){
            System.out.print("Enter Sender Name : ");
            senders[j] = input.nextLine();
        }


        System.out.println(largestWordCount(messages, senders));

    }

    static String largestWordCount(String[] messages, String[] senders) {

        String name;
        name="Done";
        for(int i=0;i<senders.length;i++){
            System.out.println(messages[i] + " By "+senders[i]);
        }
        return name;
    }

}

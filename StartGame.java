import java.util.Scanner;

public class StartGame {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        String userChoice="";
        int right=0;
        int wrong=0;

        QuestionManager QuestionMgr = new QuestionManager();

        QuestionUserInterface ui = new QuestionUserInterface(QuestionMgr);
        ui.go();
        for(int i=0; i<3; i++) {
            //QuestionMgr.printQuestion(i);      only for testing
            userChoice=in.next();
            //QuestionMgr.printAns(i);            only for testing
            if(QuestionMgr.isCorrect(userChoice,i))
                right++;
            else
                wrong++;

        }

        System.out.println("Number of Right answers : "+right+"\nNumber of wrong answers : "+wrong);
    }
}

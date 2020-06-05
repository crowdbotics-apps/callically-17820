import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class QuestionUserInterface {
    private Scanner in = new Scanner(System.in);
    private QuestionManager QuestionMgr;


    public QuestionUserInterface(QuestionManager mgr){QuestionMgr = mgr;}

    public void go(){
        load("C:\\Users\\Chris Lin\\IdeaProjects\\Playground\\src\\Questions.txt");

    }


    private void writeToFile(Question question, String filepath){
        try{
            PrintWriter out = new PrintWriter(new FileWriter(filepath,true));
            out.print('\n');
            out.print(question.getQuestion()+ '|');
            out.print(question.getChoices()+ '|');
            out.print(question.getAnswer()+ '|');
            out.print(question.getCategory() + '|');
            out.print(question.getCompletion());
            out.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private  void load(String filePath){
        try{
            File file = new File(filePath);
            Scanner fileIn = new Scanner(file);

            while(fileIn.hasNext()){
                String line = fileIn.nextLine();
                Question question = readQuestion(line);

                QuestionMgr.addQuestion(question);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Question readQuestion(String line){
        Scanner lineScanner = new Scanner(line);
        lineScanner.useDelimiter("\\|");
        String question = lineScanner.next();
        String choices = lineScanner.next();
        String answer = lineScanner.next();
        String category = lineScanner.next();
       // String QuestionStr = lineScanner.next();
        //int completion = Integer.parseInt(QuestionStr);
        int completion = lineScanner.nextInt();
        Question question1 = new Question(question, choices, answer, category, completion);
        lineScanner.close();
        return question1;

    }
}

public class Question {
    public String question;
    public String choices;
    public String answer;
    public int completion;
    public String category;

    public Question(String question,String choices, String answer,String category,int completion){
        this.question=question;
        this.choices=choices;
        this.answer=answer;
        this.category=category;
        this.completion=completion;
    }

    public String toString(){
        return "Question: " +this.getQuestion() + " "+ this.getChoices()+ " "+ this.getCategory() + " "+ this.getCompletion();
    }

    public String getQuestion() {
        return question;
    }

    public String getChoices() {
        return choices;
    }

    public String getAnswer() {
        return answer;
    }

    public String getCategory(){return category;}

    public int getCompletion(){return completion;}

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setChoices(String choices) { this.choices = choices; }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setCompletion(int completion) {
        this.completion = completion;
    }

    public void setCategory(String category){this.category=category;}
}

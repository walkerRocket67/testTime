import java.util.ArrayList;

public class Question {

    private Integer value;
    private String name;
    private ArrayList<Question> questions = new ArrayList<Question>();
    private String answer;

    public Question(Integer value, String name, ArrayList<Question> questions, String answer) {
        this.value = value;
        this.name = name;
        this.questions = questions;
        this.answer = answer;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }


}

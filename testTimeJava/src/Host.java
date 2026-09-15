import java.util.ArrayList;
import java.util.List;

public class Host {

    private List<Question> currentTest;
    private int currentQuestionIndex;

    public Host() {
        this.currentTest = new ArrayList<>();
        this.currentQuestionIndex = 0;
    }

    public void selectTest(List<Question> testQuestions) {
        this.currentTest = testQuestions;
        this.currentQuestionIndex = 0;
    }

    public void startTest() {
        this.currentQuestionIndex = 0;
        System.out.println("Test started! Total questions: " + currentTest.size());
    }

    public Question nextQuestion() {
        if (currentQuestionIndex < currentTest.size()) {
            Question q = currentTest.get(currentQuestionIndex);
            currentQuestionIndex++;
            return q;
        }
        return null;
    }
}
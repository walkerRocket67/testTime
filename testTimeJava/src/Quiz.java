import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private String id;
    private String title;
    private String description;
    private String joinCode;      // passed in, not generated
    private String qrCode;        // passed in, not generated
    private String link;
    private List<Question> questions;

//    parameterized constructor called in main, pass values
    public Quiz(String title, String joinCode, String qrCode, String link) {
        this.title = title;
        this.joinCode = joinCode;
       this.qrCode = qrCode;
       this.link = link;
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJoinCode() {
        return joinCode;
    }

    public void setJoinCode(String joinCode) {
        this.joinCode = joinCode;
    }

    public String getQrCode() {
        return qrCode;
    }

    public String getId() {
        return id;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    

}

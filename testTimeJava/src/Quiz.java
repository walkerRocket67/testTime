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
//        this.qrCode = qrCode;
//        this.link = link;
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public List<Question> getQuestions() {
        return questions;
    }
}

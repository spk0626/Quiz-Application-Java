package quiz.application;

public class Question {
    private String questionNumber;
    private String questionText;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String correctOption;

    public Question(String questionNumber, String questionText, String option1, String option2, String option3, String option4, String correctOption) {
        this.questionNumber = questionNumber;
        this.questionText = questionText;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.correctOption = correctOption;
    }

    public String getQuestionNumber() {
        return questionNumber;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public String getCorrectOption() {
        return correctOption;
    }
}


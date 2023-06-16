package quizapplication;

import java.util.ArrayList;

public class Question {

	private String questionText;
	private ArrayList<String> answers;
	private int NumOfAnswers;
	private char letters;

	public Question(String questionText, int NumOfAnswers) {
		answers = new ArrayList<String>();
		this.questionText = questionText;
		this.NumOfAnswers = NumOfAnswers;
		letters = 'a';

	}

	public String getQuestionText() {
		return questionText;
	}

	public void addAnswer(String answer) {
		answers.add(answer);
	}

	public int getNumOfAnswers() {
		return NumOfAnswers;
	}

	public void getFormattedAnswer() {
		lettersReset();
		String fullAnswer = questionText;

		for (int index = 0; index < answers.size(); index++) {
			fullAnswer += "\n";
			fullAnswer += letters;
			fullAnswer += ") ";
			fullAnswer += answers.get(index);
			letters += 1;

		}
		System.out.println(fullAnswer);
	}

	private void lettersReset() {
		letters = 'a';
	}

}

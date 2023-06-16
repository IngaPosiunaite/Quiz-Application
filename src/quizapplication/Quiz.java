package quizapplication;

import java.util.HashMap;

public class Quiz {

	private HashMap<String, Question> quiz;
	private Question question;

	public Quiz() {
		quiz = new HashMap<String, Question>();
	}

	public int getSizeQuiz() {
		return quiz.size();
	}

	public void addQuestion(String code, Question question) {
		quiz.put(code, question);
	}

	public void removeQuestion(String code) {
		quiz.remove(code);
	}

	public void replaceQuestion(String code, Question newQuestion) {
		quiz.replace(code, newQuestion);
	}

	public Question getQuestion(String code) {
		return quiz.get(code);
	}

	public HashMap<String, Question> getQuiz() {
		return quiz;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

}

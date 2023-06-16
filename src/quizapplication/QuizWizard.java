package quizapplication;

public class QuizWizard {

	private InputReader reader;
	private Quiz quiz;
	private String owner;
	private String ModRef;

	public QuizWizard() {
		reader = new InputReader();
		quiz = new Quiz();
	}

	public void setInputReader(String pass) {
		reader = new InputReader(pass);
	}

	public InputReader getInputReader() {
		return reader;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void createQuiz() {
		boolean leave = false;
		printWelcome();
		printInstructions();

		while (!leave) {
			String command = reader.getText("Please add your questions");
			if (command.equals("add")) {
				boolean addAnotherQuestion = true;
				while (addAnotherQuestion) {
					addQuestion();
					String anotherQuestion = reader.getText("Would you like to add another question?");
					if (anotherQuestion.equals("no")) {
						addAnotherQuestion = false;
						leave = true;
						printGoodBye();
					}

				}
			}
		}

	}

	public void addQuestion() {
		String questionText = reader.getText("Please enter your question");
		int NumOfAnswers = reader.getNumber("Please add your answer");
		Question question = new Question(questionText, NumOfAnswers);

		for (int index = 0; index < NumOfAnswers; index++) {

			String answer = reader.getText("Please enter your answer");
			question.addAnswer(answer);
		}

		String code = reader.getText("Enter your code");
		quiz.addQuestion(code, question);
	}

	public void printQuiz() {
		for (String code : quiz.getQuiz().keySet()) {
			System.out.println(code);
			System.out.println(quiz.getQuestion(code));
		}
	}

	public void setOwner(String newOwner) {
		owner = newOwner;
	}

	public void setModRef(String newModRef) {
		ModRef = newModRef;
	}

	public String getOwner() {
		return owner;
	}

	public String getModRef() {
		return ModRef;
	}

	private void printWelcome() {
		System.out.println("Welcome to the Quiz!");
		System.out.println("Add your questions and answers!");
	}

	public void printInstructions() {
		System.out.println("You can add, replace, remove your questions and answers");
	}

	private void printGoodBye() {
		System.out.println("Thank you!");
	}

}

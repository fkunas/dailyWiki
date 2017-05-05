package dailyWiki;

import wiki.rest.WikiRestCommunicator;

public class Main {

	public static void main(String[] args) {
		System.out.println("Getting a random article now!");
		WikiRestCommunicator communicator = new WikiRestCommunicator();
		String title = communicator.getRandomArticleSummary().getItems().get(0).getTitle();
		System.out.println(title);
		String description = communicator.getSummaryForArticle(title).getDescription();
		System.out.println(description);

	}

}

package wiki.rest;

import wiki.rest.objects.ArticleList;
import wiki.rest.objects.ArticleSummary;

public class WikiRestCommunicator {
	WikiHttpHandler httpHandler = new WikiHttpHandler();
	
	public ArticleList getRandomArticleSummary(){
		return httpHandler.getRandomArticle();
	}
	
	public ArticleSummary getSummaryForArticle(String articleTitle){
		return httpHandler.getSummaryForArticle(articleTitle);	
	}
}

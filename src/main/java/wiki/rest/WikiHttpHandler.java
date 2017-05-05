package wiki.rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import wiki.rest.objects.ArticleList;
import wiki.rest.objects.ArticleSummary;

public class WikiHttpHandler {
	Gson gson = new GsonBuilder().serializeNulls().create();
	
	public ArticleList getRandomArticle() {
		try {
			HttpClient httpClient = HttpClients.custom()
	        .setDefaultRequestConfig(RequestConfig.custom()
	            .setCookieSpec(CookieSpecs.STANDARD).build())
	        .build();
			
			HttpGet request = new HttpGet("https://en.wikipedia.org/api/rest_v1/page/random/title");
			HttpResponse response;
			response = httpClient.execute(request);
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			String line = rd.readLine();
			ArticleList articleList = gson.fromJson(line, ArticleList.class);
			
			return articleList;
			
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public ArticleSummary getSummaryForArticle(String articleTitle){
		try {
			HttpClient httpClient = HttpClients.custom()
	        .setDefaultRequestConfig(RequestConfig.custom()
	            .setCookieSpec(CookieSpecs.STANDARD).build())
	        .build();
			
			HttpGet request = new HttpGet("https://en.wikipedia.org/api/rest_v1/page/summary/" + articleTitle);
			HttpResponse response;
			response = httpClient.execute(request);
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			String line = rd.readLine();
			ArticleSummary articleSummary = gson.fromJson(line, ArticleSummary.class);
			
			return articleSummary;
			
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

}

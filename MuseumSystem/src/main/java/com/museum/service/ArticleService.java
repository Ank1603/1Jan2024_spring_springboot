package com.museum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.museum.dao.ArticleRepository;
import com.museum.entity.Article;

@Service
public class ArticleService {

	@Autowired
	private ArticleRepository articleRepo;
	
	public Article addArticle(Article article)
	{
		//article coming from client
		Article savedArticle = articleRepo.save(article);
		//it retrieve the object that is saved in the database-->object save here
		return savedArticle;
	}
}

package com.museum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.museum.entity.Article;
import com.museum.service.ArticleService;

@RestController
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	private ArticleService articleService;

	// http://localhost:8085/article/add
//	@PostMapping("/add")
	@RequestMapping("/add")
	public ResponseEntity<?> addArticle(@RequestBody Article article) {
		try {
			Article savedArticle = articleService.addArticle(article);
			return new ResponseEntity<>(savedArticle, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}

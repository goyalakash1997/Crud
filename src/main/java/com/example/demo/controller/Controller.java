package com.example.demo.controller;

import Document.Article;
import com.example.demo.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    ArticleRepository articleRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/article")
    List<Article> getArticle(){
        //return "Hello";
       return articleRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/article")
    void postArticle(@RequestBody Article article){
        articleRepository.save(article);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/article/{id}")
    void updateArticle(@RequestBody Article article){
        articleRepository.save(article);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/article/{id}")
    void deleteArticle(@PathVariable String id){
        articleRepository.deleteById(id);
    }
}

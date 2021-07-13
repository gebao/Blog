package com.bao.ssm.blog.mapper;

import com.bao.ssm.blog.BaseTest;
import com.bao.ssm.blog.entity.Article;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author bao
 */
//@Component
public class ArticleMapperTest extends BaseTest {

    @Autowired
    private ArticleMapper articleMapper;

    @Test
    public void countArticleView() {
        int result = articleMapper.countArticleView();
        System.out.println(result);
    }

    @Test
    public void listArticle() {
        List<Article> articleList = articleMapper.listArticle();
        System.out.println(articleList);
    }
}

package net.yggdrasill501.portfolio.service;

import net.yggdrasill501.portfolio.model.BlogPost;
import net.yggdrasill501.portfolio.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BlogPostService {
    @Autowired
    private BlogPostRepository blogPostRepository;

    public List<BlogPost> getAllBlogPosts() {
        return blogPostRepository.findAll();
    }

}

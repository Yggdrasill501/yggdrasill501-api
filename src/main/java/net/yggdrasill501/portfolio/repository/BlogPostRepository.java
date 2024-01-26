package net.yggdrasill501.portfolio.repository;

import net.yggdrasill501.portfolio.model.BlogPost;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BlogPostRepository extends MongoRepository<BlogPost, String> {
    // Additional query methods if required
}

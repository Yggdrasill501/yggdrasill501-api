package net.yggdrasill501.portfolio.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "blog_posts")
public class BlogPost {
    @Id
    private String id;
    private String title;
    private String content; // Markdown or HTML content
    private Date date;
    private String author;
}
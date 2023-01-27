package com.saidur.bookstore.service;

import com.saidur.bookstore.model.Author;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

    public List<Author> getAuthors() {
        List<Author> authors = new ArrayList<>();
        Author author1 = new Author(1, "https://i.pinimg.com/736x/8d/f7/c8/8df7c8f673c3b7914d799592cea2a67e.jpg",
                "Test 1", "Test description 1");

        Author author2 = new Author(2, "https://imgv3.fotor.com/images/blog-cover-image/10-profile-picture-ideas-to-make-you-stand-out.jpg",
                "Test 2", "Test description 2");

        authors.add(author1);
        authors.add(author2);

        return authors;
    }

    public List<Author> searchedAuthors(String authorName) {
        List<Author> authors = new ArrayList<>();
        Author author1 = new Author(1, "https://i.pinimg.com/736x/8d/f7/c8/8df7c8f673c3b7914d799592cea2a67e.jpg",
                authorName, "Test description 1");

        authors.add(author1);

        return authors;
    }

}

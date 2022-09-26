package com.herter.workshop.domain;

import com.herter.workshop.dto.AuthorDTO;
import com.herter.workshop.dto.CommentDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<CommentDTO> lis = new ArrayList<>();

    @Id
    private String id;
    private AuthorDTO author;
    private Date date;
    private String title;
    private String body;

    private List<CommentDTO> comments = new ArrayList<>();

    public Post(String id, AuthorDTO authorDTO, Date date, String title, String body) {
        this.id = id;
        this.author = authorDTO;
        this.date = date;
        this.title = title;
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return id.equals(post.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

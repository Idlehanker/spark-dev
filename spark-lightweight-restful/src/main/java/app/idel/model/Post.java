package app.idel.model;

import java.util.List;

import lombok.Data;

@Data
class Post {
    private int id;
    private String title;
    private List categories;
    private String content;
}

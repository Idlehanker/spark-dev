package app.idel.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// In a real application you may want to use a DB, for this example we just
// store the posts in memory
public class Model {
    
    private int nextId = 1;
    private Map<Integer,Post> posts = new HashMap<>();

    public int createPost(String title, String content, List<Post> categories) {
        
        int id = nextId++;
        Post post = new Post();

        post.setId(id);
        post.setTitle(title);
        post.setContent(content);
        post.setCategories(categories);
        posts.put(id, post);

        return id;
    }

    public List<Post> getAllPosts() {
        return (List<Post>) posts.keySet().stream().sorted().map(
            (id) -> posts.get(id)
            ).collect(Collectors.toList());
    }
}
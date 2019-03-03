package app.idel.model;

import java.util.LinkedList;
import java.util.List;

import lombok.Data;

@Data
public class NewPostPayload {
    
    private String title;
    private List categories = new LinkedList<>();
    private String content;

    public boolean isValid() {
        return title != null && !title.isEmpty() && !categories.isEmpty();
    }
}

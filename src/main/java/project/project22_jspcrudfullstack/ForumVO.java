package project.project22_jspcrudfullstack;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public class ForumVO {
    @Getter @Setter
    private int id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String title;
    @Getter @Setter
    private String phone;
    @Getter @Setter
    private String post_type;
    @Getter @Setter
    private String user_type;
    @Getter @Setter
    private LocalDateTime add_date;

    public ForumVO(){
        this.name = ""; this.title = ""; this.phone = ""; this.post_type = ""; this.user_type = "";
    }

    public ForumVO(int id, String name, String title, String phone, String post_type, String user_type){
        this.id = id;
        this.name = name;
        this.title = title;
        this.phone = phone;
        this.post_type = post_type;
        this.user_type = user_type;
    }

    public ForumVO(int id, String name, String title, String phone, String post_type, String user_type, LocalDateTime add_date){
        this.id = id;
        this.name = name;
        this.title = title;
        this.phone = phone;
        this.post_type = post_type;
        this.user_type = user_type;
        this.add_date = add_date;
    }
}

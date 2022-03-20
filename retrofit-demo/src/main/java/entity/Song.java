package entity;

import javafx.scene.NodeBuilder;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Song {
    private int id;
    private int account_id;
    private String nameSong;
    private String singer;
    private String thumbnail;
    private String message;
    private String create_at;
    private String update_at;
    private  int status;


}

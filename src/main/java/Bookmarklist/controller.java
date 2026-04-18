package Bookmarklist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {

    @GetMapping("/")
    public List<bookmarkEntry> getAllBookmarks() {
        return List.of(
                new bookmarkEntry("Youtube"),
                new bookmarkEntry("Facebook"),
                new bookmarkEntry("Instagram"),
                new bookmarkEntry("HTW-Berlin")
        );
    }

}

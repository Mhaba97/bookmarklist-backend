package Bookmarklist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class BookmarkController {

    @GetMapping("/api")
    public List<BookmarkEntry> getAllBookmarks() {
        return List.of(
                new BookmarkEntry("Youtube"),
                new BookmarkEntry("Facebook"),
                new BookmarkEntry("Instagram"),
                new BookmarkEntry("HTW-Berlin")
        );
    }
}
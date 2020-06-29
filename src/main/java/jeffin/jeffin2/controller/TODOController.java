package jeffin.jeffin2.controller;

import jeffin.jeffin2.entity.TodoItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/todo")
public class TODOController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TODOController.class);

    private List<TodoItem> items = new ArrayList<>();

    @PostMapping
    public void create(@RequestBody TodoItem item) {
        LOGGER.info("item received: {}", item);
        items.add(item);
        LOGGER.info("item added successfully: {}", item);
    }

    @GetMapping
    public List<TodoItem> list() {
        return items;
    }

}

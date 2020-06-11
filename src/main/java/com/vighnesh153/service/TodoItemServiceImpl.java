package com.vighnesh153.service;

import com.vighnesh153.model.TodoData;
import com.vighnesh153.model.TodoItem;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
public class TodoItemServiceImpl implements TodoItemService {
    @Getter
    private final TodoData data = new TodoData();

    @Override
    public void addItem(TodoItem newItem) {
        data.addItem(newItem);
    }

    @Override
    public void removeItem(int id) {
        data.removeItem(id);
    }

    @Override
    public TodoItem getItem(int id) {
        return data.getItem(id);
    }

    @Override
    public void updateItem(TodoItem item) {
        data.updateItem(item);
    }
}

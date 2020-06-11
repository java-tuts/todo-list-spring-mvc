package com.vighnesh153.service;

import com.vighnesh153.model.TodoData;
import com.vighnesh153.model.TodoItem;

public interface TodoItemService {
    void addItem(TodoItem newItem);
    void removeItem(int id);
    TodoItem getItem(int id);
    void updateItem(TodoItem item);
    TodoData getData();
}

package com.senlainc.service;

import com.senlainc.model.Comment;

public interface CommentService {
    void save(Comment comment);
    void update(Comment comment, int id);
    Comment getCommentById(int id);
    void delete(int id);
}

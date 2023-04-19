package com.senlainc.repository;

import com.senlainc.model.Comment;

public interface CommentRepository {
    public void save(Comment comment);
    public void update(Comment comment, int id);

    public Comment findById(int id);

    public void delete(int id);
}

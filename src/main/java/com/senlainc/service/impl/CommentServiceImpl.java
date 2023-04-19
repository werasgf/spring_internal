package com.senlainc.service.impl;

import com.senlainc.model.Comment;
import com.senlainc.repository.CommentRepository;
import com.senlainc.repository.impl.CommentRepositoryImpl;
import com.senlainc.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository = new CommentRepositoryImpl();


    @Override
    public void save(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void update(Comment comment, int id) {
        commentRepository.update(comment, id);
    }

    @Override
    public Comment getCommentById(int id) {
        return commentRepository.findById(id);
    }

    @Override
    public void delete(int id) {
        commentRepository.delete(id);
    }
}

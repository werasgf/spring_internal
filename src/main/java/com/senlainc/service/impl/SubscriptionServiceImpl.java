package com.senlainc.service.impl;

import com.senlainc.model.Subscription;
import com.senlainc.repository.SubscriptionRepository;
import com.senlainc.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Autowired
    SubscriptionRepository subscriptionRepository;

    @Override
    public void save(Subscription subscription) {
        subscriptionRepository.save(subscription);
    }

    @Override
    public void update(Subscription subscription, int id) {
        subscriptionRepository.update(subscription, id);
    }

    @Override
    public Subscription getCSubscriptionById(int id) {
        return subscriptionRepository.findById(id);
    }

    @Override
    public void delete(int id) {
        subscriptionRepository.delete(id);
    }
}

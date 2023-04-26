package com.senlainc.service;

import com.senlainc.model.Subscription;

public interface SubscriptionService {
    void save(Subscription subscription);
    void update(Subscription subscription, int id);
    Subscription getCSubscriptionById(int id);
    void delete(int id);
}

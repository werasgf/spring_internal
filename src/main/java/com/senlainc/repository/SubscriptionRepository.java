package com.senlainc.repository;

import com.senlainc.model.Subscription;

public interface SubscriptionRepository {
    public void save(Subscription subscription);
    public void update(Subscription subscription, int id);

    public Subscription findById(int id);

    public void delete(int id);
}

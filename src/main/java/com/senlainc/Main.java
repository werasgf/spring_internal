package com.senlainc;

import com.senlainc.config.Application;
import com.senlainc.config.ApplicationContext;
import com.senlainc.model.Cinema;
import com.senlainc.model.Concierge;
import com.senlainc.model.ConciergeImpl;
import com.senlainc.model.WorkToCinema;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = Application.run("com.senlainc", new HashMap<>(Map.of(Concierge.class, ConciergeImpl.class)));
        WorkToCinema workToCinema = context.getObject(WorkToCinema.class);
        workToCinema.start(new Cinema());
    }
}

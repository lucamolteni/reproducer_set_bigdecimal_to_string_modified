package com.example.reproducer;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;


public class DroolsTest {

    public static final void main(String[] args) {
        try {
            KieServices kServices = KieServices.Factory.get();
            KieContainer kContainer = kServices.getKieClasspathContainer();
            KieSession kSession = kContainer.newKieSession();

            Fact f = new Fact(new BigDecimal(300), "300");
            kSession.insert(f);


            System.out.println("***** start");
            kSession.fireAllRules();
            System.out.println("***** end");

            kSession.dispose();

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}


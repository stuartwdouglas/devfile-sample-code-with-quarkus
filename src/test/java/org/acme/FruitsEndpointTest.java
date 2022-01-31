package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.persistence.EntityManager;

@QuarkusTest
public class FruitsEndpointTest {

    @Inject
    EntityManager entityManger;

    @Test
    public void testListAllFruits() {
        Assertions.assertEquals(3, entityManger.createQuery("from Fruit").getResultList().size());
    }

}

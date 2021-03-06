package com.recombee.api_client;
/*
 This file is auto-generated, do not edit
*/


import com.recombee.api_client.api_requests.*;
import com.recombee.api_client.bindings.*;
import com.recombee.api_client.exceptions.ApiException;
import com.recombee.api_client.exceptions.ResponseException;

import java.util.HashMap;
import java.util.Date;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

public class RemoveFromSeriesTest extends RecombeeTestCase {

    @Test
    public void testRemoveFromSeries() throws ApiException {
        RemoveFromSeries req;
        Request req2;
        String  resp;
        // it 'fails when removing item which have different time'
        req = new RemoveFromSeries("entity_id","item","entity_id",0);
        try {
            this.client.send(req);
            fail("No exception thrown");
        } catch (ResponseException ex) {
            assertEquals(404,ex.getStatusCode());
        }
        // it 'does not fail when removing item that is contained in the set'
        req = new RemoveFromSeries("entity_id","item","entity_id",1);
        resp = this.client.send(req);
        // it 'fails when removing item that is not contained in the set'
        req = new RemoveFromSeries("entity_id","item","not_contained",1);
        try {
            this.client.send(req);
            fail("No exception thrown");
        } catch (ResponseException ex) {
            assertEquals(404,ex.getStatusCode());
        }
    }
}

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

public class DeleteGroupTest extends RecombeeTestCase {

    @Test
    public void testDeleteGroup() throws ApiException {
        DeleteGroup req;
        Request req2;
        String  resp;
        // it 'does not fail with existing entity id'
        req = new DeleteGroup("entity_id");
        resp = this.client.send(req);
        try {
            this.client.send(req);
            fail("No exception thrown");
        } catch (ResponseException ex) {
            assertEquals(404,ex.getStatusCode());
        }
        // it 'fails with invalid entity id'
        req = new DeleteGroup("$$$not_valid$$$");
        try {
            this.client.send(req);
            fail("No exception thrown");
        } catch (ResponseException ex) {
            assertEquals(400,ex.getStatusCode());
        }
        // it 'fails with non-existing entity'
        req = new DeleteGroup("valid_id");
        try {
            this.client.send(req);
            fail("No exception thrown");
        } catch (ResponseException ex) {
            assertEquals(404,ex.getStatusCode());
        }
    }
}

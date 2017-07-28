package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Ethan on 7/27/17.
 */
public class EventLogTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void testEventNull() throws Exception {
        System.out.println("Testing that Event is not null");
        Event testEvent = new Event();
        EventLog eventLog = new EventLog();
        expected.expect(IllegalArgumentException.class);
        testEvent.setName("Fundraiser");
        testEvent.setAction("Something");
        eventLog.addEvent(testEvent);
        assertTrue(eventLog.addEvent(testEvent));
    }

    @Test
    public void testCorrectAction() throws  Exception {
        System.out.println("Testing that action contains correct value");
        Event testEvent = new Event();
        EventLog eventLog = new EventLog();
        testEvent.setName("Anything");
        testEvent.setAction("Face2Face");
        assertTrue(eventLog.addEvent(testEvent));
    }



}
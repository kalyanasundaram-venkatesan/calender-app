package com.scroller.calendar.service;

import java.util.List;

import com.scroller.calendar.model.CalendarEvent;
import com.scroller.calendar.repository.CalendarEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalendarEventService {
    @Autowired
    private CalendarEventRepository calendarEventRepository;
    public List<CalendarEvent> getAllEvents() {
        return calendarEventRepository.findAll();
    }

    public CalendarEvent save(CalendarEvent calendarEvent) {
        return calendarEventRepository.save(calendarEvent);
    }
}

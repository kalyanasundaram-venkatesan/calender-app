package com.scroller.calendar.api.controller;

import javax.validation.Valid;

import com.scroller.calendar.api.dto.CalendarEventDto;
import com.scroller.calendar.api.dto.CalendarEventsDto;
import com.scroller.calendar.api.mapper.CalendarEventDtoMapper;
import com.scroller.calendar.model.CalendarEvent;
import com.scroller.calendar.service.CalendarEventService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class CalendarEventController {
    @Autowired
    private CalendarEventService calendarEventService;
    @Autowired
    private CalendarEventDtoMapper calendarEventDtoMapper;

    private Logger logger = LoggerFactory.getLogger(CalendarEventController.class);

    @GetMapping("/calendar-events")
    @ResponseStatus(HttpStatus.OK)
    public CalendarEventsDto listAllEvents() {
        CalendarEventsDto calendarEventDto = new CalendarEventsDto().calendarEvent(calendarEventDtoMapper
                .convert(calendarEventService.getAllEvents()));
        return calendarEventDto;
    }

    @PostMapping("/calendar-events")
    @ResponseStatus(HttpStatus.CREATED)
    public CalendarEventDto createCalendarEvent(@RequestBody CalendarEvent calendarEvent) {
        return calendarEventDtoMapper.from(calendarEventService.save(calendarEvent));
    }
}

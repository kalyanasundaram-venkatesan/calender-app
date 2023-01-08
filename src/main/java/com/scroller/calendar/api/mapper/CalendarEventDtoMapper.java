package com.scroller.calendar.api.mapper;

import java.util.List;

import com.scroller.calendar.api.dto.CalendarEventDto;
import com.scroller.calendar.model.CalendarEvent;
import org.checkerframework.checker.units.qual.C;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CalendarEventDtoMapper {
    List<CalendarEventDto> convert(List<CalendarEvent> calendarEvent);
    CalendarEventDto from(CalendarEvent calendarEvent);
    CalendarEvent convertDto(CalendarEventDto calendarEventDto);
}

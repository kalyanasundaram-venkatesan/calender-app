package com.scroller.calendar.api.mapper;

import com.scroller.calendar.api.dto.CalendarEventDto;
import com.scroller.calendar.model.CalendarEvent;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-21T23:42:48+0530",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.6 (Oracle Corporation)"
)
@Component
public class CalendarEventDtoMapperImpl implements CalendarEventDtoMapper {

    @Override
    public List<CalendarEventDto> convert(List<CalendarEvent> calendarEvent) {
        if ( calendarEvent == null ) {
            return null;
        }

        List<CalendarEventDto> list = new ArrayList<CalendarEventDto>( calendarEvent.size() );
        for ( CalendarEvent calendarEvent1 : calendarEvent ) {
            list.add( from( calendarEvent1 ) );
        }

        return list;
    }

    @Override
    public CalendarEventDto from(CalendarEvent calendarEvent) {
        if ( calendarEvent == null ) {
            return null;
        }

        CalendarEventDto calendarEventDto = new CalendarEventDto();

        calendarEventDto.setId( calendarEvent.getId() );
        calendarEventDto.setName( calendarEvent.getName() );
        calendarEventDto.setStartTime( calendarEvent.getStartTime() );
        calendarEventDto.setEndTime( calendarEvent.getEndTime() );

        return calendarEventDto;
    }

    @Override
    public CalendarEvent convertDto(CalendarEventDto calendarEventDto) {
        if ( calendarEventDto == null ) {
            return null;
        }

        CalendarEvent calendarEvent = new CalendarEvent();

        return calendarEvent;
    }
}

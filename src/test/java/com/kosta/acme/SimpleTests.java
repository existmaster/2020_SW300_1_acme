package com.kosta.acme;

import com.kosta.acme.clazz.Clazz;
import com.kosta.acme.clazz.ClazzDay;
import com.kosta.acme.clazz.ClazzStatus;
import com.kosta.acme.course.Course;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleTests {

    Course SW300코스;

    @BeforeEach
    public void setup(){
        SW300코스 = new Course();
    }

    @Test
    public void 신규클래스_강의개설여부를확인하는테스트(){
        //Given
        Clazz 지금막만든클래스 = new Clazz(SW300코스, ClazzStatus.CREATED);
        //When
        boolean 신규클래스개설가능여부 = 지금막만든클래스.isCanOpen();
        //Then
        assertFalse(신규클래스개설가능여부);
    }
    @Test
    public void 강의배정클래스_강의개설여부를확인하는테스트(){
        //Given
        Clazz 강의일이예정된클래스 = new Clazz(SW300코스, ClazzStatus.CREATED);
        LocalDate 날짜 = LocalDate.now();
        ClazzDay 오늘 = new ClazzDay(날짜);
        //When
        강의일이예정된클래스.setClazzDay(오늘);
        boolean 강의일배정클래스개설가능여부 = 강의일이예정된클래스.isCanOpen();
        //Then
        assertTrue(강의일배정클래스개설가능여부);
    }
    @Test
    public void ClazzDay_날짜입출력테스트(){
        //Given
        ClazzDay 수업날짜 = new ClazzDay();
        //When
        LocalDate 특정날짜 = LocalDateTime.now().toLocalDate();
        수업날짜.setDate(특정날짜);
        //Then
        assertEquals(특정날짜, 수업날짜.getDate());
        //내가 넣은 날짜랑, 수업의 날짜가 같냐?

    }
    @Test
    public void 클래스가현재보다이전날짜일때_강의개설여부를확인하는테스트(){
        //Given
        Clazz 강의일이예정된클래스 = new Clazz(SW300코스, ClazzStatus.CREATED);
        ClazzDay 과거날짜 = new ClazzDay();
        과거날짜.setDate(LocalDate.of(2000, 1, 1));
        //When
        강의일이예정된클래스.setClazzDay(과거날짜);
        boolean 강의일배정클래스개설가능여부 = 강의일이예정된클래스.isCanOpen();
        //Then
        assertFalse(강의일배정클래스개설가능여부);
    }

}

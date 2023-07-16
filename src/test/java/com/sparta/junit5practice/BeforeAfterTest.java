package com.sparta.junit5practice;

import org.junit.jupiter.api.*;

public class BeforeAfterTest {

    @BeforeEach
    void setUp() {
        System.out.println("각각의 테스트코드가 실행 되기 전 실행");
    }

    @AfterEach
    void tearDown() {
        System.out.println("각각의 테스트코드가 실행 된 후에 실행");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("모든 테스트 코드가 실행되기 최초로 실행");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("모든 테스트코드가 수행된 후 마지막으로 실행");
    }

    @Test
    void test1(){
        System.out.println("테스트 코드 작성1");
    }
    @Test
    void test2(){
        System.out.println("테스트 코드 작성2");
    }


















}

package com.jenkins.jenkinspractice;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HelloServiceTest {
  private final HelloService helloService = new HelloService();

  @Test
  @DisplayName("인사 응답 테스트")
  public void testHello() {
    String name = "Micky";

    String message = helloService.sayHello(name);
    assertEquals("Hello " + name + "!", message);
  }


}

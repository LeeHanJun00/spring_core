package hello.core.beanfind;

import hello.core.AppConfig;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationContextBasicFindTest {
  AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

  @Test
  @DisplayName("빈 이름으로 조회")
  void findBeanByName() {
    OrderService orderService1 = ac.getBean("orderService", OrderService.class);
    OrderService orderService2 = ac.getBean("orderService", OrderServiceImpl.class);

    assertThat(orderService2).isInstanceOf(OrderServiceImpl.class);

  }
}

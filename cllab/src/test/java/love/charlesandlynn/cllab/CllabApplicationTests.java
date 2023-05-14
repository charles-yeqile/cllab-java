package love.charlesandlynn.cllab;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CllabApplicationTests {
  protected Logger logger = LoggerFactory.getLogger(this.getClass());

  @Test
  void contextLoads() {
    logger.info("contextLoads");
  }

}

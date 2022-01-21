package arthur.kim.springkafka;

import java.io.IOException;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
  
  @KafkaListener(topics = "quickstart-events", groupId = "foo")
  public void consume(String message) throws IOException {
    System.out.println(String.format("Consumed message : %s", message));
  }
}

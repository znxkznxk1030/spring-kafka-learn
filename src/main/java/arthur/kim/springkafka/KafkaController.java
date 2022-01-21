package arthur.kim.springkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
  private final KafkaProducer producer;

  @Autowired
  public KafkaController(KafkaProducer kafkaProducer) {
    this.producer = kafkaProducer;
  }

  @PostMapping
  public String sendMessage(@RequestParam("message") String message) {
    this.producer.sendMessage(message);
    return "success";
  }

}

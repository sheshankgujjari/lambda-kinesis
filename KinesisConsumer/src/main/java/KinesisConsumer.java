import java.io.IOException;

import com.amazonaws.services.lambda.runtime.events.KinesisEvent;
import com.amazonaws.services.lambda.runtime.events.KinesisEvent.KinesisEventRecord;

public class KinesisConsumer {
  public String handleRequest(KinesisEvent event) throws IOException {

    System.out.println("Record Size - " + event.getRecords().size());
    for(KinesisEventRecord rec : event.getRecords()) {
      System.out.println(new String(rec.getKinesis().getSequenceNumber()));
      System.out.println(new String(rec.getKinesis().getData().array()));
    }
    return "success";
  }
}
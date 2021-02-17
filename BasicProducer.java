
//Development A Basic Producer in Java for Kafka Producer API

package clients;

import java.utils.Properties;
import org.apache.kafka.clients.producer.kafkaProducer;
import org.apache.kafke.clients.producer.ProducerRecord;

public class BasicProducer {
	public static void main(String[] args) {
		System.out.println("***Starting Basic Producer***");
		//Configuration
		Properties settings = new Properties();
		settings.put("client.id", "basic-producer-v0.1.0");
		settings.put("bootstrap.servers", "kafka-1:9092");
		settings.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		//Create Producer
		final KafkaProducer<String, String> producer = new KafkaProducer<>(settings);
		//Shutdown behaviour
		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			System.out.println("### Stopping Basic Producer ###");
			producer.close();
		}));
		//Sending Data
		final String topic = "hello_world_topic";
		for(int i=1; i<=5; I++) {
			final String key = "key-" + i;
			final String value = "value-" + i;
			final ProducerRecord<String, String> record = new ProducerRecord<>(topic, key, value);
			producer.send(record);
		}
	}
}

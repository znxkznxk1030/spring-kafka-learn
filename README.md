# spring-kafka-learn

## Kafka Quick Start

<https://kafka.apache.org/quickstart>
<https://www.apache.org/dyn/closer.cgi?path=/kafka/3.0.0/kafka_2.13-3.0.0.tgz>

```bash
## STEP 1: GET KAFKA
tar -xzf kafka_2.13-3.0.0.tgz
cd kafka_2.13-3.0.0

## STEP 2: START THE KAFKA ENVIRONMENT
# Start the ZooKeeper service
bin/zookeeper-server-start.sh config/zookeeper.properties

# Start the Kafka broker service
# listeners=PLAINTEXT://localhost:9092 | https://stackoverflow.com/questions/47677549/kafka-zookeeper-connection-to-node-1-could-not-be-established-broker-may-no
bin/kafka-server-start.sh config/server.properties

## STEP 3: CREATE A TOPIC TO STORE YOUR EVENTS
# Option zookeeper is deprecated, use --bootstrap-server instead.
bin/kafka-topics.sh --create --partitions 1 --replication-factor 1 --topic quickstart-events --bootstrap-server localhost:9092
```

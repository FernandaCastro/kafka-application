# Simple Kafka Application

The idea here is to learn the basic about Kafka.

#### Write and Read Events to/from a Topic

- A ```Topic``` called ***"message-topic*** accepts ```Messages```.

- A ```Message``` contains Text and DateTime attributes.

- A ```KafkaListener``` processes the ```Message``` writing it to the console.

- A POST request to a REST Service adds a ```Message``` to the ```Topic```.


## How to run it?

### 1. Download and extract Kafka 

Start a basic Kafka environment in different terminal sessions

##### a. Start ZooKeeper Service

      ```$ bin/zookeeper-server-start.sh config/zookeeper.properties``` 

##### b. Start Kafka Broker Service 
      ```$ bin/kafka-server-start.sh config/server.properties``` 

### 2. Compile the application
    ```mvn clean package```

### 3. Start the application 
    ```java -jar ./target/kafka-application-1.0-SNAPSHOT.jar```

### 4. Send requests to the REST service
```
POST /message
{
    "message": "My first message sent!"
}
```

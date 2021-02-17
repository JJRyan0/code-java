# @JJRyan0 - kafka comand line - Mac OS 

#How to set up a Kafke cluster and create a set of topics.
#How to create a message for the producer.
#How to send a message to consumer for retrieval 


#Kafke and Zookeeper start 

#Install kafka/zookeeper using brew and start servers:

% brew install kafka
% brew install zookeeper

#Start/Stop zookeeper
% zkServer start
% zkServer stop

#Start/Stop Kafka
%brew services start kafka
% brew services stop kafka

#How to create a single topic 
% kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test one

#how to list out current topics
 % cd /usr/local/Cellar/kafka/2.7.0/libexec/bin
 bin % kafka-topics --list --zookeeper localhost:2181
test


#add a max config message to a topic:
% kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --config max.message.bytes=64000 --topic delete_this_topic 

#Delete max config from a topic: 
% kafka-topics --alter --zookeeper localhost:2181 --topic delete_this_topic --delete-config max.message.bytes

#Open a new terminal window and create a producer to create messages
 % kafka-console-producer --broker-list localhost:9092 --topic providerdim
>Provider name
>Provider Key
>Provider description
>provider type

#Open a new terminal window and create a consumer to send messages 
 % kafka-console-consumer --bootstrap-server localhost:9092 --topic providerdim --from-beginning
Provider name
Provider Key
Provider description
provider type

# close both terminals using control + c command 

#Describe a Kafka topic to take a look at the output of the describe command
% kafka-topics --describe --zookeeper localhost:2181 --topic providerdim

Topic: providerdim	PartitionCount: 1	ReplicationFactor: 1	Configs: 
	Topic: providerdim	Partition: 0	Leader: 0	Replicas: 0	Isr: 0

# Delete topic and list new topic list
% kafka-topics --zookeeper localhost:2181 --delete --topic delete_this_topic
Topic delete_this_topic is marked for deletion. Note: This will have no impact if delete.topic.enable is not set to true.
% kafka-topics --list --zookeeper localhost:2181
__consumer_offsets
providerdim
test

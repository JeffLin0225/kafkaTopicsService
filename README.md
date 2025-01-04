＊＊＊ 依照不同的 Topic 可以讓不同的微服務依照 Kafka Consumer 接收參數 （ 以上面的 KafkaService 作為中介 ）  ＊＊＊

==== Commendline =====

新增Topic指令：
.\bin\windows\kafka-topics.bat --create --topic emailmaker-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1

.\bin\windows\kafka-topics.bat --create --topic savedb-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1

.\bin\windows\kafka-topics.bat --create --topic sender-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1

檢查
.\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092


新增Topic指令：
.\bin\windows\kafka-topics.bat --create --topic emailmaker-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1

.\bin\windows\kafka-topics.bat --create --topic savedb-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1

.\bin\windows\kafka-topics.bat --create --topic sender-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1

檢查
.\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092


mvn clean
mvn package
java -cp /usr/hdp/current/hbase-client/lib/*:/usr/hdp/current/hadoop-client/client/*:target/hbase-0.0.1-SNAPSHOT.jar MyLittleHBaseClient

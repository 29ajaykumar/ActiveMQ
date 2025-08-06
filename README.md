Download ActiveMQ 
Extract it
Go to bin
open CMD here
run cmd-> activemq start
ex->[C:\WD\Java Practice\apache-activemq-6.1.7\bin>activemq start]
now need to change spring.activemq.broker-url property value of both app ActiveMqConsumer and ActiveMqProducer in application.properties file by your ipv4
spring.activemq.broker-url=tcp://ipv4:61616
spring.activemq.broker-url=tcp://192.168.27.106:61616

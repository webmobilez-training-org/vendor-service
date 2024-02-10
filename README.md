

**Event Driven Architecture Example with RabbitMQ:**
**Prerequistie:**
      docker desktop
      java17

**follow the steps to create rabbitmq instance in docker:**
1. docker pull rabbitmq
2. docker run -d --name some-rabbit -p 5672:5672 -p 5673:5673 -p 15672:15672 rabbitmq:3-management  
3. open this url in browser http://localhost:15672/
4. Default username - guest and Password - guest

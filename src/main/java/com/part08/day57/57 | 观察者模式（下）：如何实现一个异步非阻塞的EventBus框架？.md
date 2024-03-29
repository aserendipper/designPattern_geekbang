## 57 | 观察者模式（下）：如何实现一个异步非阻塞的EventBus框架？
### 一、异步非阻塞观察者模式的简易实现
1、实现方式一：在观察者方法中，新建一个线程处理代码。频繁地创建和销毁线程比较耗时，并且并发线程数无法控制，创建过多的线程会导致堆栈溢出。  
2、实现方式二：在被观察者方法中，利用线程池去执行观察者的代码。尽管利用线程池解决了第一种实现方式的问题，但线程池、异步执行逻辑都耦合在被观察者代码中，增加了业务代码的维护成本。  
3、框架的作用是：隐藏实现细节，降低开发难度，做到代码复用，解耦业务与非业务代码，让程序员聚焦业务开发。

### 二、EventBus框架功能需求介绍
1、Google Guava EventBus是一个EventBus框架，不仅支持异步非阻塞模式，同时也支持同步阻塞模式。  
2、Guava EventBus的几个主要类和函数：  
(1)EventBus：Guava EventBus对外暴露的所有可调用接口，都封装在EventBus类中，其中EventBus实现了同步阻塞的观察者模式，AsyncEventBus继承自EventBus，提供了异步非阻塞的观察者模式。  
(2)register()：EventBus类提供了register()函数用来注册观察者，它可以接受任何类型(object)的观察者。  
(3)unregister()：unregister()函数用来从EventBus中删除某个观察者。  
(4)post()：post()函数用来给观察者发送消息。当调用post()函数时，并非把消息发送给所有的观察者，而是发送给可匹配的观察者(能接收的消息类型是发送消息类型的父类)。  
(5)@Subscribe注解：EventBus通过@Subscribe注解来标明，某个函数能接收哪种类型的消息。

### 三、手把手实现一个EventBus框架
1、最关键的一个数据结构是Observer注册表，记录了消息类型和可接收消息函数的对应关系。当调用register()函数注册观察者的时候，EventBus通过解析@Subscribe注解，生成Observer注册表。当调用post()函数发送消息的时候，EventBus通过注册表找到相应的可接收消息的函数，然后通过Java的反射语法来动态地创建对象、执行函数。  
2、对于同步阻塞模式，EventBus在一个线程内依次执行相应地函数，对于异步非阻塞模式，EventBus通过一个线程池来执行相应地函数。  
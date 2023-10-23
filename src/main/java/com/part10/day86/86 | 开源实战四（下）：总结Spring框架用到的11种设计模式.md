## 86 | 开源实战四（下）：总结Spring框架用到的11种设计模式
### 一、适配器模式在Spring中的应用
1、在Spring MVC中，定义一个Controller有以下三种方式：  
(1)通过@Controller、@RequestMapping来定义。  
(2)实现Controller接口 + xml配置文件：配置DemoController与URL的对应关系。  
(3)实现Servlet接口 + xml配置文件：配置DemoController与URL的对应关系。  
2、在应用启动时，Spring容器会加载这些Controller类，并且解析出URL对应的处理函数，封装成Handler对象，存储到HandlerMapping对象中。当有请求到来的时候，DispatcherServlet从HandlerMapping中，查找请求URL对应的Handler，然后调用执行Handler对应的函数代码，最后将执行结果返回给客户端。  
3、不同方式定义的Controller，其函数的定义(函数名、入参、返回值等)是不统一的，Spring定义了统一的接口HandlerAdapter，并且对每种Controller定义了对应的适配器类，这些适配器类包括：AnnotationMethodHandlerAdapter、SimpleControllerHandlerAdapter、SimpleServletHandlerAdapter等。

### 二、策略模式在Spring中的应用
1、Spring AOP是通过动态代理来实现的，支持两种动态代理实现方式，一种是JDK提供的动态代理实现方式，另一种是Cglib提供的动态代理实现方式。针对不同的被代理类，Spring会在运行时动态地选择不同的动态代理实现方式。  
2、策略模式包含三部分，策略的定义、创建和使用。对应到Spring源码中：  
(1)AopProxy是策略接口，JdkDynamicAopProxy、CglibAopProxy是两个实现策略接口的策略类。  
(2)AopProxyFactory是一个工厂类接口，DefaultAopProxyFactory是一个默认的工厂类，用来创建AopProxy对象。

### 三、组合模式在Spring中的应用
1、在实际的开发中，一个项目有可能会用到多种不同的缓存，比如既用到Google Guava缓存，也用到Redis缓存。并且同一个缓存实例，也可以根据业务的不同，分隔成多个小的逻辑缓存单元。为了管理多个缓存，Spring提供了缓存管理功能，即CacheManager。  
2、组合模式主要应用在能表示成树形结构的一组数据上，树中的结点分为叶子节点和中间节点两类。对应到Spring源码中，EhCacheManager、SimpleCacheManager、NoOpCacheManager、RedisCacheManager等叶子节点，CompositeCacheManager表示中间节点。  
3、叶子节点包含的是它所管理的Cache对象，中间节点包含的是其他CacheManager管理器，既可以是CompositeCacheManager，也可以是具体的管理器，比如EhCacheManager等。

### 四、装饰器模式在Spring中的应用
1、缓存一般都是配合数据库来使用的，如果写缓存成功，但数据库事务回滚了，那缓存中就会有脏数据。TransactionAwareCacheDecorator增加了对事务的支持，在事务提交、回滚的时候分别对Cache的数据进行处理。  
2、TransactionAwareCacheDecorator实现Cache接口，并且将所有的操作都委托给targetCache来实现，对其中的写操作添加了事务功能。

### 五、其他模式在Spring中的应用
1、工厂模式：在Spring中，工厂模式最经典的应用莫过于实现IOC容器，对应的Spring源码主要是BeanFactory和ApplicationContext类。  
2、解释器模式：Spel是spring中常用来编写配置的表达式语言，它定义了一系列的语法规则，只要按照这些语法规则来编写表达式，Spring就能解析出表达式的含义。  
3、模板模式：只要后缀带有Template的类，基本上都是模板类，而且大部分都是用callback回调来实现的，比如JdbcTemplate、RedisTemplate等。  
4、责任链模式在Spring中的应用是拦截器，代理模式经典应用是AOP。    


## 77 | 开源实战一（下）：通过剖析Java JDK源码学习灵活应用设计模式
### 一、模板模式在Collections类中的应用
1、Collections.sort()实现了对集合的排序，为了扩展性，它将其中“比较大小”这部分逻辑，委托给用户实现。如果把这部分逻辑看作是整个排序逻辑的其中一个步骤，那就可以把它看作模板模式。

### 二、观察者模式在JDK中的应用
1、Java语言本身提供了观察者模式的框架类Observable和Observer，前者是被观察者，后者是观察者。    
2、Observer提供update接口供观察者重写。Observable类中有两个需要注意的地方，一是changed成员变量，二是notifyObservers()函数。

### 三、单例模式在Runtime类中的应用
1、JDK中的java.lang.Runtime类就是一个单例类，它使用了最简单的饿汉式单例实现方式。

### 四、其他模式在JDK中的应用汇总
1、模板模式：Java Servlet、InputStream、AbstractList等。   
2、享元模式：Integer类中的-128～127之间的整型对象是可以复用的。String类型中的常量字符串也是可以复用的。   
3、责任链模式：拦截器、过滤器这些功能绝大部分都是采用责任链模式来实现的。    
4、迭代器模式：Java中的Iterator迭代器的实现。  

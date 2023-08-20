## 58 | 模板模式（上）：剖析模板模式在JDK、Servlet、JUnit等中的应用
### 一、模板模式的原理与实现
1、Define the skeleton of an algorithm in an operation,deferring some steps to subclasses.Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.  
2、模板方法模式：模板方法模式在一个方法中定义一个算法骨架，并将某些步骤推迟到子类中实现。模板方法模式可以让子类在不改变算法整体结构的情况下，重新定义算法中的某些步骤。  
3、在模板模式经典的实现中，模板方法定义为final，可以避免被子类重写。需要子类重写的方法定义为abstract，可以强迫子类去实现。但在实际项目的开发中，模板模式实现比较灵活。  
4、模板方法模式有两大作用：复用和扩展。复用指的是所有的子类可以复用父类中提供的模板方法的代码。扩展指的是框架通过模板模式提供功能扩展点，让框架用户可以在不修改框架源码的情况下，基于扩展点定制化框架的功能。  

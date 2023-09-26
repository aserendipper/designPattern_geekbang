## 76 | 开源实战一（上）：通过剖析Java JDK源码学习灵活应用设计模式
### 一、工厂模式在Calendar类中的应用
1、Calendar类中的genInstance()方法可以根据不同TimeZone和Locale，创建不同的Calendar子类对象，比如BuddhistCalendar、JapaneseImperialCalendar、GregorianCalendar等。

### 二、建造者模式在Calendar类中的应用
1、建造者模式有两种实现方法，一种是单独定义一个Builder类，另一种是将Builder实现为原始类的内部类。Calendar采用的是内部类的方式。  
2、Calendar中Builder类的build()方法，前半部分采用的是工厂模式，根据不同的参数来创建不同的Calendar子类，后半部分采用的标准的建造者模式，根据设置不同的可选参数，定制化刚刚创建好的Calendar子类对象。

### 三、装饰器模式在Collections类中的应用
1、Collections类是一个集合容器的工具类，提供了很多静态方法，用来创建各种集合容器，比如通过unmodifiableCollection()静态方法，来创建UnmodifiableCollection类对象。容器内中的UnmodifiableCollection、CheckedCollection、SynchronizedCollection类，都是针对Collection类的装饰器类。  
2、装饰器模式中的装饰器类是对原始类功能的增强。最关键的点在于，UnmodifiableCollection的构造函数接收一个Collection类对象，然后对其所有的函数进行了包裹、重新实现或者简单封装。简单的接口实现或继承，并不会这样实现。

### 四、适配器模式在Collections类中的应用
1、enumeration()静态函数直接通过new的方式创建了匿名类对象。入参是Collection，匿名类对象通过调用iterator的方法来实现对iterator的适配。  

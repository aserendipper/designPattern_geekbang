## 55 | 享元模式（下）：剖析享元模式在Java Integer、String中的应用
### 一、享元模式在Java Integer中的应用
1、在Java Integer的实现中，-128到127之间的整型对象会被事先创建好，缓存在IntegerCache类中。当我们使用自动装箱或者valueOf()来创建这个数值区间的整型对象时，会复用IntegerCache类事先创建好的对象。这里的IntegerCache类就是享元工厂类，事先创建好的整型对象就是享元对象。

### 二、享元模式在Java String中的应用
1、在Java String类的实现中，JVM开辟一块存储区专门存储字符串常量，这块存储区叫作字符串常量池，类似于Integer中的IntegerCache。不同的是它并非事先创建好需要共享的对象，而是在程序的运行期间，根据需要来创建和缓存字符串常量。  


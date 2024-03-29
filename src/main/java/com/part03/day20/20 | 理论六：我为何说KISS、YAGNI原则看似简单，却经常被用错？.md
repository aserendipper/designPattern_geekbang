## 20 | 理论六：我为何说KISS、YAGNI原则看似简单，却经常被用错？
### 一、如何理解“KISS”原则
1、尽量保持简单。     
2、KISS原则是保持代码可读性和可维护性的重要手段。
### 二、代码行数越少就越“简单”吗？
1、代码行数越少并不代表代码越简单，还要考虑逻辑复杂度、实现难度、代码的可读性等。
### 三、代码逻辑复杂就违背KISS原则吗？
1、本身就复杂的问题，用复杂的方法解决，并不违背KISS原则。   
2、同样的代码，在某个业务场景下满足KISS原则，换一个应用场景可能就不满足了。
### 四、如何写出满足KISS原则的代码？
1、不要使用同事可能不懂的技术来实现代码。   
2、不要重复造轮子，要善于使用已经有的工具类库。   
3、不要过度优化。
### 五、YAGNI跟KISS说的是一回事吗？
1、YAGNI原则的意思是不要去设计当前用不到的功能，核心思想就是：不要做过度设计。    
2、KISS原则讲的是如何做的问题，YAGNI原则说的是要不要做的问题。    
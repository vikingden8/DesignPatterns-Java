# Strategy Pattern（策略模式）

##１、策略模式的定义
策略模式，又叫算法簇模式，就是定义了不同的算法族，并且之间可以互相替换，此模式让算法的变化独立于使用算法的客户。  

* Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from the clients that use it.  

* Capture the abstraction in an interface, bury implementation details in derived classes.

##２、策略模式的结构
![Strategy Form](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/strategy/strategy_form.png)

##３、策略模式的结构说明

这个模式涉及到三个角色：

　　●　　环境(Context)角色：持有一个Strategy的引用。

　　●　　抽象策略(Strategy)角色：这是一个抽象角色，通常由一个接口或抽象类实现。此角色给出所有的具体策略类所需的接口。

　　●　　具体策略(ConcreteStrategy)角色：包装了相关的算法或行为。

##４、策略模式的代码示例
   这里我们用支付的方式来说明策略模式的使用  
   
　　●　　首先创建策略的接口，在本示例中要支付的金额作为参数传递  
   ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/strategy/pay_01.png)
   
　　●　　然后创建三种不同的支付策略实现类，使用中国建设银行、微信和支付宝策略支付  
   ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/strategy/pay_02.png)  
   
   ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/strategy/pay_03.png)  
   
   ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/strategy/pay_04.png)
   
　　●　　实现简单的购物车逻辑，以及在其中定义一个pay方法，参数为具体的支付类型  
   ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/strategy/pay_05.png)  
   
   ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/strategy/pay_06.png)
  
　　●　　编写客户端测试类  
    ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/strategy/pay_07.png)
    
　　●　　测试输出结果  
    ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/strategy/pay_08.png)
    
##５、策略模式的使用场景
　　●　　许多相关类仅仅是行为不同。  

　　●　　需要使用一个算法的不同实现。  

　　●　　算法使用了客户不应该知道的数据。策略模式可以避免暴露复杂的、与算法相关的数据结构。  

　　●　　一个类定义了很多行为，而且这些行为在这个类里的操作以多个条件语句的形式出现。策略模式将相关的条件分支移入它们各自的 Strategy 类中以代替这些条件语句。

##６、策略模式的优点
　　●　　策略模式提供了管理相关的算法族的办法。策略类的等级结构定义了一个算法或行为族。恰当使用继承可以把公共的代码移到父类里面，从而避免代码重复。

　　●　　使用策略模式可以避免使用多重条件(if-else)语句。多重条件语句不易维护，它把采取哪一种算法或采取哪一种行为的逻辑与算法或行为的逻辑混合在一起，统统列在一个多重条件语句里面，比使用继承的办法还要原始和落后。

##７、策略模式的缺点
　　●　　客户端必须知道所有的策略类，并自行决定使用哪一个策略类。这就意味着客户端必须理解这些算法的区别，以便适时选择恰当的算法类。换言之，策略模式只适用于客户端知道算法或行为的情况。

　　●　　由于策略模式把每个具体的策略实现都单独封装成为类，如果备选的策略很多的话，那么对象的数目就会很可观。  

##8、在android中使用
　　●　　listView.setAdapter(),里面的Adapter ，一般都是自定义的Adapter ，继承自BaseAdapter ，这就是典型的策略模式，当ListView 的Item呈现不同形式，在getView方法中，就得不同的实现。  

　　●　　Animation不同动画的实现  
![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/strategy/animation_01.png)  

![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/strategy/animation_02.png)

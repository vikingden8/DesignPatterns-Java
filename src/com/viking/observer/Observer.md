# Observer Pattern (观察者模式)

## 1、观察者模式的定义 

   有时被称作发布/订阅模式，观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。这个主题对象在状态发生变化时，会通知所有观察者对象，使它们能够自动更新自己。  

## 2、观察者模式的结构  

   ![观察者模式结构图](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/observer/observer_c.png)  

## 3、观察者模式的结构说明  

   抽象主题（Subject）：它把所有观察者对象的引用保存到一个聚集里，每个主题都可以有任何数量的观察者。抽象主题提供一个接口，可以增加和删除观察者对象。

   具体主题（ConcreteSubject）：将有关状态存入具体观察者对象；在具体主题内部状态改变时，给所有登记过的观察者发出通知。

   抽象观察者（Observer）：为所有的具体观察者定义一个接口，在得到主题通知时更新自己。

   具体观察者（ConcreteObserver）：实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题状态协调。
    
## 4、观察者模式的代码示例  

   抽象观察者类，为所有具体观察者定义一个接口，在得到通知时更新自己  
   ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/observer/observer_01.png)
   
   被观察者（一个抽象类，方便扩展）  
   ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/observer/observer_02.png)
   
   具体观察者，实现抽象观察者角色所要求的更新接口，本身状态与主题状态相协调  
   ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/observer/observer_04.png)
   
   具体观察者或具体通知者，将有关状态存入具体观察者对象；在具体主题的内部状态改变时，给所有登记过的观察者发出通知;
   具体主题角色通常用一个具体子类实现  
   ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/observer/observer_03.png)
   
   编写客户端测试类  
   ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/observer/observer_05.png)
   
   测试输出结果  
   ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/observer/observer_06.png)
   
## 5、观察者模式的使用场景  

## 6、观察者模式的优点  

## 7、观察者模式的缺点  

## 8、在Android中的应用  

    
# Builder Pattern (建造者模式）

## 1、建造者模式的定义  
将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。  

## 2、建造者模式的结构  
![建造者模式结构图](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/builder/builder_01.gif)  

## 3、建造者模式的结构说明  
产品类：一般是一个较为复杂的对象，也就是说创建对象的过程比较复杂，一般会有比较多的代码量。在本类图中，产品类是一个具体的类，
而非抽象类。实际编程中，产品类可以是由一个抽象类与它的不同实现组成，也可以是由多个抽象类与他们的实现组成。  
    
抽象建造者：引入抽象建造者的目的，是为了将建造的具体过程交与它的子类来实现。这样更容易扩展。一般至少会有两个抽象方法，
一个用来建造产品，一个是用来返回产品。  
    
建造者：实现抽象类的所有未实现的方法，具体来说一般是两项任务：组建产品；返回组建好的产品。  
    
导演类：负责调用适当的建造者来组建产品，导演类一般不与产品类发生依赖关系，与导演类直接交互的是建造者类。一般来说，导演类被用来
封装程序中易变的部分。  
    
## 4、建造者模式的代码示例

一个复杂对象Product的属性如下：  
![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/builder/builder_06.png)  

三个不同的部件，为了简便，只写了部件的名字属性：  

部件一  
![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/builder/builder_03.png)   

部件二  
![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/builder/builder_04.png)  

部件三 
![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/builder/builder_05.png) 

抽象的Builder对象  
![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/builder/builder_02.png) 

具体的Builder对象   
![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/builder/builder_07.png)  
 
Director抽象类  
![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/builder/builder_08.png) 

具体的Director类  
![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/builder/builder_09.png) 

客户端类  
![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/builder/builder_10.png) 

测试结果  
![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/builder/builder_11.png)  

## 5、建造者模式的使用场景  

1. 创建一些复杂的对象时，这些对象的内部组成构件间的建造顺序是稳定的，但是对象的内部组成构件面临着复杂的变化。  

2. 要创建的复杂对象的算法，独立于该对象的组成部分，也独立于组成部分的装配方法时。

## 6、建造者模式的优点  

1. 使用建造者模式可以使客户端不必知道产品内部组成的细节。  

2. 具体的建造者类之间是相互独立的，对系统的扩展非常有利。  

3. 由于具体的建造者是独立的，因此可以对建造过程逐步细化，而不对其他的模块产生任何影响。  

## 7、建造者模式的缺点  

1、建造者模式所创建的产品一般具有较多的共同点，其组成部分相似，如果产品之间的差异性很大，则不适合使用建造者模式，因此其使用范围受
到一定的限制。  

2、如果产品的内部变化复杂，可能会导致需要定义很多具体建造者类来实现这种变化，导致系统变得很庞大。  

## 8、在Android中的应用   

Dialog：Dialog的建造过程就是一个典型的“建造者模式”，通过Builder来设置不同的参数，创建出不同的Dialog。  

## 9、建造者模式的变型  
  

 


# 观察者模式-推模型和拉模型  

## 简介
在观察者模式中，又分为推模型和拉模型两种方式。

　　●　　推模型

　　　　 主题对象向观察者推送主题的详细信息，不管观察者是否需要，推送的信息通常是主题对象的全部或部分数据。

　　●　　拉模型

　　　　 主题对象在通知观察者的时候，只传递少量信息。如果观察者需要更具体的信息，由观察者主动到主题对象中获取，相当于是观察者从主题
对象中拉数据。一般这种模型的实现中，会把主题对象自身通过update()方法传递给观察者，这样在观察者需要获取数据的时候，就可以通过这个引
用来获取了。  

　　　　 推模型的栗子可以见这篇文章，[观察者模式](https://github.com/vikingden8/DesignPatterns-Java/blob/master/src/com/viking/observer/Observer.md).下面给出拉模型的栗子。  

## 拉模型的抽象观察类  

拉模型通常都是把主题对象当作参数传递 

 ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/observer/pull/observer_pull_01.png)  
 
## 拉模型的具体观察者类

 ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/observer/pull/observer_pull_02.png)  
 
## 拉模型的抽象主题类  

拉模型的抽象主题类主要的改变是nodifyObservers()方法。在循环通知观察者的时候，也就是循环调用观察者的update()方法的时候，传入的参数不同了  
 
 ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/observer/pull/observer_pull_03.png)  
 
## 拉模型的具体主题类

跟推模型相比，有一点变化，就是调用通知观察者的方法的时候，不需要传入参数了  
 ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/observer/pull/observer_pull_04.png) 
 
## 两种模式的比较 

　　■　　推模型是假定主题对象知道观察者需要的数据；而拉模型是主题对象不知道观察者具体需要什么数据，没有办法的情况下，干脆把自身传递
给观察者，让观察者自己去按需要取值。

　　■　　推模型可能会使得观察者对象难以复用，因为观察者的update()方法是按需要定义的参数，可能无法兼顾没有考虑到的使用情况。这就意
味着出现新情况的时候，就可能提供新的update()方法，或者是干脆重新实现观察者；而拉模型就不会造成这样的情况，因为拉模型下，
update()方法的参数是主题对象本身，这基本上是主题对象能传递的最大数据集合了，基本上可以适应各种情况的需要。


   
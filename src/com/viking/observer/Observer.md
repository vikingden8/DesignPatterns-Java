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

   GOF给出了以下使用观察者模式的情况：  
   
        1) 当一个抽象模型有两个方面, 其中一个方面依赖于另一方面。将这二者封装在独立的对象中以使它们可以各自独立地改变和复用。  
        
        2) 当对一个对象的改变需要同时改变其它对象, 而不知道具体有多少对象有待改变。  
        
        3) 当一个对象必须通知其它对象，而它又不能假定其它对象是谁。需要在系统中创建一个触发链，A对象的行为将影响B对象，
        B对象的行为将影响C对象……，可以使用观察者模式创建一种链式触发机制。换言之, 你不希望这些对象是紧密耦合的。  
              
   其实观察者模式同前面讲过的桥梁、策略有着共同的使用环境：将变化独立封装起来，以达到最大的重用和解耦。观察者与后两者不同的地方在于，
   观察者模式中的目标和观察者的变化不是独立的，而是有着某些联系。  
        
## 6、观察者模式的优点  

   第一、观察者模式在被观察者和观察者之间建立一个抽象的耦合。被观察者角色所知道的只是一个具体观察者列表，每一个具体观察者都符合一个
   抽象观察者的接口。被观察者并不认识任何一个具体观察者，它只知道它们都有一个共同的接口。  
   
   由于被观察者和观察者没有紧密地耦合在一起，因此它们可以属于不同的抽象化层次。如果被观察者和观察者都被扔到一起，那么这个对象必然跨
   越抽象化和具体化层次。  
   
   第二、观察者模式支持广播通讯。被观察者会向所有的登记过的观察者发出通知.  

## 7、观察者模式的缺点  

   第一、如果一个被观察者对象有很多的直接和间接的观察者的话，将所有的观察者都通知到会花费很多时间。  
   
   第二、如果在被观察者之间有循环依赖的话，被观察者会触发它们之间进行循环调用，导致系统崩溃。在使用观察者模式是要特别注意这一点。  
   
   第三、如果对观察者的通知是通过另外的线程进行异步投递的话，系统必须保证投递是以自恰的方式进行的。  
   
   第四、虽然观察者模式可以随时使观察者知道所观察的对象发生了变化，但是观察者模式没有相应的机制使观察者知道所观察的对象是怎么发生
   变化的。  
   
## 8、在Android中的应用  
   Observer(观察者)，DataSetObserver抽象2个方法，一个是观察数据改变的方法，一个是观察数据变成无效（或者不可用）时的方法。  
   源码地址：framework/base/core/Java/android/database/DataSetObserver.java  
   ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/observer/observer_07.png)  
   
   Subject(目标)，Observable<T>是一个泛型的抽象类，主要功能是注册和撤销observer。  
   源码地址：framework/base/core/java/android/database/Observable.java  
   ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/observer/observer_08.png)  
   
   ConcreteSubject(具体目标)，实现的方法同Oberver一样，只不过它是通知ArrayList<Observer>下的每个Oberver去执行各自的action。  
   源码地址：framework/base/core/java/android/database/DataSetObservable.java  
   ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/observer/observer_09.png) 
   
   ConcreteObserver(具体观察者),具体观察者的任务是实实在在执行action的类，一般由开发者根据实际情况，自己实现。android也有实现
   的例子。  
   源码地址：framework/base/core/java/android/widget/AbsListView.java  
   ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/observer/observer_9_5.png)  
   
   源码地址：framework/base/core/java/android/widget/AdapterView.java  
   ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/observer/observer_10.png)  
   
   其实运用的是大家熟悉的BaseAdapter，BaseAdapter关联了一个DataSetObservable对象，并实现registerDataSetObserver和
   unregisterDataSetObserver两个方法实现注册和撤销Observer，方法notifyDataSetChanged间接调用Observer的实现者
   的onChange()方法，以达到通知数据改变的作用。使用ListView和BaseAdapter组合时，当BaseAdapter的item改变时，我们经常会
   调用notifyDataSetChanged()，通知Listview刷新。  
   
   但是，但是，但是，我们从来没有调用BaseAdapter的registerDataSetObserver(DataSetObserver observer)注册Observer，
   那么Listview如何接收到通知，并执行刷新动作呢？  
   ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/observer/observer_11.png)  
      
   注意下面3行  
   ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/observer/observer_12.png)
   
   ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/observer/observer_13.png)
   
   当我们setAdapter(ListAdapter adapter)时，BaseAdapter同时注册了AdapterDataSetObserver()，至于AdapterDataSetObserver是如何
   通知Listvew和每个子item刷新（invalidate）的，这里涉及到的内容已经超出文章的范围，具体请查看源码。  
   
   
## 9、观察者模式的引申  

###  [观察者模式-推模型和拉模型](https://github.com/vikingden8/DesignPatterns-Java/blob/master/src/com/viking/observer/Observer_push_and_pull_model.md)  

###  [观察者模式在JDK的实现]()  




    
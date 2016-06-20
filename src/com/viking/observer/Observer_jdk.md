# 观察者模式-JDK的实现详解  

在JDK源码下的java.util.Observable和java.util.Observer，分别代表观察者模式中的Subject和Observer。

## Observable  

在源码中，有两个notifyObservers方法，其中的主要差别就是一个是自带内容，另一个自带内容为null，其实也就是JDK的Observer接口默认是同时支持推模型和拉模型，如下：

'''java  

    public void notifyObservers() {
            notifyObservers(null);
        }
    
    public void notifyObservers(Object arg) {
            ...
            ...
        }  
'''  

        
在第二个notifyObservers方法中的代码实现，有一同步代码段：  

    synchronized (this) {
                /* We don't want the Observer doing callbacks into
                 * arbitrary code while holding its own Monitor.
                 * The code where we extract each Observable from
                 * the Vector and store the state of the Observer
                 * needs synchronization, but notifying observers
                 * does not (should not).  The worst result of any
                 * potential race-condition here is that:
                 * 1) a newly-added Observer will miss a
                 *   notification in progress
                 * 2) a recently unregistered Observer will be
                 *   wrongly notified when it doesn't care
                 */
                if (!changed)
                    return;
                arrLocal = obs.toArray();
                clearChanged();
            }

这是为了保证潜在的竞争关系，所以在实现了Observable类中，如果数据源发生了变化，要通知所有的Observer的时候，要先调用setChanged()方法，如下，就是
使用JDK的Observable实现的人民日报：  

 ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/observer/jdk/observer_jdk_01.png)   
 
## Observer  

Observer类是一个接口，里面就只有一个update的方法：  

    /**
         * This method is called whenever the observed object is changed. An
         * application calls an <tt>Observable</tt> object's
         * <code>notifyObservers</code> method to have all the object's
         * observers notified of the change.
         *
         * @param   o     the observable object.
         * @param   arg   an argument passed to the <code>notifyObservers</code>
         *                 method.
         */
        void update(Observable o, Object arg);

其实这个方法就是同时支持拉模型（把Observable整个对象传递过来了，JDK默认就是传递了整个对象），拉模型（Object对象，对应着Observable里面特有的内容属性），
所以实现订阅人民日报的人就简单了，直接上代码：
    
 ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/observer/jdk/observer_jdk_02.png)   
 
## 调试输出 

客户端代码  

 ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/observer/jdk/observer_jdk_03.png) 
 
测试结果

 ![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/observer/jdk/observer_jdk_04.png) 
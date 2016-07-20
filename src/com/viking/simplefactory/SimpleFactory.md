Simple Factory Pattern（简单工厂模式）
===================

##Description（描述）
简单工厂模式是类的创建模式，又叫做静态工厂方法（Static Factory Method）模式。简单工厂模式是由一个工厂对象决定创建出哪一种产品
类的实例

##UML

![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/factory/simple_factory.png)

##Advantages（优点）
工厂类是整个模式的关键。包含了必要的逻辑判断，根据外界给定的信息，决定究竟应该创建哪个具体类的对象。通过使用工厂类，外界可以从
直接创建具体产品对象的尴尬局面摆脱出来,仅仅需要负责“消费”对象就可以了。而不必管这些对象究竟如何创建及如何组织的。明确了各自的
职责和权利，有利于整个软件体系结构的优化。

##Disadvantages（缺点）
由于工厂类集中了所有实例的创建逻辑，违反了高内聚责任分配原则，将全部创建逻辑集中到了一个工厂类中；它所能创建的类只能是事先考虑
到的，如果需要添加新的类，则就需要改变工厂类了。
当系统中的具体产品类不断增多时候，可能会出现要求工厂类根据不同条件创建不同实例的需求．这种对条件的判断和对具体产品类型的判断交
错在一起，很难避免模块功能的蔓延，对系统的维护和扩展非常不利；
这些缺点在工厂方法模式中得到了一定的克服。

##Use Scenario（使用场景）
工厂类负责创建的对象比较少；
客户只知道传入工厂类的参数，对于如何创建对象（逻辑）不关心；
由于简单工厂很容易违反高内聚责任分配原则，因此一般只在很简单的情况下应用。

Licensed
===================
All source code is licensed under Apache License 2.0. If you create your own app (free or commercial) that uses some or all of the code from this codebase, you MUST attribute it to the original author, no exceptions. You can do so by displaying an "About" or "Licenses" screen in your app that links back to this GitHub page AND includes the following notice: 

    Copyright 2016 - Viking Den

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

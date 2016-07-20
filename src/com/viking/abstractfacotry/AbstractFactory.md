Abstract Factory Pattern（抽象工厂模式）
===================

##Description（描述）
抽象工厂模式是工厂方法模式的升级版本，用来创建一组相关或者相互依赖的对象。与工厂方法模式的区别就在于，工厂方法
模式针对的是一个产品等级结构；而抽象工厂模式则是针对的多个产品等级结构。在编程中，通常一个产品结构，表现为一个
接口或者抽象类，也就是说，工厂方法模式提供的所有产品都是衍生自同一个接口或抽象类，而抽象工厂模式所提供的产品则
是衍生自不同的接口或抽象类。
在抽象工厂模式中，有一个产品族的概念：所谓的产品族，是指位于不同产品等级结构中功能相关联的产品组成的家族。抽象工
厂模式所提供的一系列产品就组成一个产品族；而工厂方法提供的一系列产品称为一个等级结构。

##UML

![](https://github.com/vikingden8/DesignPatterns-Java/blob/master/images/factory/abstract_factory.png)


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


## 设计模式

> 我认为学习设计模式不是一蹴而就的事情，是需要长时间的积累，在平时写代码的时候多思考，学习设计模式的时候也不要死记硬背，要了解每个设计模式都解决了那些问题，另外就是最好要记住每种设计模式的类图，这样对于实操写代码的时候很有帮助	

​	设计模式是软件设计中的最佳实践，是由前人的知识和经验总结而来，是针对不同特定场景问题的解决方案，通过学习设计模式，可以让我们知道在什么情况下应该使用什么设计模式，也可以增加我们对于软件设计的理解，设计出更稳定，扩展性更好的系统

设计模式总共包括6大设计原则和23种设计模式，23种设计模式又分为创建型模式，结构型模式，行为型模式三种，每种模式解决的问题也不相同，创建型设计模式主要关注与如何创建对象；结构型设计模式主要关注于类和对象之间的关系；而行为型设计模式关注于对象之间的通信；

## 23种设计模式

每种设计模式都以定义，类图，角色，优缺点，示例的方式进行讲解

**源码地址：https://github.com/mingyuHub/design-patterns**

### 创建型设计模式

**关注于如何创建对象**

#### [单例模式](https://chenmingyu.top/design-singleton/)

保证在程序运行期间一个类只有一个实例，并提供一个全局访问点

#### [工厂模式](https://chenmingyu.top/design-factory-method/)

用工厂方法代替new操作，让子类去决定实例化哪个类，工厂方法将一个类的实例化延迟到子类

#### [抽象工厂](https://chenmingyu.top/design-abstract-factory/) 

抽象工厂模式属于创建型模式，是对工厂方法模式的扩展，抽象工厂比工厂模式更为抽象，工厂方法模式针对产品等级结构，而抽象工厂针对产品族

#### [建造者模式](https://chenmingyu.top/design-builder/) 

将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示

#### [原型模式](https://chenmingyu.top/design-phototype/)  

通过克隆一个已经存在的对象实例来返回新的实例，而不是通过new去创建对象

### 结构型设计模式

**关注于类和对象之间的关系**

#### [适配器模式](https://chenmingyu.top/design-adapter/)  

组合两个不相干类，在两个不兼容的接口之间提供一个混合接口，使其兼容适配

#### [桥接模式](https://chenmingyu.top/design-bridge/)  

将抽象部分与它的实现部分分离，使它们都可以独立地变化。桥接模式将系统各维度抽象出来，各维度独立变化，之后可通过聚合，将各维度组合起来，减少它们之间耦合

#### [组合模式](https://chenmingyu.top/design-composite/)  

用来描述部分与整体的关系，是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，所以组合模式的使用场景就是出现树形结构的地方。

#### [装饰器模式](https://chenmingyu.top/design-decorator/)  

装饰器模式可以为一个现有的类增加新功能，又不改变其结构，要求装饰类和被装饰类实现同一个接口，装饰类持有被装饰类的实例

#### [外观模式](https://chenmingyu.top/design-facade/)  

外观模式是为了解决类与类之家的责任关系和依赖关系的，通过提供一个Facade类来隐藏这些复杂的类之间关系的调用，并提供一个接口，供外部调用，利用这种方式进行类之间的解耦

#### [代理模式](https://chenmingyu.top/design-proxy/) 

代理模式就是在操作原对象的时候，多出来一个代理类，用来对原对象的访问进行控制和替代原对象进行一些操作

#### [享元模式](https://chenmingyu.top/design-flyweight/) 

运用共享技术有效地支持大量细粒度对象的复用，主要用来减少对象的创建，用来减少内存和提高性能，比较常见的连接池，缓冲池这类的池技术都是享元模式

### 行为型设计模式

**关注于对象之间的通信**

#### [模板方法模式](https://chenmingyu.top/design-template-method/)  

在父类（抽象类）中定义好算法的流程，提供抽象方法，针对不同的实现交由不同的子类去实现，通过这种方式将公共代码提取出来封装在父类中，然后父类去控制行为，子类负责实现

#### [策略模式](https://chenmingyu.top/design-strategy/)  

在系统中提供一组策略，并将每个策略封装成类，使他们可以相互转换，具体策略的选择由客户端决定

#### [观察者模式](https://chenmingyu.top/design-observer/)  

定义对象间一种一对多的依赖关系，使得每当一个对象改变状态，则所有依赖于它的对象都会得到通知并被自动更新

#### [迭代器模式](https://chenmingyu.top/design-iterator/)  

迭代器模式就是为解决遍历元素而诞生的，它提供一种方法访问一个容器对象中各个元素，而又不需暴露该对象的内部细节

#### [责任链模式](https://chenmingyu.top/design-chain/)  

使多个对象都有机会处理请求，从而避免了请求的发送者和接受者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止

#### [命令模式](https://chenmingyu.top/design-command/)  

将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能，用来降低类之间解耦

#### [备忘录模式](https://chenmingyu.top/design-memento/)  

在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态，其实就是在某个时刻备份了对象的状态，在更改对象状态后，可以通过备份将对象还原成备份时刻的状态

#### [状态模式](https://chenmingyu.top/design-state/)  

允许一个对象在其内部状态改变时改变它的行为，对象看起来似乎修改了它的类，对象的行为依赖于它的状态（属性），并且可以根据它的状态改变而改变它的相关行为

#### [访问者模式](https://chenmingyu.top/design-visitor/)  

封装一些作用于某种数据结构中的各元素的操作，它可以在不改变数据结构的前提下定义作用于这些元素的新的操作，访问者模式就是将数据结构与数据操作相分离

#### [中介者模式](https://chenmingyu.top/design-mediator/)  

用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互

#### [解释器模式](https://chenmingyu.top/design-interpreter/)  

给定一门语言，定义它的文法的一种表示，并定义一个解释器，该解释器使用该表示来解释语言中的句子

### 六大原则

#### 单一职责原则

单一职责要求的是类和接口职责单一，不能存在多于一个导致类变更的原因

#### 开闭原则

对扩展开放，对修改关闭，在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果

#### 里氏代换原则

里氏代换原则是面向对象设计的基本原则之一，氏代换原则中说，任何父类可以出现的地方，子类一定可以出现。子类对父类的方法尽量不要重写和重载。因为父类代表了定义好的结构，通过这个规范的接口与外界交互，子类不应该随便破坏它

#### 依赖倒转原则

这个是开闭原则的基础，具体内容：面向接口编程，依赖于抽象而不依赖于具体。写代码时用到具体类时，不与具体类交互，而与具体类的上层接口交互

#### 接口隔离原则

这个的意思每个接口的职责应该是单一的，接口中不应该存在子类用不到的方法，如若不然，就需要将接口拆分为多个接口

#### 迪米特法则

迪米特法则又叫最少知道原则，一个类对自己依赖的类知道的越少越好。也就是说无论被依赖的类多么复杂，都应该将逻辑封装在方法的内部，通过public方法提供给外部。这样当被依赖的类变化时，才能最小的影响该类


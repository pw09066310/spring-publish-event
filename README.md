# spring-publish-event

- 我们的业务为了迎合甲方的需求总是不断的变换流程，比如一会要发短信，一会要插审核记录 ，一会还要备份，一会还要介入第三方服务。
- 这样修改，我们每次都要修改耦合在一起的代码，每次改完之后还要测试，无疑增加了成本，为了解决这个问题，我参照spring 设计模式

- 参照spring的观察者 发布订阅模式，我解耦了日常业务耦合比较严重的代码，按照开闭原则对修改关闭，对扩展开放”的开闭原则
- 按照这样的思路，下次产品如果要增加发送消息给业务人员或者增加一些校验过程，我就可以直接添加一个listener即可，在listener添加一个实现service即可

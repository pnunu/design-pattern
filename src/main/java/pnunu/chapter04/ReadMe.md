---

date: 2017/12/2 20:58
---

工厂模式：
t01: 简单的工厂模式


```
Pizza orderPizza(String type) {
    Pizza pizza;
    if (type.equals("cheese")) {
        pizza = new CheesePizza();
    } else if (type.equals("greek")) {
        pizza = new GreekPizza();
    } else if (type.equals("pepperon")) {
        pizza = new PepperonPizza();
    }
    
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
}

```
类似于这段代码的情况，我也会经常出现。大量的 if -- else 判断

如果要增加或者减少都需要来修改这么一段代码。导致代码的拓展性极差。


##  依赖倒置原则

代码里减少对于具体类的依赖是件好事

要依赖抽象，不要依赖具体类
----------------------



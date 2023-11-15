**Switch Statement**

The switch/case construct is similar to the if/else construct, as it allows you to handle multiple conditions at once:

```java
int num = 8;

switch(num) {
    case 1: 
        System.out.println("The number is 1");
        break;
    case 8: 
        System.out.println("The number is 8");
        num++;
        break;
    case 9: 
        System.out.println("The number is 9");
        break;
    default:
        System.out.println("The number is not 1, 8, or 9");
}
```

After the switch keyword, the expression being compared is placed within the parentheses. The value of this expression is sequentially compared with the values listed after the case statements. If a match is found, the corresponding case block is executed.

At the end of each case block, the break statement is used to prevent the execution of other case blocks.



**Конструкция switch**

Конструкция switch/case аналогична конструкции if/else, так как позволяет обработать сразу несколько условий:

int num = 8;

switch(num){

    case 1: 
        System.out.println("число равно 1");
        break;
    case 8: 
        System.out.println("число равно 8");
        num++;
        break;
    case 9: 
        System.out.println("число равно 9");
        break;
    default:
        System.out.println("число не равно 1, 8, 9");
}

После ключевого слова switch в скобках идет сравниваемое выражение. Значение этого выражения последовательно сравнивается со значениями, помещенными после операторов сase. И если совпадение найдено, то будет выполняет соответствующий блок сase.

В конце блока сase ставится оператор break, чтобы избежать выполнения других блоков.
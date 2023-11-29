***Bubble Sort***

When it comes to sorting, the first thing that usually comes to mind is bubble sort. This is because this sorting method is the simplest to understand and implement.

Under certain circumstances, bubble sort can be relatively fast, but only in some cases. Typically, this type of sorting is used for educational purposes.

The bubble sort works as follows:

1. Starting from the beginning of the array, we pairwise compare elements (the first with the second, the second with the third, the third with the fourth, and so on).
2. If the second element in the pair is smaller than the first element, we swap them - move the second element to the position of the first, and the first to the position of the second. This is done for all elements.
3. After reaching the end of the array (comparing the penultimate and last elements and exchanging if necessary), we check if there was at least one swap. If yes, it means the array is not sorted, and we start over. We repeat these passes until we have compared pairwise all elements from the beginning to the end, and there is no exchange. This way, elements with the smallest values gradually move from right to left. Hence the name of the method - bubble sort.


***Сортировка пузырьком***  

Когда речь заходит о сортировке, первое, о чем вспоминают, это, как правило, именно сортировка пузырьком. Это связанно с тем, что данный метод сортировки самый простой как для понимания, так и для реализации.

При определенных обстоятельствах сортировка пузырьком может быть достаточно быстрой, но это только в некоторых случаях. Как правило, данный вид сортировки служит только для учебных целей.

Сортировка пузырьком заключается в следующем:

начиная с начала массива просматриваем попарно по 2 элемента (первый со вторым, второй с третим, третий с четвертым и т.д.).
Если второй элемент в паре меньше первого элемента – перемещаем его на место первого, а первый на место второго. Это мы делаем для всех элементов.
После того, как мы дошли до конца массива (сравнили предпоследний и последний элементы и сделали обмен, если нужно), проверяем, был ли хотя бы один обмен. Если да, значит массив не отсортирован и начинаем все сначала. Повторяем такие проходы, пока не будет так, что мы проверили попарно все элементы от начала до конца, а обмена ни одного не было. Таким образом элементы с самыми маленькими значениями потихоньку перемещаются справа налево. То есть они как будто всплывают, как мыльный пузырь. Отсюда и название метода – пузырьком.
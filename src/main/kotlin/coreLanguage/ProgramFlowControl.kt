package coreLanguage
// Управление потоком выполнения программы
//При написании программ часто возникает необходимость управлять их выполнением. Так случается, если создаются
//программы, в которых решения принимаются в зависимоси от условий и состояния данных. Язык Kotlin располагает для
//этого набором структур, известных пользователям, которые уже работали ранее с языками программирования - например,
//конструкциями if, while и for. В этом разделе мы рассмотрим имеющиеся в нашем распоряжении структуры для управления
//потоком выполнения программы.


// Условные выражения
//Условные выражения используются для ветвления программы. Они выполняют или пропускают программные операторы на основе
//результатов условного теста. Условные выражения - это точки принятия решений в программе. Язык Kotlin располагает для
// обработки ветвления двумя основными структурами: выражение if и выражение when.
// Выражение if
//Выражение if используется для принятия логического решения, основанного на выполнении условия. Для записи выражений
//if служит ключевое слово if
/*
class ProgramFlowControl {
    fun main(args: Array<String>) {
        val a = 1
        if (a == 1) {
            print("a is one")
        }
    }
}
*/
//Здесь выражение if проверяет, выполняется ли условие: a == 1 (читай: а равно 1). Если условие истинно (true), строка
//а выводится на экран в виде отдельной строки, иначе - ничего не печатается.

//Выражения if часто содержат одно или несколько сопуствующих слов else или else if. Эти сопутствующие ключевые слова
//могут применяться в дальнейшем для управления потоком выполнения программы.
/*
fun main(args: Array<String>) {
    val a = 4
    if (a == 1) {
        print("a is equal to one.")
    } else if (a == 2) {
        print("a is equal to two.")
    } else {
        print("a is neither one nor two.")
    }
}
*/


// Выражение when
//Выражение when служит еще одним средством управления потоком выполнения программ.
/*
fun printEvenNumbers(numbers: Array<Int>) {
    numbers.forEach {
        when (it % 2) {
            0 -> println(it)
        }
    }
}

fun main (args: Array<String>) {
    val numberList: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6)
    printEvenNumbers(numberList)
}
*/
//Здесь функция printEvenNumbers в качестве единственного аргумента принимает целочисленный массив. Массивы мы
//рассмотрим в этой главе позже, а пока представим их в виде последовательного набора значений из некого их
//пространства. В нашем случае переданный массив включает значения из пространства целых чисел. Каждый элемент массива
//входит в итерацию, обеспечиваемую методом forEach, и проверяется с помощью выражения when. В нашем случае переменная
//it представляет собой текущее значение элемента массива, по отношению к которому выполняется итерация с помощью
//метода forEach. Оператор % является бинарным оператором, выполняющим операцию деления первого операнда(it) на
//значение второго операнда(2) с возвращением остатка от деления. Таким образом, выражение when на каждой итерации
//берет текущее значение первого операнда (it), делит его на 2, получает остаток от этого деления и проверяет, равно
//ли оно 0. Если это так, значение является четным, и, следовательно, выводится на печать


// Оператор Elvis
//Оператор Elvis - это сокращенная структура, имеющаяся в языке Kotlin. Она принимает следующую форму:
// (выражение) ?: значение2
//Применение этой структуры в программе Kotlin демонстрируется в следующем блоке кода:
/*
fun main(args: Array<String>) {
    val nullName: String? = null
    val firstName = nullName ?: "John"
}
*/
//Если значение переменной nullName не нуль, оператор Elvis возвращает его, в противном случае возвращается значение,
//возвращаемое оператором Elvis.














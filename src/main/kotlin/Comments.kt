// Комментарии
//При написании кода иногда необходимо записывать важную информацию, относящуюся к написанному коду. Для этого
//применяются комментарии. В языке Kotlin имеется три типа комментариев:
// - Однострочные комментарии
// - Многострочные комментарии
// - Комментарии Doc


// Однострочные комментарии
//Как следует из названия, эти комментарии занимают одну строку. Однострочные комментарии начинаются с двух слэшей: //. После компиляции программы все идущие после этих слешей символы игнорируются.
/*
class Comments {
    fun main(args: Array<String>) {
        val b: Int = 957 // однострочный комментарий
        // println(b)
    }
}
*/
//Значение, сохраняющееся в переменной b, не выводится на консоль, поскольку функция, выполняющая операцию печати,
//закоментирована.


// Многострочные комментарии
//Многострочные комментарии занимаются несколько строк. Они начинаются с обратного слеша, за которым следует звездочка:
//"/*", и заканчиваются звездочкой, за которой следует обратный слеш: "*/"

/*
Многострочный комментарий.
И это тоже комментарий.
*/


// Комментарий Doc
//Этот тип комментария похож на многострочный комментарий комментарий. Основное различие их в том, что применяется он
//для документирования кода в программе. Комментарий doc (комментарий документа) начинается с обратного слэша, за
//которым следуют два символа звездочки: /**, и заканчивается звездочкой, за которой следует обратный слеш: */
/**
 * Adds an [item] to the queue.
 * @return the new size of the queue.
 */
//fun enqueue(item: Object): Int {...}

package iterator_pattern

fun main(array: Array<String>) {
    val bookShelf: BookShelf = BookShelf(
        arrayOf(
            Book("a"),
            Book("b"),
            Book("c"),
            Book("d")
        )
    )

    // 明示的にIteratorを使う
    val it: Iterator<Book> = bookShelf.iterator()
    while (it.hasNext()) {
        val book: Book = it.next()
        println(book.name)
    }
    println()

    // 拡張for
    for (book in bookShelf) {
        println(book.name)
    }
}
package iterator_pattern

class BookShelf(private val books: Array<Book>) : Iterable<Book> {
    fun getBookAt(index: Int): Book {
        return books[index]
    }

    fun getLength(): Int {
        return books.size
    }

    override fun iterator(): Iterator<Book> {
        return BookShelfIterator(this)
    }
}
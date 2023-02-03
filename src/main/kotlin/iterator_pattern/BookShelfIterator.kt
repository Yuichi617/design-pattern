package iterator_pattern

import java.util.NoSuchElementException

class BookShelfIterator(private val bookShelf: BookShelf) : Iterator<Book> {
    private var index: Int = 0

    override fun hasNext(): Boolean = index < bookShelf.getLength()

    override fun next(): Book {
        if (!hasNext()) {
            throw NoSuchElementException()
        }
        val book: Book = bookShelf.getBookAt(index)
        index++
        return book
    }
}
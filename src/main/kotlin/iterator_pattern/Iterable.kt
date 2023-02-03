package iterator_pattern

interface Iterable<E> {
    abstract operator fun iterator(): Iterator<E>
}

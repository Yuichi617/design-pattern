package iterator_pattern

interface Iterator<E> {
    abstract operator fun hasNext(): Boolean
    abstract operator fun next(): E
}

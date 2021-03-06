package typings.tstl

import typings.std.IterableIterator
import typings.tstl.containerDequeMod.Deque.Iterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/Deque", JSImport.Namespace)
@js.native
object containerDequeMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArrayContainer<T, Deque<T>, Deque<T>, Deque.Iterator<T>, Deque.ReverseIterator<T>, T> * / any */ @js.native
  /**
    * Default Constructor.
    */
  class Deque[T] () extends js.Object {
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      */
    def this(items: js.Array[T]) = this()
    /**
      * Copy Constructor
      *
      * @param obj Object to copy.
      */
    def this(obj: Deque[T]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iterator of the last position.
      */
    def this(
      first: IForwardIterator[T, IForwardIterator[T, _]],
      last: IForwardIterator[T, IForwardIterator[T, _]]
    ) = this()
    /**
      * Fill Constructor.
      *
      * @param size Initial size.
      * @param val Value to fill.
      */
    def this(size: Double, `val`: T) = this()
    /**
      * @hidden
      */
    var _Compute_col_size: js.Any = js.native
    /**
      * @hidden
      */
    var _Fetch_index: js.Any = js.native
    /**
      * @hidden
      */
    var _Insert_to_end: js.Any = js.native
    /**
      * @hidden
      */
    var _Insert_to_middle: js.Any = js.native
    /**
      * @hidden
      */
    var _Swap: js.Any = js.native
    /**
      * @hidden
      */
    var _Try_add_row_at_back: js.Any = js.native
    /**
      * @hidden
      */
    var _Try_add_row_at_front: js.Any = js.native
    /**
      * @hidden
      */
    var _Try_expand_capacity: js.Any = js.native
    /**
      * @hidden
      */
    var capacity_ : js.Any = js.native
    /**
      * @inheritDoc
      */
    @JSName(scala.scalajs.js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[T]] = js.native
    /**
      * @hidden
      */
    var matrix_ : js.Any = js.native
    /**
      * @hidden
      */
    var size_ : js.Any = js.native
    /**
      * @hidden
      */
    /* protected */ def _Erase_by_range(first: Iterator[T], last: Iterator[T]): Iterator[T] = js.native
    /**
      * @hidden
      */
    /* protected */ def _Insert_by_range[InputIterator /* <: IForwardIterator[T, InputIterator] */](pos: Iterator[T], first: InputIterator, last: InputIterator): Iterator[T] = js.native
    /**
      * @inheritDoc
      */
    def assign(n: Double, `val`: T): Unit = js.native
    /**
      * @inheritDoc
      */
    def assign[InputIterator /* <: IForwardIterator[T, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    /**
      * @inheritDoc
      */
    def at(index: Double): T = js.native
    /**
      * The capacity to store elements.
      *
      * @return The capacity.
      */
    def capacity(): Double = js.native
    /**
      * @inheritDoc
      */
    def clear(): Unit = js.native
    /**
      * @hidden
      */
    def nth(index: Double): Iterator[T] = js.native
    /**
      * @inheritDoc
      */
    def pop_back(): Unit = js.native
    /**
      * @inheritDoc
      */
    def pop_front(): Unit = js.native
    /**
      * @inheritDoc
      */
    def push(items: T*): Double = js.native
    /**
      * @inheritDoc
      */
    def push_back(`val`: T): Unit = js.native
    /**
      * @inheritDoc
      */
    def push_front(`val`: T): Unit = js.native
    /**
      * Reserve {@link capacity} enable to store *n* elements.
      *
      * @param n The capacity to reserve.
      */
    def reserve(n: Double): Unit = js.native
    /**
      * @inheritDoc
      */
    def resize(n: Double): Unit = js.native
    /**
      * @inheritDoc
      */
    def set(index: Double, `val`: T): Unit = js.native
    /**
      * Shrink {@link capacity} to actual {@link size}.
      */
    def shrink_to_fit(): Unit = js.native
    /**
      * @inheritDoc
      */
    def size(): Double = js.native
    /**
      * @inheritDoc
      */
    def swap(obj: Deque[T]): Unit = js.native
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class deque[T] () extends Deque[T] {
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      */
    def this(items: js.Array[T]) = this()
    /**
      * Copy Constructor
      *
      * @param obj Object to copy.
      */
    def this(obj: Deque[T]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iterator of the last position.
      */
    def this(
      first: IForwardIterator[T, IForwardIterator[T, _]],
      last: IForwardIterator[T, IForwardIterator[T, _]]
    ) = this()
    /**
      * Fill Constructor.
      *
      * @param size Initial size.
      * @param val Value to fill.
      */
    def this(size: Double, `val`: T) = this()
  }
  
  /* static members */
  @js.native
  object Deque extends js.Object {
    val Iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayIterator */ js.Any = js.native
    val ReverseIterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayReverseIterator */ js.Any = js.native
    val iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayIterator */ js.Any = js.native
    val reverse_iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayReverseIterator */ js.Any = js.native
    /**
      * @hidden
      */
    /* private */ def MAGNIFIER(): js.Any = js.native
    /**
      * @hidden
      */
    /* private */ def MIN_CAPACITY(): js.Any = js.native
    /**
      * @hidden
      */
    /* private */ def ROW_SIZE(): js.Any = js.native
    type Iterator[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArrayIterator<T, Deque<T>> */ js.Any
    type ReverseIterator[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArrayReverseIterator<T, Deque<T>> */ js.Any
    type iterator[T] = typings.tstl.containerDequeMod.Deque.Iterator[T]
    type reverse_iterator[T] = typings.tstl.containerDequeMod.Deque.ReverseIterator[T]
  }
  
  /* static members */
  @js.native
  object deque extends js.Object {
    val Iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayIterator */ js.Any = js.native
    val ReverseIterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayReverseIterator */ js.Any = js.native
    val iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayIterator */ js.Any = js.native
    val reverse_iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayReverseIterator */ js.Any = js.native
    /**
      * @hidden
      */
    /* private */ def MAGNIFIER(): js.Any = js.native
    /**
      * @hidden
      */
    /* private */ def MIN_CAPACITY(): js.Any = js.native
    /**
      * @hidden
      */
    /* private */ def ROW_SIZE(): js.Any = js.native
  }
  
}


package typings.tstl

import typings.std.Iterable
import typings.std.IterableIterator
import typings.tstl.baseContainerIDequeContainerMod._IDeque
import typings.tstl.baseContainerILinearContainerMod._IFront
import typings.tstl.containerForwardListMod.ForwardList.Iterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/ForwardList", JSImport.Namespace)
@js.native
object containerForwardListMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IForwardContainer<ForwardList.Iterator<T>> * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _IClear * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _IEmpty * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ISize * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _IListAlgorithm<T, ForwardList<T>> * / any */ @js.native
  /**
    * Default Constructor.
    */
  class ForwardList[T] ()
    extends _IDeque[T]
       with _IFront[T]
       with Iterable[T] {
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
    def this(obj: ForwardList[T]) = this()
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
    def this(n: Double, `val`: T) = this()
    /**
      * @hidden
      */
    var _Insert_by_range: js.Any = js.native
    /**
      * @hidden
      */
    var _Insert_by_repeating_val: js.Any = js.native
    /**
      * @hidden
      */
    var before_begin_ : js.Any = js.native
    /**
      * @hidden
      */
    var end_ : js.Any = js.native
    /**
      * @inheritDoc
      */
    @JSName(scala.scalajs.js.Symbol.iterator)
    var iterator_ForwardList: js.Function0[IterableIterator[T]] = js.native
    /**
      * @hidden
      */
    var ptr_ : js.Any = js.native
    /**
      * @hidden
      */
    var size_ : js.Any = js.native
    /**
      * Fill Assigner.
      *
      * @param n Initial size.
      * @param val Value to fill.
      */
    def assign(n: Double, `val`: T): Unit = js.native
    /**
      * Range Assigner.
      *
      * @param first Input iteartor of the first position.
      * @param last Input iterator of the last position.
      */
    def assign[T, InputIterator /* <: IForwardIterator[T, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    /**
      * Iterator to before beginning.
      *
      * @return Iterator to the before beginning.
      */
    def before_begin(): Iterator[T] = js.native
    /**
      * @inheritDoc
      */
    def begin(): Iterator[T] = js.native
    /**
      * @inheritDoc
      */
    def clear(): Unit = js.native
    /**
      * @inheritDoc
      */
    def empty(): Boolean = js.native
    /**
      * @inheritDoc
      */
    def end(): Iterator[T] = js.native
    /**
      * Erase elements.
      *
      * @param first Range of the first position to erase after.
      * @param last Rangee of the last position to erase.
      * @return Iterator to the last removed element.
      */
    def erase_after(first: Iterator[T], last: Iterator[T]): Iterator[T] = js.native
    /**
      * Erase an element.
      *
      * @param it Position to erase after.
      * @return Iterator to the erased element.
      */
    def erase_after(it: Iterator[T]): Iterator[T] = js.native
    /**
      * Inserted repeated elements.
      *
      * @param pos Position to insert after.
      * @param n Number of elements to insert.
      * @param val Value to insert repeatedly.
      * @return An iterator to the last of the newly inserted elements.
      */
    def insert_after(pos: Iterator[T], n: Double, `val`: T): Iterator[T] = js.native
    /**
      * Insert an element.
      *
      * @param pos Position to insert after.
      * @param val Value to insert.
      * @return An iterator to the newly inserted element.
      */
    def insert_after(pos: Iterator[T], `val`: T): Iterator[T] = js.native
    /**
      * Insert range elements.
      *
      * @param pos Position to insert after.
      * @param first Input iterator of the first position.
      * @param last Input iteartor of the last position.
      * @return An iterator to the last of the newly inserted elements.
      */
    def insert_after[T, InputIterator /* <: IForwardIterator[T, InputIterator] */](pos: Iterator[T], first: InputIterator, last: InputIterator): Iterator[T] = js.native
    /**
      * @inheritDoc
      */
    def merge(from: ForwardList[T]): Unit = js.native
    def merge(from: ForwardList[T], comp: js.Function2[/* x */ T, /* y */ T, Boolean]): Unit = js.native
    /**
      * Erase the first element.
      */
    /* CompleteClass */
    override def pop_front(): Unit = js.native
    /**
      * @inheritDoc
      */
    /* CompleteClass */
    override def push_front(`val`: T): Unit = js.native
    /**
      * @inheritDoc
      */
    def remove(`val`: T): Unit = js.native
    /**
      * @inheritDoc
      */
    def remove_if(pred: js.Function1[/* val */ T, Boolean]): Unit = js.native
    /**
      * @inheritDoc
      */
    def reverse(): Unit = js.native
    /**
      * @inheritDoc
      */
    def size(): Double = js.native
    /**
      * @inheritDoc
      */
    def sort(): Unit = js.native
    def sort(comp: js.Function2[/* x */ T, /* y */ T, Boolean]): Unit = js.native
    /**
      * Transfer elements.
      *
      * @param pos Position to insert after.
      * @param from Target container to transfer.
      */
    def splice_after(pos: Iterator[T], from: ForwardList[T]): Unit = js.native
    /**
      * Transfer a single element.
      *
      * @param pos Position to insert after.
      * @param from Target container to transfer.
      * @param before Previous position of the single element to transfer.
      */
    def splice_after(pos: Iterator[T], from: ForwardList[T], before: Iterator[T]): Unit = js.native
    /**
      * Transfer range elements.
      *
      * @param pos Position to insert after.
      * @param from Target container to transfer.
      * @param first Range of previous of the first position to transfer.
      * @param last Rangee of the last position to transfer.
      */
    def splice_after(pos: Iterator[T], from: ForwardList[T], first_before: Iterator[T], last: Iterator[T]): Unit = js.native
    /**
      * @inheritDoc
      */
    def swap(obj: ForwardList[T]): Unit = js.native
    /**
      * Native function for `JSON.stringify()`.
      *
      * @return An array containing children elements.
      */
    def toJSON(): js.Array[T] = js.native
    /**
      * @inheritDoc
      */
    def unique(): Unit = js.native
    def unique(binary_pred: js.Function2[/* x */ T, /* y */ T, Boolean]): Unit = js.native
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class forward_list[T] () extends ForwardList[T] {
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
    def this(obj: ForwardList[T]) = this()
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
    def this(n: Double, `val`: T) = this()
  }
  
  @js.native
  object ForwardList extends js.Object {
    /**
      * Iterator of the ForwardList.
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    @js.native
    /**
      * @hidden
      */
    class Iterator[T] protected () extends IForwardIterator[T, Iterator[T]] {
      /**
        * @hidden
        */
      var _Try_value: js.Any = js.native
      /**
        * @hidden
        */
      var next_ : js.Any = js.native
      /**
        * @hidden
        */
      var source_ptr_ : js.Any = js.native
      /**
        * Reference of the value.
        */
      /* CompleteClass */
      override var value: T = js.native
      /**
        * @hidden
        */
      var value_ : js.Any = js.native
      /**
        * Get next iterator.
        *
        * @return The next iterator.
        */
      /* CompleteClass */
      override def next(): Iterator[T] = js.native
      /**
        * Get source container.
        *
        * @return The source container.
        */
      def source(): ForwardList[T] = js.native
      /**
        * @inheritDoc
        */
      @JSName("value")
      def value_MIterator(): T = js.native
      /**
        * @inheritDoc
        */
      @JSName("value")
      def value_MIterator(`val`: T): js.Any = js.native
    }
    
  }
  
  @js.native
  object forward_list extends js.Object {
    /**
      * Iterator of the ForwardList.
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    @js.native
    /**
      * @hidden
      */
    class Iterator[T] protected ()
      extends typings.tstl.containerForwardListMod.ForwardList.Iterator[T]
    
  }
  
}


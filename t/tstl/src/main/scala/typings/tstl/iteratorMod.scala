package typings.tstl

import typings.tstl.containerVectorMod.Vector
import typings.tstl.containerVectorMod.Vector.Iterator
import typings.tstl.containerVectorMod.Vector.ReverseIterator
import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIBidirectionalIteratorMod.IBidirectionalIterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.iteratorIReverseIteratorMod.IReversableIterator
import typings.tstl.iteratorIReverseIteratorMod.IReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator", JSImport.Namespace)
@js.native
object iteratorMod extends js.Object {
  @js.native
  class BackInsertIterator[T, Source /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _IPushBack<T> */ js.Any */] protected ()
    extends typings.tstl.iteratorBackInsertIteratorMod.BackInsertIterator[T, Source] {
    /**
      * Initializer Constructor.
      *
      * @param source The source container.
      */
    def this(source: Source) = this()
  }
  
  @js.native
  class FrontInsertIterator[T, Source /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _IPushFront<T> */ js.Any */] protected ()
    extends typings.tstl.iteratorFrontInsertIteratorMod.FrontInsertIterator[T, Source] {
    /**
      * Initializer Constructor.
      *
      * @param source The source container.
      */
    def this(source: Source) = this()
  }
  
  @js.native
  class InsertIterator[Container /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _IInsert<Iterator> */ js.Any */, Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */] protected ()
    extends typings.tstl.iteratorInsertIteratorMod.InsertIterator[Container, Iterator] {
    /**
      * Initializer Constructor.
      *
      * @param container Target container to insert.
      * @param it Iterator to the position to insert.
      */
    def this(container: Container, it: Iterator) = this()
  }
  
  def advance[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](it: InputIterator, n: Double): InputIterator = js.native
  def back_inserter[T](source: js.Array[T]): typings.tstl.iteratorBackInsertIteratorMod.BackInsertIterator[T, Vector[T]] = js.native
  def back_inserter[T, Source /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _IPushBack<T> */ js.Any */](source: Source): typings.tstl.iteratorBackInsertIteratorMod.BackInsertIterator[T, Source] = js.native
  def begin[Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */](
    container: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IForwardContainer<Iterator> */ js.Any
  ): Iterator = js.native
  def begin[T](container: js.Array[T]): Iterator[T] = js.native
  def distance[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): Double = js.native
  def empty(
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _IEmpty */ js.Any
  ): Boolean = js.native
  def empty[T](source: js.Array[T]): Boolean = js.native
  def end[Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */](
    container: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IForwardContainer<Iterator> */ js.Any
  ): Iterator = js.native
  def end[T](container: js.Array[T]): Iterator[T] = js.native
  def front_inserter[T, Source /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _IPushFront<T> */ js.Any */](source: Source): typings.tstl.iteratorFrontInsertIteratorMod.FrontInsertIterator[T, Source] = js.native
  def inserter[T](container: js.Array[T], it: Iterator[T]): typings.tstl.iteratorInsertIteratorMod.InsertIterator[Vector[T], Iterator[T]] = js.native
  def inserter[Container /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _IInsert<Iterator> */ js.Any */, Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */](container: Container, it: Iterator): typings.tstl.iteratorInsertIteratorMod.InsertIterator[Container, Iterator] = js.native
  def make_reverse_iterator[IteratorT /* <: IReversableIterator[ValueType[IteratorT], IteratorT, ReverseT] */, ReverseT /* <: IReverseIterator[ValueType[IteratorT], IteratorT, ReverseT] */](it: IteratorT): ReverseT = js.native
  def next[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](it: ForwardIterator): ForwardIterator = js.native
  def next[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](it: ForwardIterator, n: Double): ForwardIterator = js.native
  def prev[BidirectionalIterator /* <: IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator] */](it: BidirectionalIterator): BidirectionalIterator = js.native
  def prev[BidirectionalIterator /* <: IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator] */](it: BidirectionalIterator, n: Double): BidirectionalIterator = js.native
  def rbegin[T](container: js.Array[T]): ReverseIterator[T] = js.native
  def rbegin[Iterator /* <: IReversableIterator[ValueType[Iterator], Iterator, ReverseIterator] */, ReverseIterator /* <: IReverseIterator[ValueType[Iterator], Iterator, ReverseIterator] */](
    container: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IBidirectionalContainer<Iterator, ReverseIterator> */ js.Any
  ): ReverseIterator = js.native
  def rend[T](container: js.Array[T]): ReverseIterator[T] = js.native
  def rend[Iterator /* <: IReversableIterator[ValueType[Iterator], Iterator, ReverseIterator] */, ReverseIterator /* <: IReverseIterator[ValueType[Iterator], Iterator, ReverseIterator] */](
    container: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IBidirectionalContainer<Iterator, ReverseIterator> */ js.Any
  ): ReverseIterator = js.native
  def size(
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ISize */ js.Any
  ): Double = js.native
  def size[T](source: js.Array[T]): Double = js.native
}


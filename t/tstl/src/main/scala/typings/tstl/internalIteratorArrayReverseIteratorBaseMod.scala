package typings.tstl

import typings.tstl.baseContainerIContainerMod.IContainer
import typings.tstl.internalContainerLinearArrayContainerMod.ArrayContainer
import typings.tstl.internalIteratorArrayIteratorBaseMod.ArrayIteratorBase
import typings.tstl.internalIteratorReverseIteratorMod.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/iterator/ArrayReverseIteratorBase", JSImport.Namespace)
@js.native
object internalIteratorArrayReverseIteratorBaseMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.tstl.functionalIPointerMod.IPointer because var conflicts: value. Inlined 
  - typings.tstl.iteratorIForwardIteratorMod.IForwardIterator because var conflicts: value. Inlined 
  - typings.tstl.iteratorIBidirectionalIteratorMod.IBidirectionalIterator because var conflicts: value. Inlined 
  - typings.tstl.iteratorIRandomAccessIteratorMod.IRandomAccessIterator because var conflicts: value. Inlined index, advance */ @js.native
  abstract class ArrayReverseIteratorBase[T /* <: ElemT */, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseT, ElemT] */, ArrayT /* <: ArrayContainer[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, IteratorT /* <: ArrayIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ReverseT /* <: ArrayReverseIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ElemT] () extends ReverseIterator[T, SourceT, IteratorT, ReverseT, ElemT] {
    /**
      * @inheritDoc
      */
    /**
      * Advance iterator.
      *
      * @param n Step to advance.
      * @return The advanced iterator.
      */
    def advance(n: Double): ReverseT = js.native
    /**
      * @inheritDoc
      */
    /**
      * Get index.
      *
      * @return The index.
      */
    def index(): Double = js.native
    /**
      * @inheritDoc
      */
    def value(`val`: T): js.Any = js.native
  }
  
}


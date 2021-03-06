package typings.twilioDashSync.libUtilsTreeMod

import typings.std.Iterable
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property length
  */
@JSImport("twilio-sync/lib/utils/tree", "TreeMap")
@js.native
class TreeMap[K, V] ()
  extends Map[K, V]
     with Iterable[js.Tuple2[K, V]] {
  def this(less: Less[K]) = this()
  def this(less: Less[K], equal: Equal[K]) = this()
  var count: js.Any = js.native
  var getNode: js.Any = js.native
  var isEqual: js.Any = js.native
  var isLessThan: js.Any = js.native
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator_TreeMap: js.Function0[IterableIterator[js.Tuple2[K, V]]] = js.native
  var rebalance: js.Any = js.native
  var root: js.Any = js.native
  var rotateLeft: js.Any = js.native
  var rotateRight: js.Any = js.native
  val size: Double = js.native
  def clear(): Unit = js.native
  def delete(key: K): Unit = js.native
  /* CompleteClass */
  override def get(key: K): V = js.native
  def getIterator(): IterableIterator[js.Tuple2[K, V]] = js.native
  def getIterator(key: K): IterableIterator[js.Tuple2[K, V]] = js.native
  def getReverseIterator(): IterableIterator[js.Tuple2[K, V]] = js.native
  def getReverseIterator(key: K): IterableIterator[js.Tuple2[K, V]] = js.native
  def insert(key: K, value: V): Unit = js.native
  /* CompleteClass */
  override def set(key: K, value: V): Unit = js.native
}


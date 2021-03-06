package typings.immutable.Immutable

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Set[T]
  extends typings.immutable.Immutable.Collection.Set[T] {
  /**
    * The number of items in this Set.
    */
  val size: Double = js.native
  // Persistent changes
  /**
    * Returns a new Set which also includes this value.
    *
    * Note: `add` can be used in `withMutations`.
    */
  def add(value: T): this.type = js.native
  /**
    * @see `Map#asImmutable`
    */
  def asImmutable(): this.type = js.native
  /**
    * Note: Not all methods can be used on a mutable collection or within
    * `withMutations`! Check the documentation for each method to see if it
    * mentions being safe to use in `withMutations`.
    *
    * @see `Map#asMutable`
    */
  def asMutable(): this.type = js.native
  /**
    * Returns a new Set containing no values.
    *
    * Note: `clear` can be used in `withMutations`.
    */
  def clear(): this.type = js.native
  /**
    * Returns a new Set which excludes this value.
    *
    * Note: `delete` can be used in `withMutations`.
    *
    * Note: `delete` **cannot** be safely used in IE8, use `remove` if
    * supporting old browsers.
    *
    * @alias remove
    */
  def delete(value: T): this.type = js.native
  /**
    * Returns a Set which has removed any values not also contained
    * within `collections`.
    *
    * Note: `intersect` can be used in `withMutations`.
    */
  def intersect(collections: Iterable[T]*): this.type = js.native
  def merge[C](collections: Iterable[C]*): Set[T | C] = js.native
  def remove(value: T): this.type = js.native
  /**
    * Returns a Set excluding any values contained within `collections`.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { OrderedSet } = require('immutable')
    * OrderedSet([ 1, 2, 3 ]).subtract([1, 3])
    * // OrderedSet [2]
    * ```
    *
    * Note: `subtract` can be used in `withMutations`.
    */
  def subtract(collections: Iterable[T]*): this.type = js.native
  /**
    * Returns a Set including any value from `collections` that does not already
    * exist in this Set.
    *
    * Note: `union` can be used in `withMutations`.
    * @alias merge
    * @alias concat
    */
  def union[C](collections: Iterable[C]*): Set[T | C] = js.native
  /**
    * @see `Map#wasAltered`
    */
  def wasAltered(): Boolean = js.native
  // Transient changes
  /**
    * Note: Not all methods can be used on a mutable collection or within
    * `withMutations`! Check the documentation for each method to see if it
    * mentions being safe to use in `withMutations`.
    *
    * @see `Map#withMutations`
    */
  def withMutations(mutator: js.Function1[/* mutable */ this.type, _]): this.type = js.native
}

@JSGlobal("Immutable.Set")
@js.native
object Set extends js.Object {
  def apply(): Set[_] = js.native
  def apply[T](collection: Iterable[T]): Set[T] = js.native
  def fromKeys(obj: StringDictionary[js.Any]): Set[String] = js.native
  /**
    * `Set.fromKeys()` creates a new immutable Set containing the keys from
    * this Collection or JavaScript Object.
    */
  def fromKeys[T](iter: Collection[T, _]): Set[T] = js.native
  /**
    * `Set.intersect()` creates a new immutable Set that is the intersection of
    * a collection of other sets.
    *
    * ```js
    * const { Set } = require('immutable')
    * const intersected = Set.intersect([
    *   Set([ 'a', 'b', 'c' ])
    *   Set([ 'c', 'a', 't' ])
    * ])
    * // Set [ "a", "c"" ]
    * ```
    */
  def intersect[T](sets: Iterable[Iterable[T]]): Set[T] = js.native
  /**
    * True if the provided value is a Set
    */
  def isSet(maybeSet: js.Any): /* is immutable.Immutable.Set<any> */ Boolean = js.native
  /**
    * Creates a new Set containing `values`.
    */
  def of[T](values: T*): Set[T] = js.native
  /**
    * `Set.union()` creates a new immutable Set that is the union of a
    * collection of other sets.
    *
    * ```js
    * const { Set } = require('immutable')
    * const unioned = Set.union([
    *   Set([ 'a', 'b', 'c' ])
    *   Set([ 'c', 'a', 't' ])
    * ])
    * // Set [ "a", "b", "c", "t"" ]
    * ```
    */
  def union[T](sets: Iterable[Iterable[T]]): Set[T] = js.native
}

@JSGlobal("Immutable.set")
@js.native
object set extends js.Object {
  def apply[V, C /* <: StringDictionary[V] */](collection: C, key: String, value: V): C = js.native
  def apply[V, C /* <: js.Array[V] */](collection: C, key: Double, value: V): C = js.native
  def apply[C, K /* <: String */](
    `object`: C,
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
  ): C = js.native
  def apply[K, V, C /* <: Collection[K, V] */](collection: C, key: K, value: V): C = js.native
}


package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.List
import typings.cypress.typesLodashMod.ValueIteratee
import typings.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPullAllBy3x4[T1] extends js.Object {
  def apply[T2](iteratee: ValueIteratee[T1 | T2]): LodashPullAllBy3x5[T1, T2] = js.native
  def apply[T2](iteratee: ValueIteratee[T1 | T2], values: List[T2]): js.Array[T1] = js.native
  def apply[T2](iteratee: __, values: List[T2]): LodashPullAllBy3x6[T1, T2] = js.native
}


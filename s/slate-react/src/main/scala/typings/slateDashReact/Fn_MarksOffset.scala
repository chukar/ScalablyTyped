package typings.slateDashReact

import typings.immutable.Immutable.List
import typings.immutable.Immutable.Set
import typings.slate.slateMod.Editor
import typings.slate.slateMod.Mark
import typings.slate.slateMod.MarkJSON
import typings.slate.slateMod.MarkProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_MarksOffset extends js.Object {
  def apply(path: List[Double], offset: Double, text: String): Editor = js.native
  def apply(
    path: List[Double],
    offset: Double,
    text: String,
    marks: js.Array[String | MarkProperties | MarkJSON | Mark]
  ): Editor = js.native
  def apply(
    path: List[Double],
    offset: Double,
    text: String,
    marks: Set[String | MarkProperties | MarkJSON | Mark]
  ): Editor = js.native
}


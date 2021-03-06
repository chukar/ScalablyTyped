package typings.intlDashRelativeformat

import typings.intlDashRelativeformat.libTypesMod.SUPPORTED_FIELD
import typings.std.Date
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-relativeformat/lib/diff", JSImport.Namespace)
@js.native
object libDiffMod extends js.Object {
  def default(from: Double, to: Double): Record[SUPPORTED_FIELD, Double] = js.native
  def default(from: Double, to: Date): Record[SUPPORTED_FIELD, Double] = js.native
  def default(from: Date, to: Double): Record[SUPPORTED_FIELD, Double] = js.native
  def default(from: Date, to: Date): Record[SUPPORTED_FIELD, Double] = js.native
}


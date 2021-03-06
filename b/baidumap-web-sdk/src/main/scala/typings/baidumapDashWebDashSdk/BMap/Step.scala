package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Step extends js.Object {
  def getDescription(includeHtml: Boolean): String = js.native
  def getDistance(): String | Double = js.native
  def getDistance(format: Boolean): String | Double = js.native
  def getIndex(): Double = js.native
  def getPoint(): Point = js.native
  def getPosition(): Point = js.native
}


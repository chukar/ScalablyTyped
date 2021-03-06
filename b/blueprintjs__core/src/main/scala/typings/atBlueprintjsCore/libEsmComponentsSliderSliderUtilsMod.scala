package typings.atBlueprintjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/slider/sliderUtils", JSImport.Namespace)
@js.native
object libEsmComponentsSliderSliderUtilsMod extends js.Object {
  def argMin[T](values: js.Array[T], argFn: js.Function1[/* value */ T, _]): js.UndefOr[T] = js.native
  def fillValues[T](values: js.Array[T], startIndex: Double, endIndex: Double, fillValue: T): Unit = js.native
  def formatPercentage(ratio: Double): String = js.native
}


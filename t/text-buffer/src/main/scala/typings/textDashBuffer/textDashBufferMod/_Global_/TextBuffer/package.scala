package typings.textDashBuffer.textDashBufferMod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TextBuffer {
  /** The types usable when constructing a point via the Point::fromObject method. */
  type PointCompatible = PointLike | (js.Tuple2[Double, Double])
  /** The types usable when constructing a range via the Range::fromObject method. */
  type RangeCompatible = RangeLike | (js.Tuple2[PointLike | (js.Tuple2[Double, Double]), PointLike | (js.Tuple2[Double, Double])])
}

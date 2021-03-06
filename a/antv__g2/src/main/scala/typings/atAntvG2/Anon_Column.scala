package typings.atAntvG2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  /**
    * 一般的柱状图占比 1/2
    */
  var column: Double
  /**
    * 多层的饼图、环图
    */
  var multiplePie: Double
  /**
    * 玫瑰图柱状占比 1
    */
  var rose: Double
}

object Anon_Column {
  @scala.inline
  def apply(column: Double, multiplePie: Double, rose: Double): Anon_Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], multiplePie = multiplePie.asInstanceOf[js.Any], rose = rose.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Column]
  }
}


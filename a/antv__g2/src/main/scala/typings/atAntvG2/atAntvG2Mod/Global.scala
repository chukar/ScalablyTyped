package typings.atAntvG2.atAntvG2Mod

import typings.atAntvG2.Anon_Column
import typings.atAntvG2.atAntvG2Strings.canvas
import typings.atAntvG2.atAntvG2Strings.dark
import typings.atAntvG2.atAntvG2Strings.default
import typings.atAntvG2.atAntvG2Strings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@antv/g2", "Global")
@js.native
class Global () extends js.Object {
  var animate: Boolean = js.native
  /**
    * 更改默认的颜色 --不推荐
    */
  var colors: js.Array[String] = js.native
  var colors_16: js.Array[String] = js.native
  var colors_24: js.Array[String] = js.native
  var colors_pie: js.Array[String] = js.native
  var colors_pie_16: js.Array[String] = js.native
  var connectNulls: Boolean = js.native
  var fontFamily: String = js.native
  var renderer: canvas | svg = js.native
  /**
    * 折线图、区域图、path 当只有一个数据时，是否显示成点
    */
  var showSinglePoint: Boolean = js.native
  var snapArray: js.Array[Double] = js.native
  /**
    * 指定固定 tick 数的逼近值
    */
  var snapCountArray: js.Array[Double] = js.native
  var trackable: Boolean = js.native
  var version: String = js.native
  /**
    * 宽度所占的分类的比例
    */
  var widthRatio: Anon_Column = js.native
  @JSName("setTheme")
  def setTheme_dark(option: dark): Unit = js.native
  @JSName("setTheme")
  def setTheme_default(option: default): Unit = js.native
}


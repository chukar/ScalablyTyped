package typings.amapDashJsDashApi.AMap

import typings.amapDashJsDashApi.AMap.ContextMenu.Options
import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.ContextMenu")
@js.native
/**
  * 地图右键菜单
  * @param options 选项
  */
class ContextMenu_[ExtraData] () extends Overlay[ExtraData] {
  def this(options: Options) = this()
  /**
    * 右键菜单中添加菜单项
    * @param text 菜单显示内容
    * @param fn 该菜单下需进行的操作
    * @param num 当前菜单项在右键菜单中的排序位置，以0开始
    */
  def addItem(text: String, fn: js.ThisFunction0[/* this */ HTMLLIElement, Unit]): Unit = js.native
  def addItem(text: String, fn: js.ThisFunction0[/* this */ HTMLLIElement, Unit], num: Double): Unit = js.native
  /**
    * 关闭右键菜单
    */
  def close(): Unit = js.native
  /**
    * 在地图的指定位置打开右键菜单。
    * @param map 目标地图
    * @param position 打开位置经纬度
    */
  def open(map: Map, position: LocationValue): Unit = js.native
  /**
    * 删除一个菜单项
    * @param text 菜单显示内容
    * @param fn 该菜单下需进行的操作
    */
  def removeItem(text: String, fn: js.ThisFunction0[/* this */ HTMLLIElement, Unit]): Unit = js.native
}


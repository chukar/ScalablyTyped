package typings.ngDashGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlugin extends js.Object {
  def init(childScope: IGridScope, gridInstance: IGridInstance, services: js.Any): Unit
}

object IPlugin {
  @scala.inline
  def apply(init: (IGridScope, IGridInstance, js.Any) => Unit): IPlugin = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction3(init))
  
    __obj.asInstanceOf[IPlugin]
  }
}


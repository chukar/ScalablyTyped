package typings.inversifyDashExpressDashUtils.inversifyDashExpressDashUtilsMod

import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces.HandlerDecorator
import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils", "httpHead")
@js.native
object httpHead extends js.Object {
  def apply(path: String, middleware: Middleware*): HandlerDecorator = js.native
}


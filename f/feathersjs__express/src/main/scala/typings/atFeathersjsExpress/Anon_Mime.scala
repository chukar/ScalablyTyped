package typings.atFeathersjsExpress

import typings.express.Typeofm
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Handler
import typings.serveDashStatic.serveDashStaticMod.ServeStaticOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Mime extends js.Object {
  var mime: Typeofm = js.native
  def apply(root: String): Handler = js.native
  def apply(root: String, options: ServeStaticOptions): Handler = js.native
  def serveStatic(root: String): Handler = js.native
  def serveStatic(root: String, options: ServeStaticOptions): Handler = js.native
}


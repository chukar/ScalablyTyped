package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object App {
  import typings.uniDashApp.AnyObject

  type AppConstructor = js.Function1[
    /* options */ (AppInstance[AnyObject with AppInstance[js.Object]]) with AnyObject with AppInstance[js.Object], 
    Unit
  ]
  type GetApp = js.Function1[/* opts */ js.UndefOr[GetAppOption], AppInstance[AnyObject] with AnyObject]
}

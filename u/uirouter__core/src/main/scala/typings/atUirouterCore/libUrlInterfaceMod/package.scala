package typings.atUirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUrlInterfaceMod {
  import typings.atUirouterCore.libRouterMod.UIRouter
  import typings.atUirouterCore.libStateInterfaceMod.TargetStateDef
  import typings.atUirouterCore.libStateMod.TargetState

  type UrlRuleHandlerFn = js.Function3[
    /* matchValue */ js.UndefOr[js.Any], 
    /* url */ js.UndefOr[UrlParts], 
    /* router */ js.UndefOr[UIRouter], 
    String | TargetState | TargetStateDef | Unit
  ]
  type UrlRuleMatchFn = js.Function2[/* url */ js.UndefOr[UrlParts], /* router */ js.UndefOr[UIRouter], js.Any]
}

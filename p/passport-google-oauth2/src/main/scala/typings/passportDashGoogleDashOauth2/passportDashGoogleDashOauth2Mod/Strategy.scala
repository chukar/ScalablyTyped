package typings.passportDashGoogleDashOauth2.passportDashGoogleDashOauth2Mod

import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-google-oauth2", "Strategy")
@js.native
class Strategy protected () extends js.Object {
  def this(verify: VerifyFunction) = this()
  def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequestAndParams) = this()
  def this(options: StrategyOptions, verify: VerifyFunction) = this()
  var name: String = js.native
  def authenticate(req: Request[ParamsDictionary]): Unit = js.native
  def authenticate(req: Request[ParamsDictionary], options: js.Object): Unit = js.native
}


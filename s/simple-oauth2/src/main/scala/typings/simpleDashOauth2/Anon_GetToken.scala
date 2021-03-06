package typings.simpleDashOauth2

import typings.simpleDashOauth2.simpleDashOauth2Mod.PasswordTokenConfig
import typings.simpleDashOauth2.simpleDashOauth2Mod.Token
import typings.simpleDashOauth2.simpleDashOauth2Mod.WreckHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GetToken extends js.Object {
  /** Returns the Access Token Object */
  def getToken(params: PasswordTokenConfig): js.Promise[Token] = js.native
  def getToken(params: PasswordTokenConfig, httpOptions: WreckHttpOptions): js.Promise[Token] = js.native
}


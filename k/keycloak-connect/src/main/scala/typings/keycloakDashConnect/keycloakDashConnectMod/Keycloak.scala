package typings.keycloakDashConnect.keycloakDashConnectMod

import typings.express.expressMod.Request
import typings.express.expressMod.RequestHandler
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keycloak extends js.Object {
  def accessDenied(request: Request[ParamsDictionary], response: Response): Unit = js.native
  def accountUrl(): String = js.native
  def authenticated(request: Request[ParamsDictionary]): Unit = js.native
  def deauthenticated(request: Request[ParamsDictionary]): Unit = js.native
  def getAccount(token: Token): js.Promise[_] = js.native
  def getGrant(request: Request[ParamsDictionary], response: Response): js.Promise[Grant] = js.native
  def getGrantFromCode(code: String, request: Request[ParamsDictionary], response: Response): js.Promise[Grant] = js.native
  def loginUrl(uuid: String, redirectUrl: String): String = js.native
  def logoutUrl(redirectUrl: String): String = js.native
  def middleware(): RequestHandler[ParamsDictionary] = js.native
  def middleware(options: MiddlewareOptions): RequestHandler[ParamsDictionary] = js.native
  def protect(): RequestHandler[ParamsDictionary] = js.native
  def protect(spec: String): RequestHandler[ParamsDictionary] = js.native
  def protect(spec: SpecHandler): RequestHandler[ParamsDictionary] = js.native
  def redirectToLogin(request: Request[ParamsDictionary]): Boolean = js.native
  def storeGrant(grant: Grant, request: Request[ParamsDictionary], response: Response): Grant = js.native
  def unstoreGrant(sessionId: String): Unit = js.native
}


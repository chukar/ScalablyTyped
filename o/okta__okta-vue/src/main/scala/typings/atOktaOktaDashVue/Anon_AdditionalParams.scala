package typings.atOktaOktaDashVue

import typings.atOktaOktaDashVue.atOktaOktaDashVueMod.OktaVuePlugin.OktaOpenIDOptions
import typings.vue.typesVueMod.Vue
import typings.vueDashRouter.typesRouterMod.NavigationGuard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AdditionalParams extends js.Object {
  def authRedirectGuard(): js.Promise[NavigationGuard[Vue]] = js.native
  def getAccessToken(): js.Promise[String] = js.native
  def getFromUri(): String = js.native
  def getIdToken(): js.Promise[String] = js.native
  def getUser(): js.Promise[_] = js.native
  def handleAuthentication(): js.Promise[Unit] = js.native
  def isAuthenticated(): js.Promise[Boolean] = js.native
  def loginRedirect(): Unit = js.native
  def loginRedirect(fromUri: String): Unit = js.native
  def loginRedirect(fromUri: String, additionalParams: OktaOpenIDOptions): Unit = js.native
  def logout(): js.Promise[Unit] = js.native
}


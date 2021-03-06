package typings.jsprintmanager.jsprintmanagerMod.JSPM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsprintmanager", "JSPM.JSPrintManager")
@js.native
object JSPrintManager extends js.Object {
  var WS: JSPMWebSocket = js.native
  var auto_reconnect: Boolean = js.native
  val websocket_status: WSStatus = js.native
  def getPrinters(): js.Promise[js.Object] = js.native
  def getPrintersInfo(): js.Promise[js.Object] = js.native
  def showAbout(): js.Promise[_] = js.native
  def start(): js.Promise[Unit] = js.native
  def start(secure: Boolean): js.Promise[Unit] = js.native
  def start(secure: Boolean, host: String): js.Promise[Unit] = js.native
  def start(secure: Boolean, host: String, port: Double): js.Promise[Unit] = js.native
  def stop(): Unit = js.native
  def updateClient(): js.Promise[_] = js.native
}


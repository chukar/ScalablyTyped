package typings.puppeteer.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("puppeteer", "connect")
@js.native
object connect extends js.Object {
  def apply(): js.Promise[Browser] = js.native
  def apply(options: ConnectOptions): js.Promise[Browser] = js.native
}


package typings.easyDashXapiDashSupertest.cryptoMod

import typings.easyDashXapiDashSupertest.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "pseudoRandomBytes")
@js.native
object pseudoRandomBytes extends js.Object {
  def apply(size: Double): Buffer = js.native
  def apply(size: Double, callback: js.Function2[/* err */ Error, /* buf */ Buffer, Unit]): Unit = js.native
}


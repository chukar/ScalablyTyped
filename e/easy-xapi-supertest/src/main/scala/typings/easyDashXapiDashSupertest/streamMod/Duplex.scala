package typings.easyDashXapiDashSupertest.streamMod

import typings.easyDashXapiDashSupertest.Buffer
import typings.easyDashXapiDashSupertest.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", "Duplex")
@js.native
class Duplex ()
  extends Readable
     with WritableStream {
  def this(opts: DuplexOptions) = this()
  def _write(data: String, encoding: String, callback: js.Function): Unit = js.native
  def _write(data: Buffer, encoding: String, callback: js.Function): Unit = js.native
}


package typings.vscodeDashLanguageclient.libClientMod

import typings.node.NodeJS.Process
import typings.node.childUnderscoreProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "IPCMessageWriter")
@js.native
class IPCMessageWriter protected ()
  extends typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.IPCMessageWriter {
  def this(process: Process) = this()
  def this(process: ChildProcess) = this()
}


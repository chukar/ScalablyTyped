package typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod

import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.InitializeParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.InitializeResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "InitializeRequest")
@js.native
object InitializeRequest extends js.Object {
  val `type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[
    InitializeParams, 
    InitializeResult, 
    typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.InitializeError, 
    Unit
  ] = js.native
}


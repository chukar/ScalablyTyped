package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.DocumentFormattingParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "DocumentFormattingRequest")
@js.native
object DocumentFormattingRequest extends js.Object {
  val `type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[
    DocumentFormattingParams, 
    (js.Array[
      typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextEdit
    ]) | Null, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}


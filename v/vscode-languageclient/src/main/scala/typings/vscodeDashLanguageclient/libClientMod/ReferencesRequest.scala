package typings.vscodeDashLanguageclient.libClientMod

import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.ReferenceParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "ReferencesRequest")
@js.native
object ReferencesRequest extends js.Object {
  val `type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[
    ReferenceParams, 
    (js.Array[
      typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Location
    ]) | Null, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}


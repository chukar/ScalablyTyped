package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-types", "DocumentLink")
@js.native
class DocumentLink () extends js.Object {
  /**
    * A data entry field that is preserved on a document link between a
    * DocumentLinkRequest and a DocumentLinkResolveRequest.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * The range this link applies to.
    */
  var range: Range = js.native
  /**
    * The uri this link points to.
    */
  var target: js.UndefOr[String] = js.native
}

@JSImport("vscode-languageserver-types", "DocumentLink")
@js.native
object DocumentLink extends js.Object {
  /**
    * Creates a new DocumentLink literal.
    */
  def create(range: Range): DocumentLink = js.native
  def create(range: Range, target: String): DocumentLink = js.native
  def create(range: Range, target: String, data: js.Any): DocumentLink = js.native
  /**
    * Checks whether the given literal conforms to the [DocumentLink](#DocumentLink) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DocumentLink */ Boolean = js.native
}


package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var range: Range
  var uri: String
}

@JSImport("vscode-languageserver-types", "Location")
@js.native
object Location extends js.Object {
  /**
    * Creates a Location literal.
    * @param uri The location's uri.
    * @param range The location's range.
    */
  def create(uri: String, range: Range): Location = js.native
  /**
    * Checks whether the given literal conforms to the [Location](#Location) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Location */ Boolean = js.native
}


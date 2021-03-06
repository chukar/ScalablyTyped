package typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "DocumentSymbol")
@js.native
class DocumentSymbol ()
  extends typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentSymbol

@JSImport("vscode-languageserver-protocol", "DocumentSymbol")
@js.native
object DocumentSymbol extends js.Object {
  def create(
    name: String,
    detail: js.UndefOr[scala.Nothing],
    kind: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SymbolKind,
    range: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range,
    selectionRange: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range
  ): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentSymbol = js.native
  def create(
    name: String,
    detail: js.UndefOr[scala.Nothing],
    kind: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SymbolKind,
    range: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range,
    selectionRange: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range,
    children: js.Array[
      typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentSymbol
    ]
  ): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentSymbol = js.native
  /**
    * Creates a new symbol information literal.
    *
    * @param name The name of the symbol.
    * @param detail The detail of the symbol.
    * @param kind The kind of the symbol.
    * @param range The range of the symbol.
    * @param selectionRange The selectionRange of the symbol.
    * @param children Children of the symbol.
    */
  def create(
    name: String,
    detail: String,
    kind: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SymbolKind,
    range: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range,
    selectionRange: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range
  ): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentSymbol = js.native
  def create(
    name: String,
    detail: String,
    kind: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SymbolKind,
    range: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range,
    selectionRange: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range,
    children: js.Array[
      typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentSymbol
    ]
  ): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentSymbol = js.native
  /**
    * Checks whether the given literal conforms to the [DocumentSymbol](#DocumentSymbol) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DocumentSymbol */ Boolean = js.native
}


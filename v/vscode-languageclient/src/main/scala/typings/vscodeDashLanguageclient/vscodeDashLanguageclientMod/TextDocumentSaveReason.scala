package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import typings.vscodeDashLanguageclient.vscodeDashLanguageclientNumbers.`1`
import typings.vscodeDashLanguageclient.vscodeDashLanguageclientNumbers.`2`
import typings.vscodeDashLanguageclient.vscodeDashLanguageclientNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "TextDocumentSaveReason")
@js.native
object TextDocumentSaveReason extends js.Object {
  /**
    * Automatic after a delay.
    */
  val AfterDelay: `2` = js.native
  /**
    * When the editor lost focus.
    */
  val FocusOut: `3` = js.native
  /**
    * Manually triggered, e.g. by the user pressing save, by starting debugging,
    * or by an API call.
    */
  val Manual: `1` = js.native
}


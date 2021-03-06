package typings.atOracleOraclejet.ojmessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ojMessage {
  import typings.atOracleOraclejet.Anon_ActionClose
  import typings.atOracleOraclejet.Anon_ActionCloseElementEndCallback
  import typings.atOracleOraclejet.Anon_Message
  import typings.std.CustomEvent

  type ojAnimateEnd = CustomEvent[Anon_ActionClose]
  type ojAnimateStart = CustomEvent[Anon_ActionCloseElementEndCallback]
  type ojClose = CustomEvent[Anon_Message]
}

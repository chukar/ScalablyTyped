package typings.ftps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ftpsMod {
  import typings.std.Error

  type FTPCallbackFunction = js.Function2[/* err */ Error | Null, /* results */ FTPResults, js.Any]
}

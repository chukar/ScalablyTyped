package typings.favicons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object faviconsMod {
  import typings.std.Error

  type Callback = js.Function2[/* error */ Error | Null, /* response */ FavIconResponse, Unit]
}
